package class23;

public class WebDriver {

    public void startBrowser(){
        System.out.println("starting the browse");
    }
    public void openURL(){
        System.out.println("opening a url");
    }
    public void testLogin (){
        System.out.println("checking if login page works");
    }
    public void closeBrowser(){
        System.out.println("closing the browser");
    }
}
class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting Google Chrome");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the url in Google Chrome");
    }

    @Override
    public void testLogin() {
        System.out.println("Testing the login page in Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Google Chrome");
    }
}
class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting Safari");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the url in safari");
    }

    @Override
    public void testLogin() {
        System.out.println("Testing the login page in safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing safari");
    }
}
class Firefox extends WebDriver {
    @Override
    public void startBrowser() {
        System.out.println("Starting FireFox");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the url in FireFox");
    }

    @Override
    public void testLogin() {
        System.out.println("Testing the login page in FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing FireFox");
    }
}
