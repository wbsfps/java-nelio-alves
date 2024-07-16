package secao5;

public class Escopo {
    public static void main(String[] args) {
        // Não visualização
        double price = 400.00;
        //double x = price;
        //System.out.println(x);

        // Escopo

        double discount = 0;
        if (price > 200.00) {
            // discount = price * 0.1;
        }
        System.out.println(discount);
    }
}
