
package exercises.prime;

import java.util.ArrayList;

public class Prime {
    public static boolean isPrime(int number,int limit){
        for(int i = 2; i <= limit; i++){
            if(number % i == 0 && i != number){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> listOfPrimes = new ArrayList<Integer>();
        int numberLimit = 50;
        int CounterOfPrimes = 0;
        int PartherPrimes = 0;
        for(int i = 2; i <= numberLimit; i++){
            if(isPrime(i,numberLimit) == true){
                listOfPrimes.add(i);
            }
        }
        for(int prime: listOfPrimes){
                System.out.println(prime);
                CounterOfPrimes++;
                if(listOfPrimes.contains(prime + 2)){
                    PartherPrimes++;
                }
        }
        System.out.println("Number of primes: " + CounterOfPrimes + " \nNumber of parthers primes: " + PartherPrimes );
    }
        
}
