package tasks;

public class NumbersVampires {

    public NumbersVampires(int firstNum, int secondNum, int numberOf) {
        for (int i = firstNum; i < numberOf + 1; i++) {
            if (isTrailingZero(i)) continue;
            for (int j = secondNum; j < numberOf; j++) {
                if (isTrailingZero(j)) continue;
                int resultMultiple = i * j;
                if (isEvenNumbersResult(resultMultiple)) continue;

                if (String.valueOf(resultMultiple).contains(String.valueOf(i)) &
                        String.valueOf(resultMultiple).contains(String.valueOf(j))) {
                    System.out.println(i + " x " + j + " = " + resultMultiple);
                }
            }
        }
    }

    private boolean isTrailingZero(int n) {
        return n % 10 == 0;
    }

    private boolean isEvenNumbersResult(int n) {
        return String.valueOf(n).length() % 2 != 0;
    }

}
