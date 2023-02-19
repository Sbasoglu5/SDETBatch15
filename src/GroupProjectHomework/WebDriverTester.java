package GroupProjectHomework;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver [] browsers={new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};
        for (WebDriver browser:browsers){
            browser.open();
            browser.close();
            System.out.println(browser.getTitle());
            // browser.navigate(); => Cannot resolve the method!!

        }
    }
}
