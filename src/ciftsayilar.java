import java.util.Scanner;

public class ciftsayilar {
    public static void main(String[] args) {
        int b;
        Scanner input = new Scanner(System.in);

        System.out.println("B değerini gir haci");

        b = input.nextInt();


        for (int a = 1; a <= b; a *= 2) {
            System.out.println(a);


        }

    }
}