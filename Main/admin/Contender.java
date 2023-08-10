package admin;

public class Contender {
    private String name;
    private String symbol;
    private int myScore = 0;

    //boolean isEligible;
    public Contender(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
        //isEligible=true;
    }
    public String name()
    {
    	return name;
    }
    public String symbol()
    {
    	return symbol;
    }
    public int myScore()
    {
    	return myScore;
    }

    public void castForMe() {
        Main.totalParticipated++;
        //if(!isEligible) throw new Disqualified();
        myScore++;
    }
}
