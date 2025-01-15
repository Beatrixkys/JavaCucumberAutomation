package steps;

import cucumber.api.java.en.And;

public class GeneralSteps {

    @And("I check links")
    public void checkLinks(){
        Iterator<WebElement> it = WebHandlers.findElementLinks().iterator();
        while(it.hasNext()){
            String url = WebHandlers.getURL(it.next());
            if (generalPage.checkEmptyLink(url) && generalPage.checkDevLink(url))
                generalPage.checkBrokenLink(url); 
        }
    }

    @And ("I am on {string} Page")
    public void onCurrentPage(String pageName){
        switch (pageName){
            case "Home": 
                HomePage.verifyTitle(); 
            case "Login": 
                LoginPage.verifyTitle();
            default: 
                break; 
        }   
    }
    

}

