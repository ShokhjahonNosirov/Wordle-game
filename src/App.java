import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        String[] words = {"TASTY", "ESSAY", "CHILD", "TRICK", "COWER", "SEIZE", "ANGEL", "SLEEP", "START", "STAGE", "SNAKE", "PRIDE", "CREAM", "FLUSH", "GUILT", "NERVE", "DAIRY", "TRIAL", "SWEEP", "CABLE", "MERIT", "GLARE", "SWEET", "GLOVE", "FINAL", "ROUND", "WITCH", "TEASE", "GRAND", "SMALL"};
        List<String> nameList = new ArrayList<>(Arrays.asList(words));
        int random = new Random().nextInt(words.length);
        Scanner scan = new Scanner(System.in);
        String a;
        String soz = words[random];
        int b=0;
        System.out.println("Allowed words: " + nameList + " \nYou can start the game now");
        while (b<6){
            a = scan.nextLine();

            if (!nameList.contains(a)){
                System.out.println("We don't have such word. Please use allowed words");
                continue;
            }
            
            if (a.length()!=5){
                System.out.println("Word must be 5 letters");
                continue;   
            }

            for (int i=0; i<soz.length(); i++){
                boolean didBreak = false;
                for(int j =0; j<soz.length(); j++){
                    if (a.charAt(i)==soz.charAt(i)){
                        System.out.print(a.charAt(i));
                        didBreak = true;
                        break;
                    }

                    if (a.charAt(i)==soz.charAt(j)){
                        String letter = String.valueOf(a.charAt(i));  
                        System.out.print(letter.toLowerCase());
                        didBreak = true;
                        break;
                    }
                }

                if (!didBreak) {   
                    System.out.print("_");
                }

            }

            if (a.equals(soz)){
                System.out.println("\nYou are a champ my friend )) CONGRATULATIONS !!!");
                break;
            }
            b++;
            int c=6-b;

            if (c>0){
                System.out.println("\nYou have " +c+ " chances left");
            }
            else{
                System.out.println("\nYou lost. Your IQ degree is - Infinity )))");
            }
        }
        scan.close();
    }
}
