package class23;

public class WebDriverTester {
    public static void main(String[] args) {

        WebDriver webDriver=new Safari();
        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLogin();
        webDriver.closeBrowser();
        // an Array of type parent class can hold the objects of all the child classes
        /*Chrome chrome=new Chrome();
        Firefox firefox=new Firefox();
        Safari safari=new Safari();*/


        WebDriver [] browsers={new Chrome(), new Safari(), new Firefox()};

        for (WebDriver browser:browsers){
            browser.startBrowser();
            browser.openURL();
            browser.testLogin();
            browser.closeBrowser();
        }


    }
       /* Chrome googleChrome=new Chrome();
        googleChrome.startBrowser();
        googleChrome.openURL();
        googleChrome.testLogin();
        googleChrome.closeBrowser();

        Safari safari=new Safari();
        safari.startBrowser();
        safari.openURL();
        safari.testLogin();
        safari.closeBrowser();

        Firefox firefox=new Firefox();
        firefox.startBrowser();
        firefox.openURL();
        firefox.testLogin();
        firefox.closeBrowser();
    }*/
}
