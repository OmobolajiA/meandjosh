public class TestingWhileLoop {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 40, 50};
        int index = 0;
        while (index < 5) {
            System.out.println("the value of item: " + numbers[index]);
            index++;
        }
    }
}
