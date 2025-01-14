package pages;

import utils.WebHandlers;
import org.junit.Assert;

public class LoginPage {
    public void verifyTitle(){
        WebHandlers.checkElementDisplayed("LoginPage.loginTitle");
    }
    public void inputUsername(String username){
        WebHandlers.enterText("LoginPage.usernameInput", username);
    }
    public void inputPassword(String password){
        WebHandlers.enterText("LoginPage.passwordInput", password);
    }
    public void clickLogin(){
        WebHandlers.click("LoginPage.loginButton");
    }
    public void clickSignUp(){
        WebHandlers.click("LoginPage.signUpButton");
    }
    public void assertErrorMessage(String expected){
        String actual = WebHandlers.getText("LoginPage.errorMessage").toLowerCase();
        Assert.assertEquals(expected.toLowerCase(),actual);
    }
}
