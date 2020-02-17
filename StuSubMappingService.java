package com.ensemble.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensemble.model.StuSubMapping;
import com.ensemble.repository.StuSubMappingRepository;

@Service
public class StuSubMappingService {

	@Autowired
	private StuSubMappingRepository ssmr;
	
	public List<StuSubMapping> getAllMappings(){
		return ssmr.findAll();
	}

	public void loadMappings(StuSubMapping s) {
		ssmr.save(s);
	}
	
	public Optional<StuSubMapping> getMappingsById(int id) {
		return ssmr.findById(id);
	}
	
	public void updateMappings(StuSubMapping s,int id) {
		ssmr.save(s);
	}
	
	public void deleteMappings(StuSubMapping s,int id) {
		ssmr.delete(s);
	}
}
