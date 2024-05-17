public class PrimeNumbers {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Corner cases
        if (number <= 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        // Check from 5 to the square root of the number
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to find all prime numbers up to a given limit
    public static void findPrimes(int limit) {
        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        int limit = 100; // Change this value to find primes up to a different limit
        findPrimes(limit);
    }
}
