package com.huseyinaydin.onetomany.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huseyinaydin.onetomany.entities.concretes.SubTechnology;

public interface SubTechnologyRepository extends JpaRepository<SubTechnology, Long> {

}
