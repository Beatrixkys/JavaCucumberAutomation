package steps;

import cucumber.api.java.en.Then;
import pages.GeneralPage;

public class HomePageSteps {
    GeneralPage generalPage = new GeneralPage();

    @Then ("I validate Home Page headers")
    public void onProductsPage(){
        String [] headers = {"header","tradingFuture","showcase",
                            "advisor","indicator","awardWinning",
                            "xPowerAI"}; 
        generalPage.assertHeaders(headers, "HomePage");
    }


}
