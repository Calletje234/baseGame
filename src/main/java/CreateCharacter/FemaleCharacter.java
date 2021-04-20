package CreateCharacter;

public class FemaleCharacter extends Character {

    public FemaleCharacter() {
        super();
        initStats(2, 5);
        this.gender = Gender.FEMALE;
    }
}
