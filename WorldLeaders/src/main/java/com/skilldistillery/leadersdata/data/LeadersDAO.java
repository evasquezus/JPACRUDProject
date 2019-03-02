package com.skilldistillery.leadersdata.data;

import java.util.List;

import com.skilldistillery.leadersdata.entities.Leaders;

public interface LeadersDAO {

	public Leaders create(Leaders leader);

	public Leaders update(int id, Leaders leader);

	public boolean destroy(int id);
	
	Leaders findById(int id);
	
	List<Leaders> findAll();

	Leaders update(int id, Leaders leader, String firstName, String lastName, String gender, String country,
			String birthPlace);


}
