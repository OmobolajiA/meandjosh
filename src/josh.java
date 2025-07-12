public class josh {
    public static void main(String[] args ) {
        char grade = 'C';
        switch (grade) {
            case 'A' :
                System.out.print("Excellent");
                break;
            case 'B' :
            case 'C' :
                System.out.print("very good");
                break;
            case 'D' :
                System.out.print("You passed");
                break;
            case 'F' :
                System.out.print("Try again next year");
                break;
            default:
                System.out.print("the Grade is invalid");

        }
        System.out.println(" Your Grade is " + grade);
    }
}
