package Exercise2;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        System.out.println(bike1);
        Bike bike2 = new Bike();
        bike2.setColor("Blue ");
        bike2.setManufacturer("Trek");
        bike2.setNumOfWheels(2);
        bike2.setWhenItWasCreated(2023);
        System.out.println(bike2);
        //creating array list
        //using this video https://www.youtube.com/watch?v=G3uNYHtn83c for arraylists
        //https://www.youtube.com/watch?v=1nRj4ALuw7A
        ArrayList<Bike> bikes = new ArrayList<>();
        bikes.add(bike1);
        bikes.add(bike2);
        //simple version
        System.out.println(bikes);
    }

}
