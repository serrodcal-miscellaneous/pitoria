package view;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import models.Habitant;
import models.PoliticalParty;
import models.Province;

import org.springframework.beans.factory.annotation.Autowired;

import repository.Repository;

public class ResultElectionUC {

	@Autowired
	Repository repository;
	List<Province> provinces;
	
	public ResultElectionUC(Repository repository) {
		this.repository = repository;
		this.provinces = repository.provinceRepository.getAllProvinces();
		makeUserCase();
	}

	private void makeUserCase() {
		System.out.println("==========Caso de uso 2: Calculo de resultados.==========");
		for (Province province : this.provinces) {
			System.out.println("--- Provincia " + province.getName() + " ---");
			List<Habitant> habitants = this.getAllHabitantsByProvince(province.getCode());
			List<Habitant> filterHabitants = this.canVoteFilterAndVote(habitants); 
			//Se filtran para eliminar los que no pueden votar
			//Ya tenemos todos los votantes de esa provincia
			Integer numTotalVoters = canVoteFilter(habitants).size();
			System.out.println("Numero total de votantes: " + numTotalVoters);
//			Integer validVotes = this.getValidVotes(filterHabitants);
			Integer validVotes = filterHabitants.size();
			System.out.println("Votos validos: " + numTotalVoters);
			Set<PoliticalParty> politicalPartiesProvince = this.repository.electionRepository.getAllPoliticalPartyByProvince(province.getCode());
			System.out.println("Partidos que se han presentado a la provincia: " + politicalPartiesProvince);
			//Ahora hay que traerse los votos por partidos en dicha provincia y ordenarlos por votos
			Map<PoliticalParty, Integer> politicalPartiesNumVotes = this.getVotesForPoliticalParty(filterHabitants, politicalPartiesProvince);
			System.out.println("Votos de los partidos en la provincia: " + politicalPartiesNumVotes);
			//Ahora llamar a MethodHont
			//devolver el resultado
			CountingMethod method = new DHontMethod();
			Map<PoliticalParty, Integer> politicalPartiesResults = method.doResult(politicalPartiesNumVotes, province.getRepresentatives()); //Llamar al metodo que necesitemos
			//Mostar resultados (sin orden)
			for(PoliticalParty p : politicalPartiesResults.keySet()){
				System.out.println(p+" con "+politicalPartiesResults.get(p)+" escanios.");
			}
			
			//Mostrar politicalPartiesResults ordenados por cantidad de votos
			printPartiesOrderedByRepresentatives(politicalPartiesResults);
		}
	}

	private void printPartiesOrderedByRepresentatives(Map<PoliticalParty, Integer> politicalPartiesResults){
		List<PoliticalParty> parties = new ArrayList<PoliticalParty>();//Lista a devolver
		List<PoliticalParty> aux = new ArrayList<PoliticalParty>(politicalPartiesResults.keySet());
		List<Integer> escanios = new ArrayList<Integer>(politicalPartiesResults.values());
		for(Integer esc: escanios){
			for(PoliticalParty p:aux){
				if(politicalPartiesResults.get(p).equals(esc) && !parties.contains(p)){
					parties.add(p);
					break;
				}
			}
		}
		System.out.println("Partidos ordenados por escanios: ");
		System.out.println(parties);
	}
	
	private Map<PoliticalParty, Integer> getVotesForPoliticalParty(
			List<Habitant> filterHabitants, Set<PoliticalParty> politicalPartiesProvince) {
		Map<PoliticalParty, Integer> politicalPartiesNumVotes = new HashMap<PoliticalParty, Integer>();
		for (PoliticalParty politicalParty : politicalPartiesProvince) {
			Integer cont = Integer.valueOf(0);
			for (Habitant habitant : filterHabitants) {
				if (habitant.getNamePoliticalParty().equals(politicalParty.getName())) {
					cont ++;
				}
			}
			politicalPartiesNumVotes.put(politicalParty, cont);
		}
		return politicalPartiesNumVotes;
	}

//	private Integer getValidVotes(List<Habitant> filterHabitants) {
//		Integer res = Integer.valueOf(0);
//		for(Habitant habitant : filterHabitants){
//			if(habitant.isValidVotes()){
//				res ++;
//			}
//		}
//		return res;
//	}

	
	/**
	 * Filter a list of habitants returning a list containing those habitants
	 * who are adult and have right to vote.
	 * */
	private List<Habitant> canVoteFilterAndVote(List<Habitant> habitants) {
		List<Habitant> filter = new LinkedList<Habitant>();
		for (Habitant habitant : habitants){
			if (habitant.isAdult() && habitant.isValidVotes()) {
				filter.add(habitant);
			}
		}
		return filter;
	}
	
	/**
	 * Filter a list of habitants returning a list that contains only those habitants
	 * who are adult.
	 * */
	private List<Habitant> canVoteFilter(List<Habitant> habitants) {
		List<Habitant> filter = new LinkedList<Habitant>();
		for (Habitant habitant : habitants){
			if (habitant.isAdult()) {
				filter.add(habitant);
			}
		}
		return filter;
	}

	private List<Habitant> getAllHabitantsByProvince(Integer code) {
		return this.repository.habitantRepository.getAllHabitantsByProvince(code);
	}

	
}
