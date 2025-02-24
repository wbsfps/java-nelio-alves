package secao19.criandoFuncoesQueRecebemFuncoesComoParametro.model.services;

import secao19.criandoFuncoesQueRecebemFuncoesComoParametro.model.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductServices {
    public double filteredSum(List<Product> list, Predicate<Product> criteria) {
        double sum = 0;

        for (Product product : list) {
            if (criteria.test(product)) {
                sum += product.getPrice();
            }
        }
        return sum;
    }
}
