package tasks;

public class NumbersVampires {

    public NumbersVampires(int firstNum, int secondNum, int numberOf) {
        for (int i = firstNum; i < numberOf; i++) {
            if (isTrailingZero(i)) continue;

            for (int j = secondNum; j < numberOf; j++) {
                if (isTrailingZero(j)) continue;

                int resultMultiple = i * j;
                if (isEvenNumbersResult(resultMultiple)) continue;

                char c = String.valueOf(i).charAt(0);
                char c1 = String.valueOf(i).charAt(1);

                char c2 = String.valueOf(j).charAt(0);
                char c3 = String.valueOf(j).charAt(1);

                if (String.valueOf(resultMultiple).contains(String.valueOf(c)) &
                        String.valueOf(resultMultiple).contains(String.valueOf(c1)) &
                        String.valueOf(resultMultiple).contains(String.valueOf(c2)) &
                        String.valueOf(resultMultiple).contains(String.valueOf(c3))) {
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
