import java.util.Scanner;

public class App {
    public static Scanner scan = new Scanner(System.in);
    public static boolean looper(int trail, int num) {
        int guesed;
        System.out.println("the number is choosen between  1 and 100");
        System.out.println("guees the number with " + trail + " trail");
        if (trail > 0) {
            System.out.println("guess the number:");
            guesed = scan.nextInt();
            do {
                if (guesed < num) {
                    System.out.println("the number greater than " + guesed);
                    System.out.println("guess the number:");
                    guesed = scan.nextInt();
                } else if (guesed > num) {
                    System.out.println("the number less than " + guesed);
                    System.out.println("guess the number:");
                    guesed = scan.nextInt();
                } else {
                    return true;

                }
                trail--;
            } while (trail > 0);

        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        int min = 1, max = 100, k;
        int correctNum = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println(
                "hello you are going to play guessing number game \n how fast did you think you can get the number enter your number: ");
        k = scan.nextInt();
        if (looper(k, correctNum)) {
            System.out.println("congra!.......... you got it right the number is " + correctNum);
        } else {
            System.out.println("you bitch looser  how can you loose this! \nthe number is " + correctNum);
        }
    }
}
