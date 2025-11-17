
class AssignmentForLoop {

    void processData(int startNum, int EndNum) {
        int count = 0;
        for (int index = startNum; index <= EndNum; index++) {
            if (count >= 3) {
                break;
            }
            if (index % 3 == 0 && index % 7 == 0) {
                count++;
                System.out.println(" " + index);

            }
        }
    }

    public static void main(String[] args) {
        AssignmentForLoop s1 = new AssignmentForLoop();
        s1.processData(4567, 99);
    }
}
