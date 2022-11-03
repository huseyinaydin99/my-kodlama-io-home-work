package com.huseyinaydin.onetomany.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.huseyinaydin.onetomany.entities.concretes.ProgrammingLanguage;


public interface ProgrammingLaguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
	
}
