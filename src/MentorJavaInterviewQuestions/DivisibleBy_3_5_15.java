package MentorJavaInterviewQuestions;

public class DivisibleBy_3_5_15 {
    public static void main(String[] args) {

        String Divisible15 = "";
        String Divisible3 = "";
        String Divisible5 = "";
        String others="";

        for (int i = 1; i <=100 ; i++) {

            if( i%3 == 0 && i%5 == 0 && i%15 == 0){
                Divisible15+=" "+i;

            }else if(i%3 == 0 && i%15!= 0){
                Divisible3+=" "+i;

            }else if(i%5==0 && i%15!=0){
                Divisible5+=" "+i;

            }else{
                others+=i+" ";
            }

        }

        System.out.println("Divisible 15 = " + Divisible15);
        System.out.println("Divisible 3 = " + Divisible3);
        System.out.println("Divisible 5 = " + Divisible5);


    }
    }


    // if condition, otherwise.. loop til 100. && operator means its true
