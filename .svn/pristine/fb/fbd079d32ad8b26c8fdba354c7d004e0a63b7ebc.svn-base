package models;

import java.util.Date;

public class Habitant {

    private String id; //calve primaria
    private String name;
    private String surname;
    private Date dateBirthday;
    private String address;
    private Boolean isCandidate;

    private Province province; //clave ajena
    private PoliticalParty politicalParty; // clave ajena

    public Habitant() {
        this.id = "";
        this.name = new String();
        this.surname = "";
        this.dateBirthday = new Date();
        this.address = "";
        this.isCandidate = false;
        this.province = new Province();
        this.politicalParty = null; //Ojo con esto
    }

    public Habitant(String  id, String  name
            , String  surname, Date  dateBirthday, String  address
            , Boolean  isCandidate, Province  province, PoliticalParty  politicalParty) {
        this.id =  id;
        this.name =  name;
        this.surname =  surname;
        this.dateBirthday = (Date)  dateBirthday.clone();
        this.address =  address;
        this.isCandidate =  isCandidate;
        this.province =  province;
        this.politicalParty =  politicalParty;
    }
    
    public Boolean isValidVotes(){
    	Boolean res = true;
    	if (this.politicalParty == null){
    		res = false;
    	}
    	return res;
    }

    public String getAddress() {
        return address;
    }

    public Boolean getIsCandidate() {
        return isCandidate;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public Integer getCodeProvince() {
        return this.province.getCode();
    }

    public Date getDateBirthday() {
        return this.dateBirthday;
    }

    @SuppressWarnings("deprecation")
	public Boolean isAdult() {
        Date actualDate = new Date();
        Integer actualYear = Integer.valueOf(actualDate.getYear()); //Devuelve el anio tras quitarle 1900
        Integer birthDateYear = Integer.valueOf(dateBirthday.getYear());
        Integer age = (actualYear + 1900) - birthDateYear;
        return age > 18;
    }

    public Boolean hasVoted() {
        Boolean res = true;
        if (this.politicalParty == null) {
            res = false;
        }
        return res;
    }

    public boolean equals(Object o) {
        boolean res = false;
        if (o instanceof Habitant) {
            Habitant copia = (Habitant)  o;
            res = this.getId().equals(copia.getId()); //cuidado con claves ajenas y isCandidate
        }
        return res;
    }
    
    public int hashCode() {
    	return getId().hashCode();
    }

    public String toString() {
        return this.getId();
    }

    public int compareTo(Habitant  h) {
        return this.getId().compareTo(h.getId());
    }

    public void setVote(PoliticalParty elected) { //registra el voto
        this.politicalParty = elected;
    }

	public String getNamePoliticalParty() {
		return this.politicalParty.getName();
	}
}
