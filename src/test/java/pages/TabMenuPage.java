package pages;

import static org.junit.Assert.assertEquals;

import utils.WebHandlers;

public class TabMenuPage {
    public void checkIfTabVisible(){
        if (!WebHandlers.isElementDisplayedBoolean("TabMenuPage.aboutTab")){
            WebHandlers.click("TabMenu.tabButton"); 
        }
    }

    public void checkTabs(String [] tabs){
        for (String tab in tabs){
            WebHandlers.checkElementDisplayed("TabMenu."+tab+"Tab"); 
        }
    }
    
}
