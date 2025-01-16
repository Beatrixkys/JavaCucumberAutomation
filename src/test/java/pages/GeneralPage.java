package pages;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

import utils.WebHandlers;
import static utils.WebHandlers.scrollDown;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import reporting.AllureSettings;
import utils.LocatorRepository;

public class GeneralPage {

    public void assertHeaders(String[] headerLocs, String page){
        String[] components =  {"Subtitle","Header","Text"}; 
        for (String header : headerLocs){
             for (String component : components){
                String locator = component+page+"."+header; 
                if (LocatorRepository.get(locator) != null){
                    if(!WebHandlers.booleanElementDisplayed(locator)){
                        scrollDown();
                    }
                    assertEquals (WebHandlers.getText (locator), WebHandlers.getValue(locator));
                } else{
                     break;
                }
            }
        }
    }

    public Boolean checkDevLink(String url){
        if(url.contains("dev")){
            AllureSettings.logToReport( "Tag is in dev :" + url);
            return true;
        } else{
            return false; 
        }
    }
    public Boolean checkEmptyLink(String url){
        if(url == null || url.isEmpty()){
            AllureSettings.logToReport( "Tag is empty");
            return true;
        } else{
            return false; 
        }
    }

    public void checkBrokenLink(String url){
        try {
            HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
            huc.setRequestMethod("HEAD");
            huc.connect();
            int respCode = huc.getResponseCode();

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

    

