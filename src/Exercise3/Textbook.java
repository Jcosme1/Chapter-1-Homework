package Exercise3;

public class Textbook {
   private String name;
   private double price;
   private int whenItWasMade; //I think when it was made is very important information
    //
   public Textbook(String name, double price, int whenItWasMade){
       this.name = name;
       this.price = price;
       this.whenItWasMade = whenItWasMade;
   }
   // no argument constructor
   public Textbook(){

   }
   //setters and getters

   public String getName(){
       return name;
   }
   public int getPrice(){
       return getPrice();
   }
   public int getWhenItWasMade(){
       return getWhenItWasMade();
   }
   public void setName(String name){
       this.name = name;
   }
   public void setPrice(double price){
       this.price = price;
   }
   public void setWhenItWasMade(int whenItWasMade){
       this.whenItWasMade = whenItWasMade;
   }
    //make a method to return half price of a textbook for a sale
    public String halfPrice(){
       return "HALF PRICE "+": " +
               this.name  + "$"+price /2.0;
   }
   public String toString(){
       return "Textbook: " + this.name + "$"+this.price + " " + this.whenItWasMade;
   }
}
