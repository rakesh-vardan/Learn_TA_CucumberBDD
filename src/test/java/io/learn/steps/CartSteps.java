package io.learn.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class CartSteps {

    @Given("the product price is {int}")
    public void the_product_price_is(int price) {
        System.out.println("Price: " +price);
    }

    @When("a discount of {double}% is applied")
    public void a_discount_of_is_applied(double discount) {
        System.out.println("Discount: "+discount);
    }

    @Then("the final price should be {double}")
    public void the_final_price_should_be(double finalPrice) {
        System.out.println("Final Price: " +finalPrice);
    }

    @Given("the user adds {string} to the cart")
    public void addItemToCart(String item) {
        // Code to add item to the cart
        System.out.println("Item added to cart:" +item);
    }

    @When("the user proceeds to checkout")
    public void the_user_proceeds_to_checkout() {
        System.out.println("Proceeding to checkout");
    }

    @Then("the cart should contain {string} and the total should be {string}")
    public void the_cart_should_contain_and_the_total_should_be(String item, String price) {
        System.out.println("cart contains: " +item+ " with price: " +price);
    }

    @Given("the user adds the following items to the cart:")
    public void the_user_adds_the_following_items_to_the_cart(DataTable dataTable) {
        List<Map<String, String>> items = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> item : items) {
            // Code to add each item to the cart
            String itemName = item.get("item");
            String price = item.get("price");
            System.out.println("Item Name:" +itemName);
            System.out.println("Price: " +price);
        }
    }

    @Then("the total price should be {int}")
    public void the_total_price_should_be(int price) {
        System.out.println("Total Price: " +price);
    }
}
