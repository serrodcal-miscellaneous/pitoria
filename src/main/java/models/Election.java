package models;

public class Election {

    private String id; //Clave primaria
    private Province province; //Clave ajena
    private PoliticalParty politicalParty; //Clave ajena
    private Habitant candidate; //Clave ajena
    
    public Election() {
        this.id = "";
        this.province = new Province();
        this.politicalParty = new PoliticalParty();
    }
    
    public Election(String  id, Province  province, PoliticalParty  partidoPolitico, Habitant  candidate) {
        this.id =  id;
        this.province =  province;
        this.politicalParty =  partidoPolitico;
        this.candidate =  candidate;
    }
    
    public String getId() {
        return id;
    }

    public Habitant getCandidate() {
        return candidate;
    }
    
    public Integer getCodeProvince() {
        return this.province.getCode();
    }

    public PoliticalParty getPoliticalParty() {
        return this.politicalParty;
    }
    
}
