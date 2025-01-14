package tests;

import config.DriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.YouTubePage;
import utils.Constants;

public class YouTubeTest {
    private static YouTubePage youTubePage;

    @BeforeAll
    public static void setUp() {
        DriverManager.getDriver().get(Constants.BASE_URL);
        youTubePage = new YouTubePage(DriverManager.getDriver());
    }

    @Test
    public void testPlayMusic() {
        youTubePage.search("The Beatles Yay!");
        youTubePage.playFirstVideo();
    }

    @AfterAll
    public static void tearDown() {
        DriverManager.quitDriver();
    }
}