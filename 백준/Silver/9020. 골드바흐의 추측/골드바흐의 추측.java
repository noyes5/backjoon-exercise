import java.util.Scanner;

public class Main {

    public static boolean[] prime = new boolean[10001]; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        get_prime();

        int T = sc.nextInt();

        while (T-- >0) {
            int n = sc.nextInt();
            int firstPrime = n/2;
            int secondPrime = n/2;

            while(true) {

                if(!prime[firstPrime] && !prime[secondPrime]) {
                System.out.println(firstPrime + " " + secondPrime);
                break;
                }
            
                firstPrime--;
                secondPrime++;
            }
        }
    }

    public static void get_prime() {
        prime[0] = prime [1] = true;

           for (int i = 2;i <= Math.sqrt(prime.length); i++) {
               if(prime[i]) {
                   continue;
               }

               for (int j=i*i; j< prime.length; j += i) {
                   prime[j] = true;
               }
           }
    }
}