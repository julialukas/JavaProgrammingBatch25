package MentorJavaInterviewQuestions;

public class ReverseGivenString {
    public static void main(String[] yuliya) {

    }
    public static String reverse (String str){

            int length = str.length();

            String reverseStr = ""; //temp value

            for (int i = length - 1; i > -1; i--) { //start point initialization
                reverseStr += "" + str.charAt(i); // end point condition
            }
            return reverseStr;

        }
    }