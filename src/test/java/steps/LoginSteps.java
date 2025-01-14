package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.LoginPage;

public class LoginSteps {

     LoginPage loginPage = new LoginPage();

    @Given("I login with username {string} and password {string}")
    public void login(String username, String password){
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);   
        loginPage.clickLogin();
    }

    @Then ("I click on Sign Up Button")
    public void clickSignUpButton(){
        loginPage.clickSignUp(); 
    }
    
}
