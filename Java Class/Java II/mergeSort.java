import java.util.Arrays;

public class mergeSort {
    public static void mergeSort(int[] list, int start, int end) {
    if (start == end) {
        return;
    } else if (start == end-1) { // in the case that the start index of the pre-merge list is the same as the end index (2 item array)
        if (list[start] <= list[end]) {
            return;
        } else { // swap
            int temp = list[start];
            list[start] = list[end]; // swapping between a two integer array
            list[end] = temp;
        }
    }
    
    int mid = (end-start)/2; // calculating the middle index
    mergeSort(list, start, start + mid);
    mergeSort(list, start + mid + 1, end);
    merge(list, start, start + mid, end);
}

    private static void merge(int[] list, int leftHalfStart, int rightHalfStart, int end) {
        int leftHalfSize = rightHalfStart - leftHalfStart + 1; // determining the size of the left half using start indicies
        int rightHalfSize = end - rightHalfStart;

        int[] leftHalf = new int[leftHalfSize];
        int[] rightHalf = new int[rightHalfSize];

        for (int i=0; i<leftHalfSize; ++i) // iterate through each term throughout each half
            leftHalf[i] = list[leftHalfStart + i];
        for (int j=0; j<rightHalfSize; ++j)
            rightHalf[j] = list[rightHalfStart + 1+ j];

        int i = 0; // count term for the left side
        int j = 0; // count term for the right side

        int k = leftHalfStart;
        while (i < leftHalfSize && j < rightHalfSize) {
            if (leftHalf[i] <= rightHalf[j]) { // comparing terms between halfs of the same indicies
                list[k] = leftHalf[i];
                i++;
            } else {
                list[k] = rightHalf[j]; // else swap between sides
                j++;
            }
            k++;
        }

        while (i < leftHalfSize) {
            list[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightHalfSize) {
            list[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public static void main(String args[]) { // testing
        int[] myList = {1, 4, 4, 5, 3, 2};
        mergeSort(myList, 0, 5);
        System.out.println(Arrays.toString(myList));
    }

}