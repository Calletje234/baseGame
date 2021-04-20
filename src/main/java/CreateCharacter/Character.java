package CreateCharacter;

public abstract class Character {
    private int muscle;
    private int looks;

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

    public Gender gender;

    public void initStats(int muscle, int looks){
        this.muscle = muscle;
        this.looks = looks;
        money = 0;
        bodyArmor = 0;
        headArmor = 0;
        armArmor = 0;
        legArmor = 0;
        shieldDur = 0;
        swordAtt = 0;
        swordDur = 0;
        weapon = "Empty";
        shield = "Empty";
    }

    public void displayStats(){
        System.out.printf("STATS:");
        System.out.printf("---------------------------\n");
        System.out.printf("| Muscle:              %x |\n", muscle);
        System.out.printf("| Looks:               %x |\n", looks);
        System.out.printf("| Gender:              %s |\n", gender);
        System.out.printf("| Money:               %x |\n", money);
        System.out.printf("| Body Armor:          %x |\n", bodyArmor);
        System.out.printf("| Helmet Armor:        %x |\n", headArmor);
        System.out.printf("| Arm Armor:           %x |\n", armArmor);
        System.out.printf("| Legs Armor:          %x |\n", legArmor);
        System.out.printf("| Shield Duribilty:    %x |\n", shieldDur);
        System.out.printf("| Sword Duribility:    %x |\n", swordDur);
        System.out.printf("| Sword Attack         %x |\n", swordAtt);
        System.out.printf("---------------------------\n");

        System.out.printf("\nSHIELD AND SWORD\n");
        System.out.printf("---------------------\n");
        System.out.printf("| Sword:         %s |\n", this.weapon);
        System.out.printf("| Shield:        %s |\n", this.shield);
        System.out.printf("---------------------\n");
    }

    public void setSwordStats(int swordAtt, int swordDur, String swordName){
        
    }


}
