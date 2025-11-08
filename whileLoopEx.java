
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


    

    public static void main(String[] args) {
        whileLoopEx s1 = new whileLoopEx();
        s1.m1();
    }
}
