package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int biggest = 0;
        biggest = first >= second ?
                first:
                second;
        System.out.println(biggest);
    }
}
