package secao8.Main.Product;

import secao8.entities.Product;


public class Main {
    public static void main(String[] args) {
        Product product = new Product("Tv", 900.00, 10);

        System.out.println(product);

        product.addProducts(10);
        product.updateProduct();
        product.removeProducts(2);
        product.updateProduct();

    }
}
