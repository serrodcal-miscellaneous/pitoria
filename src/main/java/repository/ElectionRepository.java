package repository;

import java.util.Set;

import models.PoliticalParty;

public class ElectionRepository {

    private ElectionResource electionResource = new ElectionResource();
    
    public ElectionRepository() {
        
    }

    public Set<PoliticalParty> getAllPoliticalPartyByProvince(Integer codeProvince) {
        return this.electionResource.getAllPoliticalPartyByProvince(codeProvince);
    }
    
}
