import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class App {
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "c:\Users\ravik\Downloads\chromedriver_win32\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/newtours/register.php");

        Thread.sleep(1000);

        WebElement first_name = driver.findElement(By.name("firstName"));
        first_name.sendKeys("Ravi");

        Thread.sleep(1000);

        WebElement last_name = driver.findElement(By.name("lastName"));
        last_name.sendKeys("Kumar");

        Thread.sleep(1000);

        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("7206638872");

        Thread.sleep(1000);

        WebElement username = driver.findElement(By.name("userName"));
        username.sendKeys("officailravikumar99@gmail.com");

        Thread.sleep(1000);

        WebElement address = driver.findElement(By.name("address1"));
        address.sendKeys("Ambala");

        Thread.sleep(1000);

        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("Ambala");

        Thread.sleep(1000);

        WebElement state = driver.findElement(By.name("state"));
        state.sendKeys("Haryana");

        Thread.sleep(1000);

        WebElement pinCode = driver.findElement(By.name("postalCode"));
        pinCode.sendKeys("133001");

        Thread.sleep(1000);

        Select countryList = new Select(driver.findElement(By.name("country")));
        countryList.selectByValue("INDIA");

        Thread.sleep(1000);

        WebElement loginUserName = driver.findElement(By.id("email"));
        loginUserName.sendKeys("ravikumar217");

        Thread.sleep(1000);

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Ra@629732");

        Thread.sleep(1000);

        WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
        confirmPassword.sendKeys("Ra@629732");

        Thread.sleep(1000);

        WebElement submit = driver.findElement(By.name("submit"));
        submit.click();

        Thread.sleep(5000);
        driver.quit();

    }
}
