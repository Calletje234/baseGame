import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Character extends Stats {
    private Gender charGender;

    public Character(Gender gender) {


    }

    public void displayStat(){
        System.out.println("");
    }
}


