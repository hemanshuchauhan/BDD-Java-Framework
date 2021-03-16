package stepdefinitions;
import com.pages.OrderPage;
import org.junit.Assert;

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
    public void addToCart() {
        orderPage.addToCart();
    }

    @Then("Proceed to checkout")
    public void proceedToCheckout() {
        orderPage.proceedToCheckout();
    }

    @Then("Agree term and conditions")
    public void tnc() {
        orderPage.tnc();
    }

    @Then("Make Bank wire Payment")
    public void paymentByBank() {
        orderPage.paymentByBank();
    }

    @Then("Order page title should be {string}")
    public void order_page_title_should_be(String expectedOPTitle) {
        Assert.assertTrue(orderPageTitle.contains(expectedOPTitle));
    }
}
