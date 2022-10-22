package com.hansen.legrand.assesment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.hansen.legrand.assesment.pages.ClassObject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


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
    public void test1() {
        ClassObject page = new ClassObject(driver);
        driver.get("https://www.demoblaze.com/");
        page.signUp();
        page.typeUsername();
        page.typePassword();
        page.enterAccount();


    }

    @Test
    public void test2() {
        ClassObject page = new ClassObject(driver);
        driver.get("https://www.demoblaze.com/");
        page.logInAcc();
        page.enterUsername();
        page.enterPassword();
        page.signIn();
        page.signOut();


    }

    @Test
    public void test3() {
        ClassObject page = new ClassObject(driver);
        driver.get("https://www.demoblaze.com/");
        page.firstItem();
        page.addCartA();
        page.addCartA();
        page.clickCart();


    }

    @Test
    public void test4() {
        ClassObject page = new ClassObject(driver);
        driver.get("https://www.demoblaze.com/");
        page.signUp();
        page.typeUsername();
        page.typePassword();
        page.signUpCancel();
    }

    @Test
    public void test5() {
        ClassObject page = new ClassObject(driver);
        driver.get("https://www.demoblaze.com/");
        page.firstItem();
        page.addCartA();
        page.addCartA();
        page.clickCart();


    }
}


