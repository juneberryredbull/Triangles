// Eddie Hart
// Feb 2nd, 2024
// CSC 1060

// this little thing right here imports the scanner thing

import java.util.Scanner;

public class trianglecreator {
    /* here i decided to create a method called triangleCreator so that my main was less crowded, make my code more readable,
     * and so that i could more easily debug and tweak my code throughout the process of creating the program.
     * honestly splitting the program into the triangleCreator half and the main half (which does all the looping) was a good decision
     * bc it took a good couple of hours on each of tweaking and debugging to get my program to work the way i wanted to.
     * if i did all of this shit on main trying to tweak and debug it wouldve given me a mental breakdown*/

    /* as stated earlier, this method takes in an integer which is the size of the triangle
     * and a char which would be the fill of the triangle.
     * after hours of testing different nested for loops i figured out how to make it so that it decreasingly prints spaces
     * and increasingly prints the chosen character fill */
    public static void triangleCreator(int size, char character) {
        int spaces = size - 1;
        for (int x = 0; x <= (size - 1); x++) {
            for (int z = spaces; z >= 0; z--) {
                System.out.print(" ");
            }
            for (int y = x; y >= 0; y--) {
                System.out.print(character + " ");
            }
            spaces--;
            System.out.println();
        }
    }

    /* here in main is where i tried to figure out how to loop the program as long as the answer is "y" it'll run.
     * i honestly got so frustrated for like 2 hours trying to figure out how to loop it all correctly that i just deleted all of main
     * and started from scratch and in less than 10 minutes figured out how to loop it nicely and correctly.
     * here i learned a lesson in which sometimes if you cant figure something out and youve written a big mess maybe you should start
     * over and you'll actually code with a clearer mind and cleaner code.
     * also the reason why im commenting so much more on this program compared to my last ones is that this program was actually
     * quite the challenge and im proud i figured it out*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String yesNoAnswer = "y";
        // so the meat of the program runs under a while loop which is predefined to string "y" so that it can run
        while (yesNoAnswer.equals("y")) {

            System.out.print("Enter a size for your triangle: ");
            int triangleSize = input.nextInt();
            // this if conditional will limit the user to 1-50.
            // it also contains a while loop so that the program keeps nagging the user to enter a number in the range
            if (triangleSize > 50 || triangleSize < 1) {
                while (triangleSize > 50 || triangleSize < 1) {
                    System.out.println("Please choose a number between 1-50!");
                    System.out.print("Enter a size for your triangle: ");
                    triangleSize = input.nextInt();
                }
            }
            // once the user entered a number within the range, it breaks out of the while loop and follows through
            System.out.print("Enter a fill for your triangle: ");
            char charFill = input.next().charAt(0);
            // here i use the method i defined earlier in the program
            triangleCreator(triangleSize, charFill);
            // and finally here is where it is decided whether the program loops or not.
            // i also added a .toLowerCase() method so that the user's answer is case insensitive.
            /* i wanted to add the .toLowerCase() method just as a nice commodity because last semester i coded in python and
             * i remember python had a similar function but i wasnt sure if java had one. a quick google search and i found it.
             * i also decided to check if the textbook introduced it bc it would feel like cheating if it didnt.
             * the textbook does introduce it but not until chapter 7 which i havent read as of writing this. */
            System.out.print("Would you like another triangle? (y/n) ");
            yesNoAnswer = input.next().toLowerCase();
        }

    }
}


