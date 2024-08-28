public class Main {
    public static void main(String[] args) {
        int x = 20;
        // Integer
        Object obj = x;
        int y = (int) obj;

        System.out.println(x);
        System.out.println(obj);
        System.out.println(y);
    }
}