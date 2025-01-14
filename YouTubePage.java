package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YouTubePage {
    private WebDriver driver;

    // Locators
    private By searchBox = By.name("search_query");
    private By searchButton = By.id("search-icon-legacy");
    private By firstVideo = By.xpath("(//a[@id='video-title'])[1]");

    public YouTubePage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String query) {
        driver.findElement(searchBox).sendKeys(query);
        driver.findElement(searchButton).click();
    }

    public void playFirstVideo() {
        driver.findElement(firstVideo).click();
    }
}