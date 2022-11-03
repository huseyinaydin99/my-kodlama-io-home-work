package com.huseyinaydin.onetomany.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.huseyinaydin.onetomany.business.abstracts.SubTechnologyService;
import com.huseyinaydin.onetomany.business.dtos.ProgrammingLanguageDto;
import com.huseyinaydin.onetomany.business.dtos.SubTechnologyDto;
import com.huseyinaydin.onetomany.dataAccess.abstracts.ProgrammingLaguageRepository;
import com.huseyinaydin.onetomany.dataAccess.abstracts.SubTechnologyRepository;
import com.huseyinaydin.onetomany.entities.concretes.ProgrammingLanguage;
import com.huseyinaydin.onetomany.entities.concretes.SubTechnology;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
@Service //bu sınıf bir business nesnesidir.!
public class SubTechnologyManager implements SubTechnologyService {
	private SubTechnologyRepository subTechnologyRepository;
	private final ProgrammingLaguageRepository expenseRepository;
	private final ModelMapper modelMapper;
	
	@Override
	public List<SubTechnologyDto> getAll() {
		List<SubTechnology> subTechnologies = this.subTechnologyRepository.findAll().stream().map(i->i).collect(Collectors.toList());
		List<SubTechnologyDto> subTechnologiesDtos = new ArrayList<>();
		for(int i = 0; i < subTechnologies.size(); i++) {
			subTechnologiesDtos.add(new SubTechnologyDto(subTechnologies.get(i).getSubTechnologyId(),subTechnologies.get(i).getSubTechnologyName()));
		}
		return subTechnologiesDtos;
	}
	
	@Override
	public void add(SubTechnologyDto subTechnologiesDto) {
		SubTechnology subTechnology = modelMapper.map(subTechnologiesDto, SubTechnology.class);
		this.subTechnologyRepository.save(subTechnology);
	}
	
	private ProgrammingLanguage mapToDTO(ProgrammingLanguageDto languageDto) {
		ProgrammingLanguage programmingLanguage = modelMapper.map(languageDto, ProgrammingLanguage.class);
		programmingLanguage.setDate_(languageDto.getDate());
		return programmingLanguage;
	}
}
