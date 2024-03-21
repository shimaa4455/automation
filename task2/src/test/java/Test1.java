import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.plaf.PanelUI;

import static org.testng.Assert.assertTrue;

public class Test1 {
    WebDriver driver;



    @BeforeTest
    public void theset()
    {
        driver=new ChromeDriver();
        driver.navigate().to("https://www.levelset.com/");
    }
    @Test
    public void TestGetPaidPage()
    {
        homepage home= new homepage(driver);
        home.clickbtn();
        getpaid paidpage= new getpaid(driver);
        Assert.assertTrue(paidpage.getname().equals("Send a Warning"));
       Assert.assertTrue(paidpage.getprice().equals("$59"));
       driver.close();


    }
}
