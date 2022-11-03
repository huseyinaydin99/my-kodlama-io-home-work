package com.huseyinaydin.onetomany.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SUBTECHNOLOGY")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubTechnology {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_SUBTECHNOLOGY")
	private Long subTechnologyId;
	
	@Column(name = "SUBTECHNOLOGYNAME")
	private String subTechnologyName;
	
}
