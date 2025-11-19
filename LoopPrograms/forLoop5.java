package LoopPrograms;


class forLoop5 {

    void loop(int StartRange, int endRange) {
        for (int index = endRange; index >= StartRange; index--) {
            if (index % 9 == 0) {
                System.out.println(" " + index);
            }
        }
    }

    public static void main(String[] args) {
        forLoop5 s1 = new forLoop5();
        s1.loop(1, 50);
    }
}
