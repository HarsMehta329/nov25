
class whileLoopEx {

    void m1() {
        int index = 1;
        while (index <= 10) {
            System.out.println(index);
            index++;
            if (index % 7 == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        whileLoopEx ex1 = new whileLoopEx();
        ex1.m1();
    }
}
