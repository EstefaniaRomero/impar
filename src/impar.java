import java.util.Scanner;

public class impar {

    public static void main(String[] args) {

        int number = askNumber();
        pairOrOdd(number);

    }

    private static void pairOrOdd(int number) {

        int pair = 2;
        if(number % pair == 0){
            System.out.println(number + " és parell");
        }else System.out.println(number + " és imparell");
    }
    private static int askNumber() {

        System.out.println("Introdueix un enter: ");
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }
}
