public class InsertionSort {

    public static void insertionSort(int[] dataArray) {

        for (int i = 1; i < dataArray.length; i++) {
            int key = dataArray[i];
            int j = i - 1;

            while (j >= 0 && dataArray[j] > key) {
                dataArray[j + 1] = dataArray[j];
                j--;
            }
            dataArray[j+1] = key;
        }

    }

}
