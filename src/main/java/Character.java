import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Character {
    private int muscle;
    private int looks;
    private int money;
    private Gender charGender;

    public Character(Gender gender) {
        if(gender.equals(Gender.FEMALE)){
            this.muscle = 2;
            this.looks = 5;
            this.money = 2;
            initStat();
            displayStat();
        } else{
            this.muscle = 5;
            this.looks = 2;
            this.money = 2;
            initStat();
            displayStat();
        }
    }

    public void initStat(){
        this.bodyArmor = 0;
        this.headArmor = 0;
        this.armArmor = 0;
        this.legArmor = 0;
        this.shieldDur = 0;
        this.swordAtt = 0;
        this.swordDur = 0;
        this.weapon = "EMPTY";
        this.shield = "EMPTY";
    }

    public void displayStat(){
        System.out.println("");
    }
}


