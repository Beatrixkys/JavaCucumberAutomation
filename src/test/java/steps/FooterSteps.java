package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.TabMenuPage;

public class FooterSteps {

    @Given ("I validate Footer Header section")
    public void validateFooterHeader(){
        //Header, subheader, subscription

    }

    @And ("I validate Footer Company Links section")
    public void validateFooterCompany(){
        //about us, awards, help support, about forex forest, demo product
        //test display, get url+validate validity
    }


    @And ("I validate Footer Quick Links section")
    public void validateFooterQuickLinks(){
        //company news, blog, webinar, market to trade, partner with us, career, faq
    }

    @And ("I validate Disclaimer section")
    public void validateFooterDisclaimer(){
    }
    
    @And ("I validate Copyright section")
    public void validateFooterCopyright(){
    }


}
