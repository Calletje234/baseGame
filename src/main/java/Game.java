import CreateCharacter.Character;
import CreateCharacter.FemaleCharacter;
import CreateCharacter.MaleCharacter;

import java.util.Scanner;

public class Game {

    public static void characterCreate(Scanner scanner){
        System.out.println("Do you want a Male or Female character: ");
        System.out.println(" - Male: 'm'");
        System.out.println(" - Female: 'f'");
        String gender = scanner.nextLine();

        if(gender.equalsIgnoreCase("f")){
            Character femalechar = new FemaleCharacter();
            femalechar.displayStats();
        }else if(gender.equalsIgnoreCase("m")){
            Character malechar = new MaleCharacter();
            malechar.displayStats();
        }else {
            System.out.println("Sorry input ins't one of the types mentioned above. Please type 'f' for Female and 'm' for Male");
            characterCreate(scanner);
        }
    }
}
