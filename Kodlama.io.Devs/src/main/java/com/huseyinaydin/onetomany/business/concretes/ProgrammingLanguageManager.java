package com.huseyinaydin.onetomany.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.huseyinaydin.onetomany.business.abstracts.ProgrammingLanguageService;
import com.huseyinaydin.onetomany.business.dtos.ProgrammingLanguageDto;
import com.huseyinaydin.onetomany.dataAccess.abstracts.ProgrammingLaguageRepository;
import com.huseyinaydin.onetomany.entities.concretes.ProgrammingLanguage;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
@Service // bu sınıf bir business nesnesidir.!
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	private ProgrammingLaguageRepository programmingLaguageRepository;
	private final ProgrammingLaguageRepository expenseRepository;
	private final ModelMapper modelMapper;

	@Override
	public List<ProgrammingLanguageDto> getAll() {
		List<ProgrammingLanguage> languages = this.programmingLaguageRepository.findAll().stream().map(i -> i)
				.collect(Collectors.toList());
		List<ProgrammingLanguageDto> languageDtos = new ArrayList<>();
		for (ProgrammingLanguage language : languages) {
			languageDtos.add(new ProgrammingLanguageDto(language.getSubTechnologies(), language.getDate_()));
		}
		return languageDtos;
	}

	@Override
	public void add(ProgrammingLanguageDto languageDto) {
		if (languageDto.getSubTechnologies() != null && languageDto.getDate() != null) {
			ProgrammingLanguage programmingLanguage = modelMapper.map(languageDto, ProgrammingLanguage.class);
			programmingLanguage.setDate_(languageDto.getDate());
			this.programmingLaguageRepository.save(programmingLanguage);
		}
	}

	private ProgrammingLanguage mapToDTO(ProgrammingLanguageDto languageDto) {
		ProgrammingLanguage programmingLanguage = modelMapper.map(languageDto, ProgrammingLanguage.class);
		programmingLanguage.setDate_(languageDto.getDate());
		return programmingLanguage;
	}

}
