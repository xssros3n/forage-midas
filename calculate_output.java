public class calculate_output {
    public static void main(String[] args) {
        System.out.println("---begin output ---");
        for (int i = 0; i < 10; i++) {
            System.out.print((int) Math.floor(Math.pow(i, i)));
        }
        System.out.println();
        System.out.println("---end output ---");
    }
}