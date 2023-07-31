package admin;

public class Contender {
    public String name;
    public String symbol;
    public int myScore = 0;

    //boolean isEligible;
    public Contender(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
        //isEligible=true;
    }

    public void castForMe() {
        Main.totalParticipated++;
        //if(!isEligible) throw new Disqualified();
        myScore++;
    }
}
