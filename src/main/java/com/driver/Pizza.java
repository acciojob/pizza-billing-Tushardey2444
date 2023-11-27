package com.driver;

public class Pizza {
    private final int veg=300;
    private final int nonVeg=400;
    private final int extraCheese=80;
    private final int extraToppingVeg=70;
    private final int extraToppingNonVeg=120;
    private final int paperBag=20;
    private boolean cheeseAdded;
    private boolean toppingsAdded;
    private boolean bagAdded;
    private boolean billGenerated;
    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheeseAdded=false;
        this.toppingsAdded=false;
        this.bagAdded=false;
        this.billGenerated=false;
        this.bill="";
        // your code goes here
        if(this.isVeg){
            this.price=this.veg;
        }else{
            this.price=this.nonVeg;
        }
    }
    public int getPrice(){
        return this.price;
    }
    public void addExtraCheese(){
        // your code goes here
        if(!cheeseAdded){
            this.price+=this.extraCheese;
            this.cheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            if(!toppingsAdded){
                this.price+=this.extraToppingVeg;
                this.toppingsAdded = true;
            }
        }else{
            if(!toppingsAdded) {
                this.price += this.extraToppingNonVeg;
                this.toppingsAdded = true;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!bagAdded){
            this.price+=this.paperBag;
            this.bagAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!billGenerated) {
            if (isVeg) {
                bill = "Base Price Of The Pizza: " + this.veg + "\n";
            } else {
                bill = "Base Price Of The Pizza: " + this.nonVeg + "\n";
            }
            if (this.cheeseAdded) {
                bill += "Extra Cheese Added: " + this.extraCheese + "\n";
            }
            if (this.toppingsAdded) {
                if(isVeg){
                    bill += "Extra Toppings Added: " + this.extraToppingVeg + "\n";
                }else{
                    bill += "Extra Toppings Added: " + this.extraToppingNonVeg + "\n";
                }
            }
            if (this.bagAdded) {
                bill += "Paperbag Added: " + this.paperBag + "\n";
            }
            this.bill += "Total Price: " + this.price + "\n";
            this.billGenerated=true;
        }
        return this.bill;
    }
}
