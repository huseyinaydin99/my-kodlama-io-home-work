package com.huseyinaydin.onetomany.business.dtos;

import java.util.Collection;
import java.util.Date;

import com.huseyinaydin.onetomany.entities.concretes.SubTechnology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgrammingLanguageDto {
	private Collection<SubTechnology> subTechnologies;
	private Date date;
}
