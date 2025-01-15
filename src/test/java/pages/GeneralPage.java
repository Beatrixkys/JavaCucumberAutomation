package pages;

import static org.junit.Assert.assertEquals;

import utils.WebHandlers;

public class GeneralPage {

    public void assertHeaders(String[] headerLocs, String page){
        String[] components =  ["Subtitle","Header","Text"]; 
        for (String header in headerLocs){
             for (String component in components){
                String locator = page+"."header+component;
                if LocatorRepository.get(locator) != null{
                    if(!WebHandlers.booleanElementDisplayed(locator)){
                        WebHandlers.scrollDown();
                    }
                    String actual = WebHandlers.getText (locator);
                    Assert.assertEquals (actual, WebHandlers.getValue);
                } else{
                     break;
                }
            }
        }
    }

    public Boolean checkDevLink(String url){
        if(url.contains("dev")){
            AllureSettings.logToReport( "Tag" +it.next()+"is in dev :" + url);
            return true;
        } else{
            return false; 
        }
    }
    public void checkEmptyLink(String url){
        if(url == null || url.isEmpty()){
            AllureSettings.logToReport( "Tag" +it.next()+" is empty");
            return true;
        } else{
            return false; 
        }
    }

    public void checkBrokenLink(String url){
        try {
            huc = (HttpURLConnection)(new URL(url).openConnection());
            huc.setRequestMethod("HEAD");
            huc.connect();
            respCode = huc.getResponseCode();

        if(respCode >= 400){
            AllureSettings.logToReport(url + " is a broken link");
            } else {
            AllureSettings.logToReport(url + " is a valid link");
        }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

    

