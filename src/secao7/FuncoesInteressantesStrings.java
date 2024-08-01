package secao7;

public class FuncoesInteressantesStrings {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG   ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2); // c em diante
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int so8 = original.indexOf("bc");
        int s09 = original.lastIndexOf("bc");

        System.out.println(original + "-");
        System.out.println(s01 + "-");
        System.out.println(s02 + "-");
        System.out.println("-" + s03 + "-");
        System.out.println(s04);
        System.out.println(s05);
        System.out.println(s06);
        System.out.println(s07);
        System.out.println(so8);
        System.out.println(s09);

        String s = "potato apple lemon orange";
        String[] vect = s.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);

    }
}
