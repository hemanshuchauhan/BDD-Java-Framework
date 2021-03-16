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
    private By proceedToCheckout = By.xpath("//*[contains(@title, 'Proceed')]");
    private By proceedToCheckout2 = By.partialLinkText("Proceed");
    private By proceedToCheckout3 = By.xpath("//*[span= 'Proceed to checkout']");
    private By tnc = By.className("checker");
    private By paymentByBank = By.xpath("//a[@class='bankwire']");
    private By proceedToCheckout4 = By.xpath("//button[@type='submit'][@name='processCarrier']");
    private By confirmOrder = By.xpath("//button//span[text()='I confirm my order']");

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

    public void proceedToCheckout2() {
        driver.findElement(proceedToCheckout2).click();
    }

    public void proceedToCheckout3() {
        driver.findElement(proceedToCheckout3).click();
    }

    public void proceedToCheckout4() {
        driver.findElement(proceedToCheckout4).submit();
    }

    public void fadedTshirt() {
        driver.findElement(fadedTshirt).click();
    }

    public void confirmOrder() {
        driver.findElement(confirmOrder).click();
    }

    public void tnc() {
        driver.findElement(tnc).click();
    }

    public void paymentByBank() {
        driver.findElement(paymentByBank).click();
    }

}
