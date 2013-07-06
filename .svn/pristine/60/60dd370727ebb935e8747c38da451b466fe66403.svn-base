package repository;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import models.Habitant;
import models.Province;

public class HabitantResource {
    
    private Map<String, Habitant> habitantMap = new HashMap<String, Habitant>();
    
    public HabitantResource() {
        this.initilize();
    }
    
    @SuppressWarnings("deprecation")
    private void initilize() {
        String prov1 = "Sevilla";
        String prov2 = "Badajoz";
        Province p1 = new Province(41, prov1, 5);
        Province p2 = new Province(06, prov2, 4);
        
        Habitant h1 = new Habitant("1", "Pedro", "Romero Ramos"
                , new Date(1990, 3, 23), "Reina Mercedes", false, p1, null);
        Habitant h2 = new Habitant("2", "Javier", "Pazos Delgado"
                , new Date(1989, 6, 16), "Picassa", false, p1, null);
        Habitant h3 = new Habitant("3", "Carmen", "Servan Jimenez"
                , new Date(1993, 11, 25), "Arriba", false, p1,null);
        Habitant h4 = new Habitant("4", "Sebastian", "Conil Monge"
                , new Date(1992, 12, 01), "Paez de rivera", true, p1, null);
        Habitant h5 = new Habitant("5", "David", "zelaznog adleb"
                , new Date(1992, 5, 22), "Covarsi", true, p1, null);
        Habitant h6 = new Habitant("6", "Sergio", "Peludo Caballero"
                , new Date(1986, 8, 22), "Covarsi", true, p1, null);
        Habitant h7 = new Habitant("7", "Juan Manuel", "Peloz Zopas"
                , new Date(1992, 4, 17), "PineMountain", true, p1, null);
        Habitant h8 = new Habitant("8", "Fernando", "Fernandez Fernandez"
                , new Date(1989, 8, 29), "TwoSisters", false, p1, null);
        
        Habitant h9 = new Habitant("9", "Blanca", "Nieto Abuelo"
                , new Date(2000, 5, 10), "Emerita", false, p2, null);
        Habitant h10 = new Habitant("10", "Esmeralda", "Caro Brillante"
                , new Date(2008, 7, 14), "Gelves", false, p2, null);
        Habitant h11 = new Habitant("11", "Ramon", "Garcia Corchuelo"
                , new Date(2000, 5, 10), "The Haba", true, p2, null);
        Habitant h12 = new Habitant("12", "Clara", "Aguamarina DelValle"
                , new Date(1977,5,12), "Hispalis", false, p2, null);
        Habitant h13 = new Habitant("13", "Alfredo", "Primo Rivera"
                , new Date(1982, 5, 12), "Emerita", false, p2, null);
        Habitant h14 = new Habitant("14", "Franciso", "Garcia Garcia"
                , new Date(1955, 2, 20), "DonVinito", true, p2, null);
        Habitant h15 = new Habitant("15", "Benjamin", "madriguez noses"
                , new Date(2011, 2, 10), "Emerita", false, p2, null);
        
        //Nuevos habitantes
        Habitant h20 = new Habitant("20", "Fernando", "A"
                , new Date(1989, 8, 29), "A", false, p1, null);
        Habitant h21 = new Habitant("21", "Fernando", "B"
                , new Date(1989, 8, 29), "B", false, p1, null);
        Habitant h22 = new Habitant("22", "Fernando", "C"
                , new Date(1989, 8, 29), "C", false, p1, null);
        Habitant h23 = new Habitant("23", "Fernando", "D"
                , new Date(1989, 8, 29), "D", false, p1, null);
        Habitant h24 = new Habitant("24", "Fernando", "E"
                , new Date(1989, 8, 29), "E", false, p1, null);
        Habitant h25 = new Habitant("25", "Fernando", "F"
                , new Date(1989, 8, 29), "F", false, p1, null);
        
        Habitant h26 = new Habitant("26", "Fernando", "G"
                , new Date(1989, 8, 29), "G", false, p2, null);
        Habitant h27 = new Habitant("27", "Fernando", "H"
                , new Date(1989, 8, 29), "H", false, p2, null);
        Habitant h28 = new Habitant("28", "Fernando", "I"
                , new Date(1989, 8, 29), "I", false, p2, null);
        Habitant h29 = new Habitant("29", "Fernando", "J"
                , new Date(1989, 8, 29), "J", false, p2, null);
        Habitant h30 = new Habitant("30", "Fernando", "K"
                , new Date(1989, 8, 29), "K", false, p2, null);
        Habitant h31 = new Habitant("31", "Fernando", "L"
                , new Date(1989, 8, 29), "L", false, p2, null);
        Habitant h32 = new Habitant("32", "Fernando", "M"
                , new Date(1989, 8, 29), "M", false, p2, null);
        
        habitantMap.put(h1.getId(), h1);
        habitantMap.put(h2.getId(), h2);
        habitantMap.put(h3.getId(), h3);
        habitantMap.put(h4.getId(), h4);
        habitantMap.put(h5.getId(), h5);
        habitantMap.put(h6.getId(), h6);
        habitantMap.put(h7.getId(), h7);
        habitantMap.put(h8.getId(), h8);
        habitantMap.put(h9.getId(), h9);
        habitantMap.put(h10.getId(), h10);
        habitantMap.put(h11.getId(), h11);
        habitantMap.put(h12.getId(), h12);
        habitantMap.put(h13.getId(), h13);
        habitantMap.put(h14.getId(), h14);
        habitantMap.put(h15.getId(), h15);
        habitantMap.put(h20.getId(), h20);
        habitantMap.put(h21.getId(), h21);
        habitantMap.put(h22.getId(), h22);
        habitantMap.put(h23.getId(), h23);
        habitantMap.put(h24.getId(), h24);
        habitantMap.put(h25.getId(), h25);
        habitantMap.put(h26.getId(), h26);
        habitantMap.put(h27.getId(), h27);
        habitantMap.put(h28.getId(), h28);
        habitantMap.put(h29.getId(), h29);
        habitantMap.put(h30.getId(), h30);
        habitantMap.put(h31.getId(), h31);
        habitantMap.put(h32.getId(), h32);
        
    }
    
    public List<Habitant> getAllHabitants() {
        return new LinkedList<Habitant>(this.habitantMap.values());
    }

    public Boolean habitantHasVoted(String id) {
        return this.habitantMap.get(id).hasVoted();
    }

    public void votingRecord(Habitant habitant) {
        this.habitantMap.put(habitant.getId(), habitant);
    }

    public Boolean containsId(String id) {
        return this.habitantMap.containsKey(id);
    }
    
}
