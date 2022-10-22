package com.hansen.legrand.assesment.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClassObject {
    private WebDriver driver;
    //loginBtn: By = By.xpath('//*[@id="MenuContent"]/a[2]')
    private By loginBtn = By.xpath("//*[@id=\"MenuContent\"]/a[2]");
    private By signUp = By.id("signin2");
    private By userName = By.xpath("//*[@id=\"sign-username\"]");
    private By passWord = By.xpath("//*[@id=\"sign-password\"]");
    private By searchResult = By.xpath("//*[@id=\"tads\"]/div/div/div/div/div[1]/a/div[1]");
    private By toBuy = By.xpath("//*[text()='Where To Buy']");
    private By enterSignUp = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
    private By logIn = By.xpath("//*[@id=\"login2\"]");
    private By userLogin = By.xpath("//*[@id=\"loginusername\"]");
    private By passwordLogin = By.xpath("//*[@id=\"loginpassword\"]");
    private By enterLogIn = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    private By signOut = By.xpath("//*[@id=\"logout2\"]");
    private By signUpCancel = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]");
    private By itemOne = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4");
    private By addCart = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
    private By cart = By.xpath("//*[@id=\"cartur\"]");
    private By deleteCart = By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[4]/a");
    private By deleteCartTwo = By.xpath("//*[@id=\"tbodyid\"]/tr[2]/td[4]/a");








    public ClassObject(WebDriver driver) {
        this.driver = driver;
    }

//    public void search(String searchTerm) {
//        this.driver.findElement(searchbar).sendKeys(searchTerm);
//
//    }

    public void signUp() {
        this.driver.findElement(signUp).click();
    }

//    public void clickSignUp(){
//        this.driver.findElement(signUp).click();
//    }
    public void typePassword() {
        this.driver.findElement(passWord).sendKeys("Password");
    }
    public void typeUsername() {
        this.driver.findElement(userName).sendKeys("Ron_Burgundy");
    }
    public void enterAccount() {
        this.driver.findElement(enterSignUp).click();
    }
    public void logInAcc() {
        this.driver.findElement(logIn).click();
    }
    public void enterUsername() {
        this.driver.findElement(userLogin).sendKeys("Ron_Burgundy");
    }
    public void enterPassword() {
        this.driver.findElement(passwordLogin).sendKeys("Password");
    }
    public void signIn() {
        this.driver.findElement(enterLogIn).click();
    }
    public void signOut() {
        this.driver.findElement(signOut).click();
    }
    public void signUpCancel() {
        this.driver.findElement(signUpCancel).click();
    }
    public void addCartA() {
        this.driver.findElement(addCart).click();
    }
    public void clickCart() {
        this.driver.findElement(cart).click();
    }
    public void deleteCartA() {
        this.driver.findElement(deleteCart).click();
    }
    public void deleteCartB() {
        this.driver.findElement(deleteCartTwo).click();
    }
    public void firstItem() {
        this.driver.findElement(itemOne).click();
    }
}
