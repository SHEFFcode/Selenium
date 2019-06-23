import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/opt/local/bin/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucelabs.com");
        WebElement href = browser.findElement(By.xpath("//a[@href='/beta/login']"));
        List<WebElement> body = browser.findElements(By.tagName("div"));
        System.out.println("==========================================");
        System.out.println("Page source is below:");
        IntStream streamOfPage = browser.getPageSource().chars();
        System.out.println(browser.getPageSource());
        System.out.println("==========================================");
        System.out.println("I visited website and got the href " + href.isDisplayed());


        System.out.println("==========================================");
        boolean containsA =
                Pattern.compile(", ").splitAsStream("a, b, c").parallel().distinct().anyMatch(c -> c.equals("a"));

//        String outcome = streamOfString.collect(Collectors.joining(": "));


        System.out.println("Stream of string contains Continuous " + body.parallelStream().anyMatch(s -> s.getText().contains("Continuous")));

        browser.close();
    }
}
