package com.ensemble.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ensemble.model.StuSubMapping;
import com.ensemble.service.StuSubMappingService;

@RestController
public class StuSubMappingContoller {
	
	@Autowired
    private StuSubMappingService ssms;
	
	@GetMapping("/mapping")
	public List<StuSubMapping> getAllMappings(){
		return ssms.getAllMappings();
	}
	
	@PostMapping("/mapping")
	public void loadMappings(@RequestBody StuSubMapping s) {
		ssms.loadMappings(s);
	}
	
	@GetMapping("/mapping/{id}")
	public Optional<StuSubMapping> getMappingsById(@PathVariable int id) {
		return ssms.getMappingsById(id);
	}
	
	@PutMapping("/mapping/{id}")
	public void updateMappings(@RequestBody StuSubMapping s,@PathVariable int id) {
		ssms.updateMappings(s,id);
	}
	
	@DeleteMapping("/mapping/{id}")
	public void deleteMappigs(StuSubMapping s,@PathVariable int id) {
		ssms.deleteMappings(s,id);
	}


}
