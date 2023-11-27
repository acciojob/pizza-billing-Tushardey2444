package com.driver;

public class Pizza {
    private int veg=300;
    private int nonVeg=400;
    private int extraCheese=80;
    private int extraToppingVeg=70;
    private int extraToppingNonVeg=120;
    private int paperBag=20;
    private boolean cheeseAdded;
    private boolean toppingsAdded;
    private boolean bagAdded;
    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheeseAdded=false;
        this.toppingsAdded=false;
        this.bagAdded=false;
        this.bill="";
        // your code goes here
        if(this.isVeg){
            this.price+=this.veg;
        }else{
            this.price+=this.nonVeg;
        }
    }
    public int getPrice(){
        return this.price;
    }
    public void addExtraCheese(){
        // your code goes here
        if(!cheeseAdded){
            this.price+=this.extraCheese;;
            this.cheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            if(!toppingsAdded && cheeseAdded){
                this.price+=this.extraToppingVeg;
                this.toppingsAdded = true;
            }
        }else{
            if(!toppingsAdded && cheeseAdded) {
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
        if(isVeg){
            bill="Base Price Of The Pizza: "+this.veg+"\n";
        }else{
            bill="Base Price Of The Pizza: "+this.nonVeg+"\n";
        }
        if(this.cheeseAdded){
            bill+="Extra Cheese Added: "+this.extraCheese+"\n";
        }
        if(this.toppingsAdded){
            bill+="Extra Toppings Added: "+this.extraToppingVeg+"\n";
        }
        if(this.bagAdded){
            bill+="Paperbag Added: "+this.paperBag+"\n";
        }
        this.bill+="Total Price: "+this.price+"\n";

        return this.bill;
    }
}
