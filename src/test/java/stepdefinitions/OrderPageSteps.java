package stepdefinitions;
import com.pages.OrderPage;
import org.junit.Assert;
import java.util.concurrent.TimeUnit;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class OrderPageSteps {

    private	OrderPage orderPage = new OrderPage(DriverFactory.getDriver());
    private static String orderPageTitle;

    @When("User observe the title of order page")
    public void user_observe_the_title_of_order_page() {
        orderPageTitle = orderPage.getOrderPageTitle();
        System.out.println("Login Page title is: " + orderPageTitle);
    }

    @When("Click T-shirts section")
    public void clickTshirtLink() {
        orderPage.clickTshirtLink();
    }

    @When("Select Faded T-shirt")
    public void fadedTshirt() {
        orderPage.fadedTshirt();
    }

    @When("Add the T-shirt in cart")
    public void addToCart() throws InterruptedException {
        orderPage.addToCart();
        //fluent wait to be implemented later
        Thread.sleep(3000);
    }

    @Then("Proceed to checkout")
    public void proceedToCheckout() throws InterruptedException {
        orderPage.proceedToCheckout();
        Thread.sleep(3000);
        orderPage.proceedToCheckout2();
        Thread.sleep(3000);
        orderPage.proceedToCheckout3();
    }

    @Then("Proceed to final checkout")
    public void proceedToFinalCheckout() throws InterruptedException {
        orderPage.proceedToCheckout4();
        Thread.sleep(3000);

    }

    @Then("Agree term and conditions")
    public void tnc() {
        orderPage.tnc();
    }

    @Then("Make Bank wire Payment")
    public void paymentByBank() throws InterruptedException {
        orderPage.paymentByBank();
        Thread.sleep(3000);
    }

    @Then("User confirms the order")
    public void confirmOrder() {
        orderPage.confirmOrder();
    }

    @Then("Order page title should be {string}")
    public void order_page_title_should_be(String expectedOPTitle) {
        Assert.assertTrue(orderPageTitle.contains(expectedOPTitle));
    }
}
