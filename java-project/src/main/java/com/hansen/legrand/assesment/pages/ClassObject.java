package com.hansen.legrand.assesment.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClassObject {
    private WebDriver driver;
    //loginBtn: By = By.xpath('//*[@id="MenuContent"]/a[2]')
    private By loginBtn = By.xpath("//*[@id=\"MenuContent\"]/a[2]");
    private By signUp = By.id("signin2");
    private By userName = By.xpath("//*[@id=\"sign-username\"]");
    private By passWord = By.xpath("//*[@id=\"sign-password\"]");
    private By enterSignUp = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
    private By logIn = By.xpath("//*[@id=\"login2\"]");
    private By userLogin = By.xpath("//*[@id=\"loginusername\"]");
    private By passwordLogin = By.xpath("//*[@id=\"loginpassword\"]");
    private By enterLogIn = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    private By signOut = By.id("logout2");
    private By signUpCancel = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]");
    private By itemOne = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4");
    private By addCart = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
    private By cart = By.cssSelector("#navbarExample > ul > li:nth-child(4) > a");
    private By deleteCart = By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[4]/a");
    private By deleteCartTwo = By.xpath("//*[@id=\"tbodyid\"]/tr[2]/td[4]/a");
    private By deleteBtnVisible = By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a");
    private By cartNumber = By.id("totalp");


    public ClassObject(WebDriver driver) {
        this.driver = driver;
    }

    public void signUp() {
        this.findElement(signUp).click();
    }

    public void typePassword() {
        this.findElement(passWord).sendKeys("Password");
    }

    public void typeUsername() {
        this.findElement(userName).sendKeys("Ron_Burgundy");
    }

    public void enterAccount() {
        this.findElement(enterSignUp).click();
    }

    public void logInAcc() {
        this.findElement(logIn).click();
    }

    public void enterUsername() {
        this.findElement(userLogin).sendKeys("Ron_Burgundy");
    }

    public void enterPassword() {
        this.findElement(passwordLogin).sendKeys("Password");
    }

    public void signIn() {
        this.findElement(enterLogIn).click();
    }

    public void signOut() {
        this.findElement(signOut).click();
    }

    public void signUpCancel() {
        this.findElement(signUpCancel).click();
    }

    public void addCartA() {
        this.findElement(addCart).click();
    }

    public void clickCart() {
        this.findElement(cart).click();
    }

    public void deleteCartA() {
        this.findElement(deleteCart).click();
    }

    public void deleteCartB() {
        this.findElement(deleteCartTwo).click();
    }

    public void firstItem() {
        this.findElement(itemOne).click();
    }

    public boolean logoutButtonIsDisplayed() {
        return this.findElement(signOut).isDisplayed();
    }

    protected WebElement findElement(By by) {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofMillis(7000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return this.driver.findElement(by);
    }

    public String cartAmount() {
        return this.findElement(cartNumber).getText();

    }

        public boolean delBtnIsVisible () {
            return this.findElement(deleteBtnVisible).isDisplayed();
        }
    }
