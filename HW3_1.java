package HW3;


import java.util.Scanner;

public class HW3_1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
     System.out.println("If I drink, I die. If I eat, I am fine. What am I?");
     String answer = scanner.nextLine();

            switch (answer) {
                case "Fire":
                    System.out.println("Great!");
                    break;
                case "I don't know":
                    System.out.println("Answer is Fire");
                    break;
                default:
                    boolean exit = false;
                    for(int i = 1; i <= 2; i++) {


                        if (exit == true)
                            break;
                    System.out.println("Think again");
                    System.out.println("If I drink, I die. If I eat, I am fine. What am I?");
                    answer = scanner.nextLine();

            }
                    System.out.println("Sorry, try again later.");
        }



    }}
