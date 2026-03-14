public class BubbleSort {

    public static void bubbleSort(int[] dataArray) {

        int endIndex = dataArray.length - 1;
        int startIndex = 0;

        while (startIndex < endIndex) {
            int lastSwapped = startIndex;

            for (int j = startIndex; j < endIndex; j++) {
                if (dataArray[j] > dataArray[j+1]) {
                    int temp = dataArray[j];
                    dataArray[j] = dataArray[j+1];
                    dataArray[j+1] = temp;
                    lastSwapped = j;
                }
            }
            endIndex = lastSwapped;
        }

    }

}
