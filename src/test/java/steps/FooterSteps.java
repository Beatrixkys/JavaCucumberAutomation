package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.FooterPage;

public class FooterSteps {
   FooterPage footerPage = new FooterPage(); 

    @Given ("I validate Footer Header section")
    public void validateFooterHeader(){
        footerPage.validateHeader();
        footerPage.validateSubscriptionBox(); 
    }

    @And ("I validate Footer Company Links section")
    public void validateFooterCompany(){
        String [] links = ["aboutUs","awards","helpSupport"
                            "aboutForexForest","demoProduct"];
        footerPage.validateTitle("company"); 
        footerPage.checkLinks(links,"CompanyLink"); 
    }


    @And ("I validate Footer Quick Links section")
    public void validateFooterQuickLinks(){
        String [] links = ["companyNews","blog","webinar"
                            "marketToTrade","partnerWithUs","career",
                            "faq"];
        footerPage.validateTitle("quickLinks")
        footerPage.checkLinks(links,"QuickLink"); 
    }

    @And ("I validate Disclaimer section")
    public void validateFooterDisclaimer(){
        footerPage.validateDisclaimer();
    }
    
    @And ("I validate Copyright section")
    public void validateFooterCopyright(){
        String [] links = ["termsAndCondition","privacyPolicy"];
        footerPage.validateCopyright(); 
        footerPage.checkLinks(privacyPolicy,"Link"); 
    }


}
