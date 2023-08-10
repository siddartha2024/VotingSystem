package admin;

public class Contender {
    public String name;
    public String symbol;
    public int myScore = 0;

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

    public void castForMe() {
        Main.totalParticipated++;
        
        myScore++;
    }
}
