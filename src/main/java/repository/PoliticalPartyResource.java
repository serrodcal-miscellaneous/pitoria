package repository;

import java.util.HashMap;
import java.util.Map;

import models.PoliticalParty;

public class PoliticalPartyResource {

    private Map<String, PoliticalParty> politicalPartyMap = new HashMap<String, PoliticalParty>();
    
    public PoliticalPartyResource() {
        this.initilize();
    }
    
    private void initilize() {
        //Meter codigo que inicialice el mapa
        this.politicalPartyMap.put("PSOE", new PoliticalParty("PSOE", 1979, "Madrid"));
        this.politicalPartyMap.put("PP", new PoliticalParty("PP", 1977, "Madrid"));
        this.politicalPartyMap.put("IU", new PoliticalParty("IU", 1986, "Madrid"));
        this.politicalPartyMap.put("UPYD", new PoliticalParty("UPYD", 2007, "Madrid"));
    }
    
}
