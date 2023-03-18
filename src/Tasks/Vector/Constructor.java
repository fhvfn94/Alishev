package Tasks.Vector;

public class Constructor {
    private int[] values; //Значения
    private int[] weights; // Веса
    private int[] ranges; // границы отрезков
    private int sum; // длина всех отрезков

    public void RandomFromArray(int[] values, int[] weights) {
        this.values = values;
        this.weights = weights;
        ranges = new int[values.length];

        // Сумма длин всех отрезков
        sum = 0;
        for (int weight : weights) {
            sum += weight;
        }

        // Заполняем ranges, границами
        int lastSum = 0;
        for (int i = 0; i < ranges.length; i++) {
            ranges[i] = lastSum;
            lastSum += weights[i];
        }
    }

    /*Массив ranges уже заполнен, так что остаётся
      сгенерировать значение в промежутке [0;sum],
      и найти отрезок, содержащий это значение:*/
    public int getRandom() {
        int random = (int) (Math.random() * (sum - 1));
        int ourRangeIndex = 0;
        for (int i = 0; i < ranges.length; i++) {
            if (ranges[i] > random) {
                break;
            }
            ourRangeIndex = i;
        }
        return values[ourRangeIndex];
    }

}
