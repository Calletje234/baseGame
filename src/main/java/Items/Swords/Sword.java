package Items.Swords;

public abstract class Sword {

    private int swordAtt;
    private int swordDur;
    private String swordName;

    public void setStats(int swordAtt, int swordDur, String swordName){
        this.swordAtt = swordAtt;
        this.swordDur = swordDur;
        this.swordName = swordName;
    }
}
