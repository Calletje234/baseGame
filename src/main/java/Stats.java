import com.sun.org.apache.bcel.internal.classfile.SourceFile;

public abstract class Stats {
    private int bodyArmor;
    private int headArmor;
    private int armArmor;
    private int legArmor;

    private int shieldDur;
    private int swordAtt;
    private int swordDur;

    private int money;

    private String weapon;
    private String shield;

    public void initStats(){
        this.money = 0;
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

    public void displayStats(Gender gender){
        System.out.printf("STATS:");
        System.out.printf("---------------------------");
        System.out.printf("| Gender:              %s |", gender);
        System.out.printf("| Money:               %x |", this.money);
        System.out.printf("| Body Armor:          %x |", this.bodyArmor);
        System.out.printf("| Helmet Armor:        %x |", this.headArmor);
        System.out.printf("| Arm Armor:           %x |", this.armArmor);
        System.out.printf("| Legs Armor:          %x |", this.legArmor);
        System.out.printf("| Shield Duribilty:    %x |", this.shieldDur);
        System.out.printf("| Sword Duribility:    %x |", this.swordDur);
        System.out.printf("| Sword Attack         %x |", this.swordAtt);
        System.out.printf("---------------------------");

        System.out.printf("\nSHIELD AND SWORD");
        System.out.printf("-------------------");
        System.out.printf("| Sword:         %s", this.weapon);
        System.out.printf("| Shield:        %s", this.shield);
    }


}
