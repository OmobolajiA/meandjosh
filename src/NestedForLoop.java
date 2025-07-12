public class NestedForLoop {
    public static void main(String[] args) {
        int num = 1;
        int i = 1;
        for (num = 1; num <= 10; num++) {
            for (i = 1; i <= 10; i++) {
                System.out.println("the table of " + num + " is " + num * i );
            }
            System.out.println();
        }
    }
}
