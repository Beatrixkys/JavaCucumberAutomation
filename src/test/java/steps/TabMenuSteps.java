package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.TabMenuPage;

public class TabMenuSteps {

     TabMenuPage menuPage = new TabMenuPage();

    @Given("I validate Tabs on Tab Menu")
    public void validateTabs(){
        String [] tabs = ["about","community","awards",
                        "products","helpSupport","account","registerForDemo"]; 
        menuPage.checkIfTabVisible();
        menuPage.checkTabs(tabs);  
    }

    @Given("I validate Products Dropdown on Tab Menu")
    public void validateTabs(){
        String [] tabs = ["xPowerAI","expertAdvisor","indicator"
                        "scripts","course"]; 
        menuPage.checkTabs(tabs);  
    }

    @And ("I click on {string} on Tab Menu")
    public void clickTab (String tabName){
        menuPage.checkIfTabVisible();
        WebHandlers.click("TabMenu."+tabName+"Tab"); 
    }
    
}
