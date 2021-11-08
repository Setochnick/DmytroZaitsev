package DmytroZaitsev.HW3;


import java.util.Scanner;

public class HW3_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int trying = 0;
        boolean answerIsCorrect = false;

        String question = "If I drink, I die. If I eat, I am fine. What am I?";

        System.out.println(question);
        while (!answerIsCorrect) {
            String answer = scanner.nextLine();

            switch (answer) {
                case "Fire":
                    System.out.println("Great!");
                    answerIsCorrect = true;
                    break;
                case "I don't know":
                    System.out.println("Answer is Fire");
                    answerIsCorrect = true;
                    break;
                default:

                    if (trying < 2){
                    System.out.println("Please try again");
                    System.out.println(question);
                        trying++;

            }
                    else {
                        System.out.println("Sorry, better luck next time!");
                        answerIsCorrect = true;

                    }


        }
    }
    }}
