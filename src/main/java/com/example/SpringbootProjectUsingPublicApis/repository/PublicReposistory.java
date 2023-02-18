package com.example.SpringbootProjectUsingPublicApis.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringbootProjectUsingPublicApis.model.PublicData;

@Repository
public interface PublicReposistory extends JpaRepository <PublicData, Integer>{

	List<PublicData> findByCategory(String category);

}
