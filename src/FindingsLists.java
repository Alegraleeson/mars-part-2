import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class FindingsLists {
    public FindingsLists() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Welcome back from your expedition. Time to catalog everything you found.");

        ArrayList<String> rockList = new ArrayList<String>();

        System.out.println("Rock data downloaded.");

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println(rockList);

        System.out.println("Wait a second that last one is not a rock we need to delete that one from the list.");

        rockList.remove("not rock");

        System.out.println(rockList);

        System.out.println("Perfect");

        Thread.sleep(500);

        Hashmap<String, String> fossilDirectory = new Hashmap<>();

        System.out.println("Fossil data downloaded");

        fossilDirectory.put("Bird Fossil","The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil","The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put("Tooth Fossil","The tooth from an unknown fossil");

        System.out.println("Which of the fossils would you like to learn more about (Spelling and Spacing is important)?");

        Scanner input = new Scanner(System.in);
        String fossilChoice = input.nextLine();

        if(fossilChoice.equalsIgnoreCase("Bird Fossil")){
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if(fossilChoice.equalsIgnoreCase("Fish Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }else if(fossilChoice.equalsIgnoreCase("Tooth Fossil")){
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }
        Thread.sleep(500);

        Hashset<String> suppliesBrought = new Hashset<>();
        Hashset<String> suppliesUsed = new Hashset<>();

        suppliesBrought.add("Food");
        suppliesBrought.add("Water");
        suppliesBrought.add("Medicine");

        suppliesUsed.add("Food");
        suppliesUsed.add("Water");


        System.out.println("Medicine");
        }



}






