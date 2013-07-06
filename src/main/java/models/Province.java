package models;

public class Province {
    
    private Integer code;
    private String name;
    private Integer representatives;
    
    public Province() {
        this.code = Integer.valueOf(0);
        this.name = "";
        this.representatives = Integer.valueOf(0);
    }
    
    public Province(Integer code, String name, Integer representatives) {
        this.code = code;
        this.name = name;
        this.representatives = representatives;
    }
    
    //Metodos consultores y modificadores
    public Integer getCode() {
        return code;
    }
    
    public String getName() {
        return name;
    }
    
    public Integer getRepresentatives() {
        return representatives;
    }
    
    public int compareTo(Province o) {
        int res = 0;
        res = this.getCode().compareTo(o.getCode());
        if  (res == 0) {
            res = this.getName().compareTo(o.getName());
            if(res == 0) {
            	res = this.getRepresentatives().compareTo(o.getRepresentatives());
            }
        }
        
        return res;
    }
    
    public boolean equals(Object o) {
        Boolean res = false;
        if (o instanceof Province) {
            Province p = (Province) o;
            res = this.getCode().equals(p.getCode());
            if  (res == true) {
                res = this.getName().equals(p.getName());
                if (res == true) {
                	res = this.getRepresentatives().equals(((Province) o).getRepresentatives());
                }
            }
        }
        return res;
    }
    
    public int hashCode() {
    	return this.getCode() * 31 * 31 + this.getName().hashCode() * 31 + this.getRepresentatives();
    }
    
    public String toString() {
        return this.getName() + "-" + this.getCode()
        		+ "(" + this.getRepresentatives() + ")";
    }
    
    
}
