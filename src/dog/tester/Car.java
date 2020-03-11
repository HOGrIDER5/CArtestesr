/*
 * Amer Stas 
 * 3/10/2020
 * This program creates constructors and methods of cars
 */
package dog.tester;

/**
 *
 * @author User
 */
public class Car {
    //variables for characteristics

    private String make, model, color;
    private int price, year,maxspeed;
    private boolean ledlights;
    private String ledlight;
    
    
//Constructor without paremeters

    public Car() {
        make = "Kia";
        model = "Picanto";
        color = "White";
        price = 0;
        maxspeed=0;
        year = 2019;
        ledlights = true;
    }
// constructor with parameters

    public Car(String company, String type, String colour, int date) {

        make = company;
        model = type;
        color = colour;
        year = date;
        int cost = (int) (Math.random() * 5000 + 10000);
        price = cost;
       int fast= (int)(Math.random()*200*240);
       maxspeed= fast; 
        int chance  = (int) (Math.random() * 2 + 1);
        if (chance == 1) {
            ledlights = true;
        } else {
            ledlights = false;
        }

    }

    /**
     * This method allows the user to set the price of the car pre: needs a
     * price value post: sets the price value
     * @return 
     */
    public int getPrice() {
        return price;
    }

    /**
     * This method allows the user to set the price of the car pre: needs a
     * price value post: sets the price value
     * @param pricee
     */
    public void setPrice(int pricee) {
        price = pricee;
    }
    public int getSpeed(){
        return maxspeed;
    }
    public void setSpeed(int spped){
        maxspeed=spped;
    }
    /**
     * This method allows for a car to honk its horn
     */
    public static void honkHorn() {
        System.out.println("Beep! Beep!");
    }

    //method to display all info of the Dog
    public String toString() {
        String output = "Make: " + make + "\n";
        output += "Model: " + model + "\n";
        output += "Color: " + color + "\n";
        output += "Cost: " + price + "\n";
        output += "Year: " + year + "\n";
        output += "LedLight: " + ledlight + "\n";
        //output string is complete, return it
        return output;
    }

}