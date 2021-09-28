package part2.templateMethod;

public abstract class AbstractCalcArray {
    public abstract int calc(int number);

    public final int calc(int[] array) {
        if (array.length == 0) return 0;

        int result = 0;

        for (int elem : array) {
            int calced = calc(elem);
            result += calced;
        }

        return result;
    }
}
