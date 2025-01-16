package steps;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import pages.GeneralPage;
import pages.HomePage;
import pages.LoginPage;
import utils.WebHandlers; 

public class GeneralSteps {

    GeneralPage generalPage = new GeneralPage(); 
    HomePage homePage = new HomePage(); 
    LoginPage loginPage = new LoginPage(); 

    @And("I check links")
    public void checkLinks(){
        List <WebElement> tags = WebHandlers.findElementLinks(); 
        Iterator<WebElement> it = tags.iterator();
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
                homePage.verifyTitle(); 
            case "Login": 
                loginPage.verifyTitle();
            default: 
                break; 
        }   
    }
    

}

