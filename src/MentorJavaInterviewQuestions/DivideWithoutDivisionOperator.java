package MentorJavaInterviewQuestions;

public class DivideWithoutDivisionOperator {

    public static void main(String[] args) {

        int num1 = 97;
        int num2 = 3;
        int result = 0;

        for(int i = 0; i<num1 - num2; i+=num2){
            result++;
        }

        System.out.println(result);
    }
}

/*
Write a method that can divide two numbers without using division operator

public static void divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Invalid Number");
            return;
        }

        int count = 0;
        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count + " and remainder is " + num1);
    }
 */

/*
public static void divide1(int num1, int num2){

        if(num2==0){
            throw new RuntimeException("Invalid Entry");
        }
        int result=0;

        for(int i = num1; i>=num2; i-=num2){
            result++;
        }
        System.out.println(result);
    }
 */