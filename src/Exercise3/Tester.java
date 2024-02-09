package Exercise3;

public class Tester {
    public static void main(String[] args) {
        Textbook textbook1 = new Textbook("American history ", 89.99, 2023);
        System.out.println(textbook1);

        System.out.println(textbook1.halfPrice()); // testing method I created
    }
}
