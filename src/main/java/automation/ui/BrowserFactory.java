package automation.ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

class BrowserFactory {

    public static WebDriver getBrowser(String desiredBrowserName) throws Throwable {
        //String desiredBrowserName = System.getProperty("browser", "chrome");
        WebDriver desiredBrowser = null;

        switch(desiredBrowserName) {
            case "ie":
                desiredBrowser = IEBrowser.buildIEBrowser();
                break;
            case "chrome":
                desiredBrowser = ChromeBrowser.buildChromeBrowser();
                break;
            case "firefox":
                desiredBrowser = FirefoxBrowser.buildFirefoxBrowser();
                break;
            default:
                throw new NoClassDefFoundError() ;
        }
        desiredBrowser.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        return desiredBrowser;
    }
}
