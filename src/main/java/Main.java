import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/opt/local/bin/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucelabs.com");
        WebElement href = browser.findElement(By.xpath("//a[@href='/beta/login']"));
        System.out.println("==========================================");
        System.out.println("Page source is below:");
        System.out.println(browser.getPageSource());
        System.out.println("==========================================");
        System.out.println("I visited website and got the href " + href.isDisplayed());

        browser.close();
    }
}
