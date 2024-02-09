package Exercise3;

public class Tester {
    public static void main(String[] args) {
        Textbook textbook1 = new Textbook("American history ", 89.99, 2023);
        Textbook textbook2 = new Textbook("Wild life ", 49.99, 2022);
        textbook2.setName("British Englsh ");
        textbook2.setPrice(99.99);
        System.out.println(textbook1);

        System.out.println(textbook1.halfPrice()); // testing method I created
        System.out.println(textbook2);
        System.out.println(textbook2.halfPrice());
    }
}
