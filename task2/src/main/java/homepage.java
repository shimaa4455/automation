import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class homepage {
    WebDriver driver;
    Actions action;
    By button= By.xpath("//a[@class=\"btn btn-info btn-outline mob-dropdown-btn\"]");
    public homepage (WebDriver driver){

        this.driver=driver;
        action =  new Actions(driver);

    }
    public void clickbtn(){

        WebElement btngetpaid = driver.findElement(button);
        action.moveToElement(btngetpaid);
        action.click().build().perform();

    }


}
