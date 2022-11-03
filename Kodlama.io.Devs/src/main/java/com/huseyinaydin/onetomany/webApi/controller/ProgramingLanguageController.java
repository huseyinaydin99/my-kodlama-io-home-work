package com.huseyinaydin.onetomany.webApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huseyinaydin.onetomany.business.abstracts.ProgrammingLanguageService;
import com.huseyinaydin.onetomany.business.dtos.ProgrammingLanguageDto;

@RestController //bunun bir rest controller olduğunu spring'e notasyon ile bildiriyoruz.!
@RequestMapping("/api/brands")
public class ProgramingLanguageController {
	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgramingLanguageController(ProgrammingLanguageService programmingLanguageService) {
		super();
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@GetMapping("/getAll")
	List<ProgrammingLanguageDto> getAll(){
		return this.programmingLanguageService.getAll();
	}
	
	@PostMapping("/add")
	void save(ProgrammingLanguageDto programmingLanguageDto) {
		if (programmingLanguageDto.getSubTechnologies() != null && programmingLanguageDto.getDate() != null)
		this.programmingLanguageService.add(programmingLanguageDto);
	}
}
