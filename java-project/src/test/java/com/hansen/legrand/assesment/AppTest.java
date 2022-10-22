package com.hansen.legrand.assesment;

import com.hansen.legrand.assesment.pages.ClassObject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Unit test for simple App.
 */
public class AppTest {

    public WebDriver driver;

    @BeforeAll
    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void quit() {
        driver.quit();
    }

//    @Test
//    public void eightComponents() {
//        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
//
//        String title = driver.getTitle();
//        assertEquals("Web form", title);
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
//
//        WebElement textBox = driver.findElement(By.name("break"));
//        WebElement submitButton = driver.findElement(By.cssSelector("button"));
//
//        textBox.sendKeys("Selenium");
//        submitButton.click();
//
//        WebElement message = driver.findElement(By.id("message"));
//        String value = message.getText();
//        assertEquals("Received!", value);
//    }


    @Test
//    Create account
    public void test1() throws InterruptedException {
        ClassObject page = new ClassObject(driver);
        driver.get("https://www.demoblaze.com/");
        page.signUp();
        Thread.sleep(5000);
        page.typeUsername();
        page.typePassword();
        page.enterAccount();
        Thread.sleep(4000);
        assertTrue(page.logoutButtonIsDisplayed());


    }

    @Test
//    Log in and password valid information and log out
    public void test2() throws InterruptedException {
        ClassObject page = new ClassObject(driver);
        driver.get("https://www.demoblaze.com/");
        page.logInAcc();
        page.enterUsername();
        page.enterPassword();
        page.signIn();
        assertTrue(page.logoutButtonIsDisplayed());
        page.signOut();


    }

    @Test
//    Add 2 items in the shopping cart
    public void test3() throws InterruptedException {
        ClassObject page = new ClassObject(driver);
        driver.get("https://www.demoblaze.com/");
        page.firstItem();
        page.addCartA();
        page.addCartA();
        page.clickCart();
//        assertEquals("720", page.cartAmount());


    }

    @Test
//    Create account Enter all the details in the page (First Name/ Last Name etc). Click on cancel
    public void test4() {
        ClassObject page = new ClassObject(driver);
        driver.get("https://www.demoblaze.com/");
        page.signUp();
        page.typeUsername();
        page.typePassword();
        page.signUpCancel();

    }

    @Test
//    Delete 2 items from the shopping cart
    public void test5() throws InterruptedException {
        ClassObject page = new ClassObject(driver);
        driver.get("https://www.demoblaze.com/");
        page.firstItem();
        page.addCartA();
        page.addCartA();
        Thread.sleep(3000);
        page.clickCart();
        Thread.sleep(3000);
        page.deleteCartA();
        Thread.sleep(3000);
        page.deleteCartB();
        assertFalse(page.delBtnIsVisible());



    }
    @Test
    public void test6() throws InterruptedException {
        ClassObject page = new ClassObject(driver);
        driver.get("https://www.demoblaze.com/");
        page.firstItem();
        page.addCartA();
        page.addCartA();
        Thread.sleep(5000);
        page.clickCart();
        assertEquals("720", page.cartAmount());


    }
    @Test
//    Add2/delete 1 item in the shopping cart instead of 2.
    public void test7() throws InterruptedException {
        ClassObject page = new ClassObject(driver);
        driver.get("https://www.demoblaze.com/");
        page.firstItem();
        page.addCartA();
        page.addCartA();
        Thread.sleep(5000);
        page.clickCart();
        page.deleteCartA();
        assertEquals(360, page.cartAmount());


    }

}


