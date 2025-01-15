package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.GeneralPage;

public class AboutPageSteps {
    GeneralPage generalPage = new GeneralPage();

    @Then ("I validate About Page headers")
    public void onProductsPage(){
        String [] headers = ["header","history","globalFootprint",
                            "trustedEA"]; 
        generalPage.assertHeaders(headers, "AboutPage");
    }
}
