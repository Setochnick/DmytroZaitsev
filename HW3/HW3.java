package DmytroZaitsev.HW3;

import java.util.Random;

public class HW3 {
    public static void main(String[] args) {
         int [] array = {15, 8, 24, 41, 9, 84};

        Random random = new Random();
        int randomNumber = random.nextInt(array.length);
        int index = array[randomNumber];

        System.out.println(index);
        if(index % 2 == 0)
            System.out.println("I am lucky");
        else
            System.out.println("Try again");



    }






}
