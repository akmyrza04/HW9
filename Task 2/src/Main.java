import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        print();
    }

    public static int text(){
        System.out.println("Welcome\nPrint your number: ");
        return new Scanner(System.in).nextInt();
    }

    public static void print(){
        System.out.println(text() % 2 == 0);
    }
}
