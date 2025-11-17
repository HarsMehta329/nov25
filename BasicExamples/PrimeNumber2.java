
class PrimeNumber2 {

    int primeCount = 0;
    int notPrimeCount = 0;
    int PrimeSum = 0;
    int NotPrimeSum = 0;

    void checkPrimeNumber(int num) {
        boolean flag = true;
        for (int index = 2; index <= num / 2; index++) {
            if (num % index == 0) {
                flag = false;
                notPrimeCount++;
                NotPrimeSum += num;
                System.out.println(num + " not a prime number");
                break;
            }
        }
        if (flag == true) {
            primeCount++;
            PrimeSum += num;
            System.out.println(num + "  This is Prime Number");
        }
    }

    void printInfo() {
        System.out.println("Total Prime no is " + primeCount);
        System.out.println("Total non prime no is  " + notPrimeCount);
        System.out.println("Total sum of PrimeNumber is " + PrimeSum);
        System.out.println("Total sum of NonPrime Number is " + NotPrimeSum);
    }

    void printAllPrime(int startNum, int endnum) {
        for (int num = startNum; num <= endnum; num++) {
            checkPrimeNumber(num);
        }
    }

    public static void main(String[] args) {
        PrimeNumber2 p2 = new PrimeNumber2();
        p2.printAllPrime(10, 20);
        p2.printInfo();
    }
}
