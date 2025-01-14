package pages;

import static org.junit.Assert.assertEquals;

import utils.WebHandlers;

public class HomePage {
    public void verifyTitle(){
        WebHandlers.checkElementDisplayed("HomePage.headerTitle");
    }
    
}
