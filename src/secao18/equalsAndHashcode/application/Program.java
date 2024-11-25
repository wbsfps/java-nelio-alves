package secao18.equalsAndHashcode.application;

import secao18.equalsAndHashcode.model.entities.Client;

public class Program {
    public static void main(String[] args) {
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Alex", "alex@gmail.com");
        Client c3 = new Client("Bob", "bob@gmail.com");
        Client c4 = new Client("Maria", "maria@gmail.com");

        String a = "test";
        String b = "test";

        System.out.println(c1.equals(c2));
        System.out.println(c2.hashCode() == c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.hashCode());
        System.out.println(c1.equals(c4));

        System.out.println(c1 == c4);
        System.out.println(a == b);

        a = new String("test");
        b = new String("test");
        System.out.println(a == b);
    }
}
