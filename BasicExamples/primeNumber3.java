
class primeNumber3 {

    void checkPrimeNumber() {

        for (int num = 17; num <= 100; num++) {
            boolean flag = true;
            for (int index = 2; index <= num / 2; index++) {
                if (num % index == 0) {
                    flag = false;
                    System.out.println(num + "this is not a prime number");
                    break;
                }

            }
            if (flag == true) {
                System.out.println(num + "this number is prime");
            }
        }
    }

    public static void main(String[] args) {
        primeNumber3 p1 = new primeNumber3();
        p1.checkPrimeNumber();
    }
}
