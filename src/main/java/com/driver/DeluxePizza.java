package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        // your code goes here
        super(isVeg);
        super.addExtraCheese();
        super.addExtraToppings();
    }
}
