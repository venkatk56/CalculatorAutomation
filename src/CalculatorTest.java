import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class CalculatorTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C://Users//REDDYS//Downloads//Selenium Jars//chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Browser launched");
        driver.manage().window().maximize();
        driver.get("http://test.i-pay.co.za/qa/calculator.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Url Entered ");

    }

    @Test(priority = 1)
    void sum() throws Exception {
        // Enter the first number
        driver.findElement(By.xpath("//input[@name='number1']")).sendKeys(String.valueOf(20));
        // Click on Operations Dropdown
        driver.findElement(By.xpath("//select[@name='operation']")).click();
        // select the Addition Operator
        driver.findElement(By.xpath("//option[contains(text(),'+')]")).click();
        // Enter the second number
        driver.findElement(By.xpath("//input[@name='number2']")).sendKeys(String.valueOf(10));
        // Click on submit button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        // Capturing the answer text box
        String Addition = driver.findElement(By.xpath("//span[@id='answer']")).getText();
        System.out.println("Addition of two numbers: " +Addition);
    }

    @Test(priority = 2)
    void sub() throws Exception {
        // Enter the first number
        driver.findElement(By.xpath("//input[@name='number1']")).sendKeys(String.valueOf(20));
        // Click on Operations Dropdown
        driver.findElement(By.xpath("//select[@name='operation']")).click();
        // select the Subtraction Operator
        driver.findElement(By.xpath("//option[contains(text(),'-')]")).click();
        // Enter the second number
        driver.findElement(By.xpath("//input[@name='number2']")).sendKeys(String.valueOf(10));
        // Click on submit button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        // Capturing the answer text box
        String Subtraction = driver.findElement(By.xpath("//span[@id='answer']")).getText();
        System.out.println("subtraction of two numbers is " + Subtraction);

    }
    @Test(priority = 3)
    void mul() throws Exception {
        // Enter the first number
        driver.findElement(By.xpath("//input[@name='number1']")).sendKeys(String.valueOf(20));
        // Click on Operations Dropdown
        driver.findElement(By.xpath("//select[@name='operation']")).click();
        // select the Multiplication Operator
        driver.findElement(By.xpath("//option[contains(text(),'*')]")).click();
        // Enter the second number
        driver.findElement(By.xpath("//input[@name='number2']")).sendKeys(String.valueOf(10));
        // Click on submit button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        // Capturing the answer text box
        String Multiplication = driver.findElement(By.xpath("//span[@id='answer']")).getText();
        System.out.println("multiplication of two numbers is " + Multiplication);

    }
    @Test(priority = 4)
    void div() throws Exception {
        // Enter the first number
        driver.findElement(By.xpath("//input[@name='number1']")).sendKeys(String.valueOf(20));
        // Click on Operations Dropdown
        driver.findElement(By.xpath("//select[@name='operation']")).click();
        // select the Division Operator
        driver.findElement(By.xpath("//option[contains(text(),'/')]")).click();
        // Enter the second number
        driver.findElement(By.xpath("//input[@name='number2']")).sendKeys(String.valueOf(10));
        // Click on submit button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        // Capturing the answer text box
        String Division = driver.findElement(By.xpath("//span[@id='answer']")).getText();
        System.out.println("division of two numbers is " + Division);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();


    }
}






