package com.huseyinaydin.onetomany.business.abstracts;

import java.util.List;
import com.huseyinaydin.onetomany.business.dtos.ProgrammingLanguageDto;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguageDto> getAll();
	void add(ProgrammingLanguageDto languageDto);
}
