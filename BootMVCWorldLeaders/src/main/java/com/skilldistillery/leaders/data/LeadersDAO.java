package com.skilldistillery.leaders.data;

import java.util.List;

import com.skilldistillery.leadersdata.entities.Leaders;

public interface LeadersDAO {

	public Leaders create(Leaders leader);

	public Leaders update(int id, Leaders leader);

	public boolean destroy(int id);

	Leaders findById(int id);

	List<Leaders> findAll();

	boolean destroy(Leaders leaderId, int id);
	
	boolean editFilm(Leaders leadersID, int id);

}
