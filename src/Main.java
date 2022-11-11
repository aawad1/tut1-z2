import java.util.Scanner;

public class Main {

        public static int sumaCifara(int broj) {
            int suma = 0;
            while(broj!=0) {
                int cifra=broj%10;
                broj/=10;
                suma+=cifra;
            }
            return suma;


        }
        public static void main(String[] args) {
            int n;
            Scanner ulaz = new Scanner(System.in); // Ulazni objekat
            System.out.println("Unesite broj n: ");
            n = ulaz.nextInt();
            System.out.println("cifre su: ");
            int broj = sumaCifara(n);
            for (int i = 0; i < n; i++) {
                if (n % broj == 0) {
                    System.out.println(i);
                }
            }

        }
    }
