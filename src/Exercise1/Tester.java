package Exercise1;

public class Tester {
    public static void main(String[] args) {
        Person person1 = new Person();
        //the no arg constructor is using my information as its default values
        System.out.println(person1);
        person1.setName("Howard Roark");
        //talk invokes the mehthod i made in the other person class
        System.out.println(person1.talk());

    }
}
