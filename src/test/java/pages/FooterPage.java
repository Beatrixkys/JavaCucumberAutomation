package pages;

import static org.junit.Assert.assertEquals;

import utils.WebHandlers;

public class FooterPage {
    public void validateHeader(){
        WebHandlers.checkElementDisplayed("Footer.headerButton");
        WebHandlers.checkElementDisplayed("Footer.headerSubtitle");
        assertEquals(WebHandlers.getText("Footer.headerSubtitle"),WebHandlers.getValue("Footer.headerSubtitle")); 
    }

    public void validateSubscriptionBox(){
        WebHandlers.checkElementDisplayed("Footer.subscribeTitle");
        assertEquals(WebHandlers.getText("Footer.subscribeTitle"),WebHandlers.getValue("Footer.subscribeTitle")); 
        WebHandlers.checkElementDisplayed("Footer.subscribeInputBox");
        WebHandlers.checkElementDisplayed("Footer.subscribeButton"); 
    }

    public void validateDisclaimer(){
        WebHandlers.checkElementDisplayed("Footer.disclaimerNotes");
        assertEquals(WebHandlers.getText("Footer.subscribeTitle"),WebHandlers.getValue("Footer.subscribeTitle")); 
    }

    public void validateCopyright(){
        WebHandlers.checkElementDisplayed("Footer.copyrightScheme");
        assertEquals(WebHandlers.getText("Footer.copyrightScheme"),WebHandlers.getValue("Footer.copyrightScheme")); 
    }

    public void validateTitle(String section){
        WebHandlers.checkElementDisplayed("Footer."+section+"Title");
        assertEquals(WebHandlers.getText("Footer."+section+"Title"),WebHandlers.getValue("Footer."+section+"Title")); 
    }

    public void checkLinks(String [] links, String linkType){
        for (String link in links){
            String loc = "Footer."+link+linkType
            //check display and name
            WebHandlers.checkElementDisplayed(loc);
            assertEquals(WebHandlers.getText(loc),WebHandlers.getValue(loc)); 
            //Check url
            String url = WebHandlers.getURL(WebHandlers.waitForElement(loc)); 
            GeneralPage.checkDevLink(url);
            GeneralPage.checkEmptyLink(url); 
            GeneralPage.checkBrokenLink(url);
        }
    }
    
}
