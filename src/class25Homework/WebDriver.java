package class25Homework;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Chrome Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the Chrome Window");
    }

    @Override
    public void findElement() {
        System.out.println("Find Chrome elements");
    }
}
class FireFoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Open FireFox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close FireFox Driver");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize FireFox Window");
    }

    @Override
    public void findElement() {
        System.out.println("Find FireFox elements");

    }
}
