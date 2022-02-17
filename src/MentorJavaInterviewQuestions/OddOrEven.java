package MentorJavaInterviewQuestions;

public class OddOrEven {

    public static void main(String[] args) {

        int num = 5;

        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }
        System.out.println(num);
    }
}


// can also be done with a Scanner method

/*
write a method which can identify given number is even or odd
 */
/*

    public static String identifyOddOrEven(int n){

        return n%2==0?"Even":"odd";

    }

    public static void main(String[] args) {
        System.out.println(identifyOddOrEven(3));
    }
}
 */