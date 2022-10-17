public class Tabuada {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Tabuada do %d:%n", i);
            for (int x = 1; x <= 10; x++) {
                System.out.printf("%d X %d = %d%n", i, x, i * x);
            }
        }
    }
}