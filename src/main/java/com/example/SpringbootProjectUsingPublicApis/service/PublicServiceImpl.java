package com.example.SpringbootProjectUsingPublicApis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringbootProjectUsingPublicApis.model.PublicData;
import com.example.SpringbootProjectUsingPublicApis.repository.PublicReposistory;

@Service
public class PublicServiceImpl implements PublicService {
	
	PublicReposistory  publicRepository;
	
@Autowired
	public PublicServiceImpl(PublicReposistory publicRepository ) {
		super();
		this.publicRepository = publicRepository;
	}
@Override
public PublicData SaveNewData(PublicData publicData) {
	// TODO Auto-generated method stub
	return publicRepository.save(publicData);
	
}

	@Override
	public List<PublicData> getAll() {
		List<PublicData> all =  this.publicRepository.findAll();
		return all;
	}

}
