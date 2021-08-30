
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


import java.util.concurrent.TimeUnit;

public class TestSeleniumJunit {
    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
        FirefoxOptions ops = new FirefoxOptions();
        ops.addArguments("--headed");
        driver = new FirefoxDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }


    public void getTitle() {
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.contains("Google"));
    }
        @Test
        public void testImplicit()  {
            driver.get("https://opensource-demo.orangehrmlive.com");
            driver.findElement(By.xpath("//input[@name = 'txtUsername']")).sendKeys("Admin");
        }
        @After
        public void finishTest () {
        driver.close();
        }
    }
