package MentorJavaInterviewQuestions;

public class ConsecutiveNumbers {

    public static void main(String[] args) {
        printConsecutiveNumbers(24);
    }

    public static void printConsecutiveNumbers(int N){

        for (int i = 1; i <= N; i++) {

            if (i % 3 == 0 && i % 2 == 0 && i % 5 == 0) {
                System.out.println("CodilityTestCoders");
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("CodilityCoders");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("TestCoders");
            } else if (i % 3 == 0 && i % 2 == 0) {
                System.out.println("CodilityTest");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 2 == 0) {
                System.out.println("Codility");
            } else {
                System.out.println(i);
            }


        }

    }

}


//given integer 50, iterate starting from 1 with 0 result would be different. will need to reach our integer number 50 in our case
// first condition in our statement if number divisible by 3, 2, 5 = codilityTestCoders
//else if 3rd condition divisible 2, 5, 0 compiler will print CodilityCOders
//else if 4th requirement if divisible by 3, 5, will print TestCoders
//else if 5th requirement if divisible by 5, compiler will print Coders