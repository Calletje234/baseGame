package CreateCharacter;

public class MaleCharacter extends Character {

    public MaleCharacter() {
        super();
        initStats(5, 2);
        this.gender = Gender.MALE;
    }
}
