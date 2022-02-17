package MentorJavaInterviewQuestions;

import java.util.Arrays;

public class SwapTwoNumbersArray {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60};
        int[] newArray = swapTwoNumbersByIndexNum(array, 2, 5);
        System.out.println(Arrays.toString(newArray));


    }

    //the method swaps the element at index i with the element at index j, and returns the new array
    public static int[] swapTwoNumbersByIndexNum(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;

    }

    }

