package models;

public class PoliticalParty {
    
    private String name; //calve primaria
    private Integer foundedDate;
    private String headquarter;
    
    public PoliticalParty() {
        this.name = new String("");
        this.foundedDate = Integer.valueOf(0);
        this.headquarter = new String();
    }
    
    public PoliticalParty(String name, Integer foundedDate, String headquarter) {
        this.name = name;
        this.foundedDate = foundedDate;
        this.headquarter = headquarter;
    }
    
    public Boolean isWhiteVote(){
    	return this.name.isEmpty();
    }
    
    public String getName() {
        return this.name;
    }
    
    public Integer getFounded() {
        return this.foundedDate;
    }
    
    public boolean equals(Object o) {
        boolean res = false;
        if (o instanceof PoliticalParty) {
            PoliticalParty p = (PoliticalParty) o;
            res = this.getName().equals(p.getName()) && this.getFounded().equals(p.getFounded());
        }
        return res;
    }
    
    public int hashCode() {
    	return getName().hashCode() * 31 + getFounded().hashCode();
    }
    
    public String toString() {
        String s = "";
        s = this.getName() + ", (" + this.getFounded() + ")";
        return s;
    }
    
    public int compareTo(PoliticalParty p) {
        int cmp = 0;
        cmp = this.getName().compareTo(p.getName());
        if (cmp == 0) {
            cmp = this.getFounded().compareTo(p.getFounded());
        }
        return cmp;
    }

    public String getHeadquarter() {
        return headquarter;
    }
}
