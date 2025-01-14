package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.GeneralPage;

public class SauceProductSteps {
    GeneralPage generalPage = new GeneralPage();

    @Then ("I validate home page headers")
    public void onProductsPage(){
        String [] headers = ["HomePage.header","HomePage.tradingFuture","HomePage.showcase"
                            "HomePage.advisor","HomePage.indicator","HomePage.awardWinning"
                            "HomePage.xPowerAI"]; 
        generalPage.assertHeaders(headers);
    }


}
