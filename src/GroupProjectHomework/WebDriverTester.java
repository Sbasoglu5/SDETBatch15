package GroupProjectHomework;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver [] webDriver={new FirefoxDriver(),new ChromeDriver(),new SafariDriver()};
        for (WebDriver w:webDriver){
            w.open();
            w.close();
            System.out.println(w.getTitle());
            //w.getScreenshot();
            // browser.navigate(); => Cannot resolve the method!!

        }
    }
}
