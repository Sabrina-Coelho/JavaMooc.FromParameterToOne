

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }

    public static void printFromNumberToOne (int number) {
        int lala = number;
        while (lala >= 1) {
            System.out.println(lala);
            lala--;
        }
    }
}
