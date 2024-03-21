import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class getpaid {
    WebDriver driver;
    WebDriverWait wait;
By name=By.xpath("//div[@class=\"panel panel--doc-type panel--selectable\"]/div/div[contains(text(),\"Send a Warning\")]");
By price = By.xpath("//div[@class=\"panel panel--doc-type panel--selectable\"]/div/div[contains(text(),\"Send a Warning\")]/following-sibling::div[@class=\"right panel-heading--price\"]/span[@class=\"price-amount\"]");

    public getpaid(WebDriver driver){
        this.driver=driver;
    }
public String getname(){
    wait=new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.presenceOfElementLocated(name));
 WebElement thename=  driver.findElement(name);
    String Text= thename.getText();
    return Text;
}
public String getprice(){
        WebElement theprice = driver.findElement(price);
        return theprice.getText();

}
}
