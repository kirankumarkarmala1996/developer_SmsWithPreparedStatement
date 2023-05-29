package com.Innovative.Dao;

import java.util.List;

import com.Innovative.model.InnovativeStudent;

public interface StudentDao {
	
//	Abstract methods
	
	void save(InnovativeStudent invStudent);
	
	void update(InnovativeStudent invStudent);
	
	void findById(InnovativeStudent invID);
	
	void delete(InnovativeStudent invID);
	
	 List<InnovativeStudent>findAll();

}
