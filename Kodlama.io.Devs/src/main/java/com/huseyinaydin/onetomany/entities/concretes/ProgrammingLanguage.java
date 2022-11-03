package com.huseyinaydin.onetomany.entities.concretes;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "programminglanguage")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgrammingLanguage {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_PROGRAMMING_LANGUAGE")
	private Long idProgrammingLanguage;
	
	@OneToMany
	@JoinTable(name="PROGRAMMINGLANGUAGE_SUBTECHNOLOGY",joinColumns=@JoinColumn(name = "ID_PROGRAMMING_LANGUAGE"),inverseJoinColumns=@JoinColumn(name = "ID_SUBTECHNOLOGY"))
	private Collection<SubTechnology> subTechnologies = new ArrayList<>();
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_")
	private Date date_;
}
