package com.huseyinaydin.onetomany.webApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huseyinaydin.onetomany.business.abstracts.ProgrammingLanguageService;
import com.huseyinaydin.onetomany.business.abstracts.SubTechnologyService;
import com.huseyinaydin.onetomany.business.dtos.ProgrammingLanguageDto;
import com.huseyinaydin.onetomany.business.dtos.SubTechnologyDto;

@RestController //bunun bir rest controller olduğunu spring'e notasyon ile bildiriyoruz.!
@RequestMapping("/api/brands")
public class SubTechnologyController {
	private SubTechnologyService subTechnologyService;

	@Autowired
	public SubTechnologyController(SubTechnologyService subTechnologyService) {
		super();
		this.subTechnologyService = subTechnologyService;
	}
	
	@GetMapping("/getAll")
	List<SubTechnologyDto> getAll(){
		return this.subTechnologyService.getAll();
	}
	
	@PostMapping("/add")
	void save(SubTechnologyDto subTechnologyServiceDto) {
		if (subTechnologyServiceDto.getSubTechnologyId() != null && subTechnologyServiceDto.getSubTechnologyName() != null)
		this.subTechnologyService.add(subTechnologyServiceDto);
	}
}
