package GroupProjectHomework;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends WebDriver{

    void navigate();

}
interface TakesScreenshot extends RemoteWebDriver {

    void getScreenshot();

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
}



