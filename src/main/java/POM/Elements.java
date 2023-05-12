package POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Elements {
    public static WebDriver driver;

    public Elements(WebDriver driver) {

        this.driver = driver;
    }

    public void managerClicksOnTheBankManagerLoginOption()  {
        driver.findElement(By.xpath("//button[@ng-click=\"manager()\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void managerClicksOnTheAddCustomerTab(){
        driver.findElement(By.xpath("//button[@ng-click=\"addCust()\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void managerInsertsFirstNameLastNameAndPostCode(String firstName, String lastName, String postCode){
        driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys(firstName);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys(lastName);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@placeholder=\"Post Code\"]")).sendKeys(postCode);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void managerClicksOnTheAddCustomerOption(){

        driver.findElement(By.xpath("//button[@class=\"btn btn-default\"]")).click();

    }

    public void managerGetsAPopupNotificationAndClosesIt(){
        Alert alert = driver.switchTo().alert(); // switch to alert

        String alertMessage = alert.getText(); // capture alert message

        System.out.println(alertMessage);

        alert.accept();
    }
 //------------------------ Open Account Page--------------------------------------------------------------
    public void bankManagerClicksOnTheOppenAccountTab() {
        driver.findElement(By.xpath("//button[@ng-click='openAccount()']")).click();
    }

    public void bankManagerSelectNewlyAddACustomerName() {
        driver.findElement(By.xpath("//select[@name='userSelect']")).click();
        driver.findElement(By.xpath("//select//option[text()='Manotosh Halder']")).click();

    }

    public void bankManagerSelectCurrency() {
        driver.findElement(By.xpath("//select[@id='currency']")).click();
        driver.findElement(By.xpath("//select//option[text()='Dollar']")).click();
    }

    public void bankManagerClickProcessButton() {
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }

    public void bankManagerGetsAPopupNotificationAndClosesIt() {
        Alert alert = driver.switchTo().alert(); // switch to alert

        String alertMessage = alert.getText(); // capture alert message

        System.out.println(alertMessage);

        alert.accept();
    }
//----------------------------- Customers Page------------------------------------------------------
    public void managerInCustomersPage(){
        driver.findElement(By.xpath("//button[@ng-click=\"showCust()\"]")).click();
    }

    public void managerSearchName(){
        driver.findElement(By.xpath("//input[@placeholder=\"Search Customer\"]")).click();
        driver.findElement(By.xpath("//input[@placeholder=\"Search Customer\"]")).sendKeys("Manotosh");
    }

    public void managerDeleteTheAccount(){
        driver.findElement(By.xpath("//button[@ng-click=\"deleteCust(cust)\"]")).click();
    }
    public void successfullyAccountWillBeDeleted(){
        driver.findElement(By.xpath("//button[@ng-click=\"home()\"]")).click();//// will be ok?

    }
}