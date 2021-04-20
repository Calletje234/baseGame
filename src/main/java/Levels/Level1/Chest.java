package Levels.Level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Chest {

    List<String> inhoudChest = new List;

    public int choiceRandomNumber() {
        int min = 1;
        int max = 10;
        Random random =  new Random();
        return random.nextInt(max + min) + min;
    }

    public void putItemInChest(int value){

    }

}
