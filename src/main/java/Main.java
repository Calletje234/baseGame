import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String arg[]){
        Game game = new Game();
        game.characterCreate(scanner);
    }
}