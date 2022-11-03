package com.huseyinaydin.onetomany.business.abstracts;

import java.util.List;

import com.huseyinaydin.onetomany.business.dtos.SubTechnologyDto;

public interface SubTechnologyService {
	List<SubTechnologyDto> getAll();
	void add(SubTechnologyDto subTechnologyDto);
}
