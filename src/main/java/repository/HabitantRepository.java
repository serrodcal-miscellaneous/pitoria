package repository;

import java.util.LinkedList;
import java.util.List;

import models.Habitant;

public class HabitantRepository {
    
    private HabitantResource habitantResource = new HabitantResource();
    
    public HabitantRepository() {
        
    }
    
//    public Habitant getHabitant(String id) {
//        return habitantMap.get(id);
//    }
//    
    public List<Habitant> getAllHabitants() {
        return this.habitantResource.getAllHabitants();
    }
//    
//    public Integer getPopulationSize() {
//        Collection<Habitant> population = this.getPopulation();
//        
//        return population.size();
//    }

    public Boolean habitantHasVoted(String id) {
        return this.habitantResource.habitantHasVoted(id);
    }

    public void votingRecord(Habitant habitant) {
        this.habitantResource.votingRecord(habitant);
    }

    public Boolean existsId(String id) {
        return this.habitantResource.containsId(id);
    }

	public List<Habitant> getAllHabitantsByProvince(Integer code) {
		List<Habitant> habitants = this.habitantResource.getAllHabitants();
		List<Habitant> filter = new LinkedList<Habitant>();
		for (Habitant habitant : habitants) {
			if (habitant.getCodeProvince().equals(code)) {
				filter.add(habitant);
			}
		}
		return filter;
	}
    
}
