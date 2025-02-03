import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        text();
        print();
    }

    public static void text(){
        System.out.println("Welcome\nPrint your number: ");
    }

    public static void print(){
        int print = new Scanner(System.in).nextInt();
        boolean input = (print % 2 == 0);
        System.out.println(input);
    }
}
