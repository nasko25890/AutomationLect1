import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

public class TestWebDriver {

    private WebDriver driver;

    public static void main(String[] args) {}

    @BeforeSuite
    private final void setupTestSuite() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.edgedriver().setup();
        WebDriverManager.firefoxdriver().setup();
    }

    @BeforeMethod
    private final void setupMethod() {
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
    }

    @AfterMethod
    private final void testDownSetup() {
        if (this.driver != null) this.driver.close();

    }

    @DataProvider(name = "userData")
    public Object [] [] userData() {
        return new Object [] [] {
                {"BlaBlaBlo@abv.bg", "111111A"}
        };
    }
    @DataProvider(name = "userWrongData")
    public Object [] [] userWrongData() {
        return new Object [] [] {
                {"BlaBlaBlo@abv.bg", "111111B"}
        };
    }


    @Test(dataProvider = "userData")
    public void testSuccessfulLogin(String username, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://training.skillo-bg.com:4300");
        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4300/posts/all"));


        String getTitle = driver.getTitle();
        Assert.assertEquals(getTitle, "ISkillo" );

        WebElement loginLink = driver.findElement(By.id("nav-link-login"));
        wait.until(ExpectedConditions.visibilityOf(loginLink));
        loginLink.click();

        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4300/users/login"));


        WebElement singInElement;
        singInElement = driver.findElement(By.xpath("//p[text() = \"Sign in\"]"));
        wait.until(ExpectedConditions.visibilityOf(singInElement));


        WebElement usernamePassword = driver.findElement(By.id("defaultLoginFormUsername"));
        usernamePassword.sendKeys(username);

        WebElement pass = driver.findElement(By.xpath("//*[@id= \"defaultLoginFormPassword\"]"));
        pass.sendKeys(password);
        
        WebElement rememberMeCheckBox = driver.findElement(By.xpath("//*[@formcontrolname = \"rememberMe\"]"));
        rememberMeCheckBox.click();

        Assert.assertTrue(rememberMeCheckBox.isSelected(), "The checkbox is not check");

        WebElement singInButton = driver.findElement(By.id("sign-in-button"));
        wait.until(ExpectedConditions.elementToBeClickable(singInButton));
        singInButton.click();

        WebElement profileButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-link-profile")));
        Assert.assertTrue(profileButton.isDisplayed());





    }

    @Test(dataProvider = "userWrongData")
    private void testWrongPassword(String username, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://training.skillo-bg.com:4300");
        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4300/posts/all"));


        String getTitle = driver.getTitle();
        Assert.assertEquals(getTitle, "ISkillo" );

        WebElement loginLink = driver.findElement(By.id("nav-link-login"));
        wait.until(ExpectedConditions.visibilityOf(loginLink));
        loginLink.click();

        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4300/users/login"));


        WebElement singInElement;
        singInElement = driver.findElement(By.xpath("//p[text() = \"Sign in\"]"));
        wait.until(ExpectedConditions.visibilityOf(singInElement));


        WebElement usernamePassword = driver.findElement(By.id("defaultLoginFormUsername"));
        usernamePassword.sendKeys(username);

        WebElement pass = driver.findElement(By.xpath("//*[@id= \"defaultLoginFormPassword\"]"));
        pass.sendKeys(password);

        WebElement rememberMeCheckBox = driver.findElement(By.xpath("//*[@formcontrolname = \"rememberMe\"]"));
        rememberMeCheckBox.click();

        Assert.assertTrue(rememberMeCheckBox.isSelected(), "The checkbox is not check");

        WebElement singInButton = driver.findElement(By.id("sign-in-button"));
        wait.until(ExpectedConditions.elementToBeClickable(singInButton));
        singInButton.click();

        WebElement profileButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-link-profile")));
        Assert.assertTrue(profileButton.isDisplayed());

    }



}
