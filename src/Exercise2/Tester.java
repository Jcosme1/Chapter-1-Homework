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


        //got help from dylon on the for loop part since it was a bit hard but I ended up getting it
        //start with a starter value of 0 for how many bikes there are since there are no bikes yet
        //you also create a value for the oldest bike and instead of hard coding in a number for the year you can
        //
        int count = 0;
        int oldest = bikes.get(0).getWhenItWasCreated(); //instead of hardcoding a number that might change like if you remove the two bikes and add two new ones the 2014 might be wrong if there are a bike that was not mad ein 2014
        for (int i = 0; i < bikes.size(); i++) {
            count += bikes.get(i).getNumOfWheels();

            if(bikes.get(i).getWhenItWasCreated() < oldest){
                oldest = bikes.get(i).getWhenItWasCreated(); //checking for the oldest and how many wheels with the same loop
            }


        }


        System.out.println(bikes);
        System.out.println(count);
        System.out.println(oldest);
    }

}
