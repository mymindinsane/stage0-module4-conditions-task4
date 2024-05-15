package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result;
        result = first >= second? (result = first >= third ? first : third) : (result = third >= second? third : second);
        System.out.println(result);
    }
}
