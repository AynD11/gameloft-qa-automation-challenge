import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTest {

    @Test
    public void homepageShouldLoadSuccessfully() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://play.ludigames.com");

        String currentUrl = driver.getCurrentUrl();

        assertTrue(currentUrl.contains("ludigames"));

        driver.quit();
    }

    @Test
    public void homepageShouldContainGames() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://play.ludigames.com");

        List games = driver.findElements(By.cssSelector("a.item"));

        assertTrue(games.size() > 0);

        driver.quit();
    }

    @Test
    public void clickingFirstGameShouldOpenGamePage() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://play.ludigames.com");

        try {
            driver.findElement(By.xpath("//*[contains(text(),'Agree and close')]")).click();
        } catch (Exception e) {
        }

        driver.findElement(By.cssSelector("a.item")).click();

        String currentUrl = driver.getCurrentUrl();

        assertTrue(currentUrl.contains("game.html?pID="));

        driver.quit();
    }

    @Test
    public void searchButtonShouldBeVisible() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://play.ludigames.com");

        try {
            driver.findElement(By.xpath("//*[contains(text(),'Agree and close')]")).click();
        } catch (Exception e) {
        }

        boolean searchExists =
                driver.findElements(By.cssSelector("svg")).size() > 0;

        assertTrue(searchExists);

        driver.quit();
    }
}