package MentorJavaInterviewQuestions;

public class sumOfOddEvenNumbers {

    public static void sumOfOddEvenNumbers (int[] arr){
        int sumOfOddNumbers = 0;
        int sumOfEvenNumbers = 0;
        for(int each: arr){
            if ( each % 2 == 0){
                sumOfEvenNumbers += each;
            }
            else{
                sumOfOddNumbers += each;
            }
        }
        System.out.println("Sum of even numbers is " + sumOfEvenNumbers);
        System.out.println("Sum of odd numbers is " + sumOfOddNumbers);
    }
}
