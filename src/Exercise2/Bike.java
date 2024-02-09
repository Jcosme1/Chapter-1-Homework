package Exercise2;

public class Bike {
    private int numOfWheels;
    private int whenItWasCreated;
    private String color; // I think the color of the bike is important information
    private String manufacturer;

    //no arg constructor
    public Bike(){
        this.numOfWheels = 2;
        this.whenItWasCreated = 2014;
        this.manufacturer = "Schwinn";
    }
    //second constructor with the extra instance variable I created
    public Bike(int numOfWheels, int whenItWasCreated, String color , String manufacturer){
       this.numOfWheels = numOfWheels;
       this.whenItWasCreated = whenItWasCreated;
       this.color = color;
       this.manufacturer = manufacturer;
    }
   //getters
   public int getNumOfWheels(){
        return numOfWheels;
   }
   public int getWhenItWasCreated(){
        return whenItWasCreated;
   }
   public String getColor(){
        return  color;
   }
   public String getManufacturer(){
        return manufacturer;
   }
    //setters
    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }
    public void setWhenItWasCreated(int whenItWasCreated){
        this.whenItWasCreated = whenItWasCreated;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    @Override
    public String toString(){
       //this was my first try but the code seemed too ugly when adding to a list  //return "My current bike is " + this.manufacturer + " "+"from " +this.whenItWasCreated + " "+"with " + this.numOfWheels +" "+"wheels." ;
        return this.manufacturer +" "+this.whenItWasCreated +" "+this.numOfWheels;
    }

}
