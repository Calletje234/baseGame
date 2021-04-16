import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Game {

    public static void characterCreate() throws IOException{
        System.out.println("Do you want a Male or Female character: ");
        System.out.println(" - Male: 'm'");
        System.out.println(" - Female: 'f'");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String gender = reader.readLine();
        if(gender.equalsIgnoreCase("m")){
            Character character = new Character(Gender.FEMALE);
        }else {
            Character character = new Character(Gender.MALE);
        }
    }
}
