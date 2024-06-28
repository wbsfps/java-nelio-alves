package secao4;

public class FuncoesMatematicas {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double a,b,c;
        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(25.0);
        System.out.printf("Square root of %.1f = %.1f \n", x , a);
        System.out.printf("Square root of %.1f = %.1f \n", y , b);
        System.out.printf("Square root of 25 = %.1f \n", c);

        a = Math.pow(x, y);
        b = Math.pow(x, 2.0);
        c = Math.pow(5,2);
        System.out.printf("%.1f elevado a %.1f = %.1f \n", x, y, a);
        System.out.printf("%.1f elevado ao quadrado = %.1f \n", x, b);
        System.out.printf("5 elevado ao quadrado = %.1f \n", c);

        a = Math.abs(y);
        b = Math.abs(z);
        System.out.printf("Valor absoluto de %.1f = %.1f\n", y, a);
        System.out.printf("Valor absoluto de %.1f = %.1f\n", z, b);

        double delta = Math.pow(b, 2) - (4 * a * c);
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println(x1);
        System.out.println(x2);
    }
}
