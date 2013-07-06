package repository;

import java.util.List;

import models.Province;

public class ProvinceRepository {
    private ProvinceResource provinceResource = new ProvinceResource();
    
    public ProvinceRepository() {
        
    }

	public List<Province> getAllProvinces() {
		return this.provinceResource.getAllProvinces();
	}
    
//    public Set<Province> getAllProvinces(){
//        return this.resourse.values();        
//    }
    
}
