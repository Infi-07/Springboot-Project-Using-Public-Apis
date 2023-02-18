package com.example.SpringbootProjectUsingPublicApis.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringbootProjectUsingPublicApis.model.PublicData;
import com.example.SpringbootProjectUsingPublicApis.repository.PublicReposistory;
import com.example.SpringbootProjectUsingPublicApis.service.PublicService;


@RestController
@RequestMapping("/publics")
public class PublicController {
	@Autowired
	public PublicService publicService;
	@Autowired
	private PublicReposistory IRepo;
	//insertNewData
	
	@GetMapping("/category")
	public ResponseEntity<List<PublicData>> getDataByCatageroies(@RequestParam String category) {
 		
		return new ResponseEntity<List<PublicData>>(IRepo.findByCategory(category), HttpStatus.OK);
		
	}
	
	
	
@PostMapping("/entries")
	public PublicData SaveNewData(@RequestBody  PublicData publicData) {
	
	return publicService.SaveNewData(publicData);	
}

	@GetMapping("")
	public ResponseEntity<List<PublicData> >getAll(){
		List<PublicData> all = this.publicService.getAll();
		return new ResponseEntity<>(all, HttpStatus.OK);
		
	}
	
	
	
	

}
