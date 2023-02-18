package com.example.SpringbootProjectUsingPublicApis.service;

import java.util.List;


import com.example.SpringbootProjectUsingPublicApis.model.PublicData;


public interface PublicService {
//	PublicData update(PublicData publicData, int publicId );
	 public PublicData SaveNewData(PublicData publicData );

	
	
	List<PublicData> getAll();		
	

}