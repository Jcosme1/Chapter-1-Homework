package Exercise1;

public class Person {
    //instance variable/ fields
    private String name;
    private int age;
    private String eyeColor;
    //no arg constructor
    public Person(){
        this.name = "Julian ";
        this.age = 22;
        this.eyeColor = " Brown ";
    }

    public Person(String name, int age, String eyeColor){ //constructor with instance variables
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;

    }
    //getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getEyeColor(){
        return eyeColor;
    }
    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }
    //talk method
    public String talk(){
        return "Welcome, coders! I am " + this.name;
    }
    //to String method I think its with the recent lecture basically, every class is a child class of the object class
    //and the toString turns the object into a string im pretty sure
    @Override
    public String toString(){
        return "Hello, I am a student and these are my parameters! " + this.name + this.age + this.eyeColor;
    }
}
