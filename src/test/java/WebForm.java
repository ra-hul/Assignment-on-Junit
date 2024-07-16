import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class WebForm {
    WebDriver driver;

    @BeforeAll
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
@DisplayName("Get Submission Message")
@Test
    public void submitForm() throws InterruptedException {
        driver.get("https://www.digitalunite.com/practice-webform-learners");


    List <WebElement> formControls = driver.findElements(By.className("form-control"));
        formControls.get(0).sendKeys("Rahul Paul");
        formControls.get(1).sendKeys("01775675786");
        formControls.get(2).sendKeys("07/12/2024");
        formControls.get(3).sendKeys("rahulshanto008@gmail.com");
        formControls.get(4).sendKeys("I am from Bangladesh, I have completed my graduation form dept of CSE.I want to be a SQA engineer");
        Utils.scroll(driver, 900);
        driver.findElement(By.id("edit-uploadocument-upload")).sendKeys("D://sign.jpg");
        Thread.sleep(4000);
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        driver.findElement(By.cssSelector("[type=checkbox]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("edit-submit")).click();

        String actualSubmission= driver.findElement(By.tagName("h1")).getText();

        String expectedSubmission = "Thank you for your submission!";

        Assertions.assertEquals(expectedSubmission,actualSubmission);

    }

 @AfterAll
public void closeBrowser(){
      driver.quit();
}
}
