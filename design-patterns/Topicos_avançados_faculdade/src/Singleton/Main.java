package Singleton;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Incremental inc = Incremental.getInstance();
            System.out.println(inc.toString());
            inc.next();
        }
    }
}
