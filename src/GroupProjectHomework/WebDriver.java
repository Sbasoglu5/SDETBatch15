package GroupProjectHomework;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface ScreenShot {

    void getScreenshot();

}
interface RemoteWebDriver extends ScreenShot, WebDriver{

    void navigate();

}

class ChromeDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Chrome browser is open");
    }

    @Override
    public void close() {
        System.out.println("Chrome browser is closed");
    }

    @Override
    public String getTitle() {
        return "Get a Chrome Title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to ChromeURL");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Chrome takes a screenshot");
    }
}
class FirefoxDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("FireFox browser is open");
    }

    @Override
    public void close() {
        System.out.println("FireFox browser is closed");
    }

    @Override
    public String getTitle() {
        return "Get a Firefox Title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to FireFoxURL");
    }

    @Override
    public void getScreenshot() {
        System.out.println("FireFox takes a screenshot");
    }
}
class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Safari browser is open");
    }

    @Override
    public void close() {
        System.out.println("Safari browser is closed");
    }

    @Override
    public String getTitle() {
        return "Get a Safari Title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to SafariURL");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Safari takes a screenshot");
    }
}



