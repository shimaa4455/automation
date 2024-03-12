


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class test {

    private WebDriver driver;

    @Test
    public void task1(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);


        driver.get("https://www.saucedemo.com/");

        By loginPageHeaderSelector = By.className("login_logo");
        WebElement loginPageHeader = driver.findElement(loginPageHeaderSelector);
// System.out.println(loginPageHeader.getText());
        //Assert.assertEquals(loginPageHeader.getText(),"Swag Labs1","login page header does not match requirement");
// driver.quit();
        By username=By.id("user-name");
        WebElement user=driver.findElement(username);
        user.sendKeys("standard_user");
        By password=By.id("password");
        WebElement pass=driver.findElement(password);
        pass.sendKeys("secret_sauce");
        By loginbutton=By.id("login-button");
        WebElement login=driver.findElement(loginbutton);
      login.click();
      //staticWay
      /*  driver.findElement(By.xpath("//div[@class=\"pricebar\"]/button")).click();
        driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"inventory_item_name\"]")));
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"inventory_item_name\"]")).getText().contains("Sauce Labs Backpack"));*/
        //the six item task
      /* List<WebElement> items = driver.findElements(By.className("inventory_item"));
        Assert.assertEquals(items.size(), 6, "The number of inventory items is not 6");*/
        //genericWay
        findelement("Sauce Labs Backpack");
        driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
        List<WebElement> cartItems = driver.findElements(By.xpath("//div[@class=\"cart_item\"]"));
        Assert.assertTrue(cartItems.size() > 0, "No items found in the cart");






    }
    public void findelement(String product) {
        String thexpath = String.format("//div[contains(text(), '%s')]/parent::a/parent::div/following-sibling::div/button", product);
        WebElement button = driver.findElement(By.xpath(thexpath));
        button.click();
}

}