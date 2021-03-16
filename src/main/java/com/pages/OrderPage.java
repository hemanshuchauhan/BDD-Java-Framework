package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage {
    private WebDriver driver;

    //1. By locators

    private By tShirtsTab = By.xpath("//li[3]//a[contains(.,'T-shirts')]");
    private By fadedTshirt = By.xpath("//a[contains(.,'Faded Short Sleeve T-shirts')]");
    private By addToCartCart = By.id("add_to_cart");
    private By proceedToCheckout = By.xpath("//span[text()='Proceed to checkout']");
    private By tnc = By.className("checker");
    private By paymentByBank = By.className("bankwire");

    //2. Constructor of the Page Class
    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    //3. Page Actions

    public String getOrderPageTitle()	{
        return driver.getTitle();
    }

    public void clickTshirtLink() {
        driver.findElement(tShirtsTab).click();
    }

    public void addToCart() {
        driver.findElement(addToCartCart).click();
    }

    public void proceedToCheckout() {
        driver.findElement(proceedToCheckout).click();
    }

    public void fadedTshirt() {
        driver.findElement(fadedTshirt).click();
    }

    public void tnc() {
        driver.findElement(tnc).click();
    }

    public void paymentByBank() {
        driver.findElement(paymentByBank).click();
    }

}
