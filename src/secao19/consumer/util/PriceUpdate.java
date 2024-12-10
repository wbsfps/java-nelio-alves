package secao19.consumer.util;

import secao19.consumer.model.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer <Product> {
    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}
