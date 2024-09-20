import java.util.Scanner;

class calculator {
    int add(int a, int b) {
        int c = a + b;
        return c;
    }
}

public class program1 {
    public static void main(String[] args) {
        calculator calc = new calculator();
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int sum = calc.add(a, b);
        obj.close();
        System.out.println("\n\n-------Sum is :" + sum + "\n\n\n");
    }
}