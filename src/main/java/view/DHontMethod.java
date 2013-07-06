package view;

import java.util.HashMap;
import java.util.Map;

import models.PoliticalParty;

public class DHontMethod implements CountingMethod{

	private Map<PoliticalParty, Integer> divisions = new HashMap<PoliticalParty, Integer>();
	
	public DHontMethod() {
		
	}
	
	public Map<PoliticalParty, Integer> doResult(Map<PoliticalParty, Integer> votes, Integer numRepresentativesProvince){
		//No vamos a filtrar los partidos con pocos votos como en Espania
		Map<PoliticalParty, Integer> representation = new HashMap<PoliticalParty
				, Integer>();
		System.out.println("===Se va a ejecutar el metodo DHont===");
		this.fillDivisions(votes); //Rellena el mapa necesario para las divisiones
		for (int iter=numRepresentativesProvince-1; iter>=0; iter--) {
			System.out.println("Iteracion:");
			//Obtiene el partido con mas votos
			PoliticalParty politicalParty = this.getMaxVotesPoliticalParty(votes);
			Integer votesForPoliticalParty = votes.get(politicalParty);
			System.out.println("El partido " + politicalParty.getName() + 
					" ha obtenido un nuevo escanio por tener " + votesForPoliticalParty + " votos");
			Integer divisor = divisions.get(politicalParty);
			Integer newVotes = votesForPoliticalParty / divisor;
			votes.put(politicalParty, newVotes);
			//Actualizamos la division siguiente para ese partido
			//Se utilizara en caso de seguir siendo el partido con mas votos
			divisions.put(politicalParty, divisor + 1);
			if (representation.containsKey(politicalParty)) {
				//Actualizamos, aumentamos en uno el representante
				Integer oldValue = representation.get(politicalParty);
				representation.put(politicalParty, oldValue + 1);
			}else{
				//Es el primer representante que obtiene este partido
				representation.put(politicalParty, Integer.valueOf(1));
			}
		}
		return representation;
	}

	private PoliticalParty getMaxVotesPoliticalParty(
			Map<PoliticalParty, Integer> votes) {
		//Debemos obtener el partido politico que tenga mas votos.
		Integer max = Integer.valueOf(0);
		PoliticalParty res = new PoliticalParty();
        System.out.println("Lista de partidos: " + votes.toString());
		for (PoliticalParty politicalParty : votes.keySet()) {
			Integer votosDePoliticalParty = votes.get(politicalParty);
			if(votosDePoliticalParty.compareTo(max) >= 0){
				max = votes.get(politicalParty);
				res = politicalParty;
			}
		}
		return res; //Cuidado con que el partido politico sea blanco, no deberia!
	}
	
	//Rellena para inicializar el mapa para las divisiones
	private void fillDivisions(Map<PoliticalParty, Integer> votes) {
		for (PoliticalParty politicalParty : votes.keySet()) {
			//Inicialmente siempre se divide entre dos
			this.divisions.put(politicalParty, Integer.valueOf(2));
		}
	}
	
}
