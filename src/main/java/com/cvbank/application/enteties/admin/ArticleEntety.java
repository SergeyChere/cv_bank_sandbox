package com.cvbank.application.enteties.admin;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter @Getter
@ToString
@EqualsAndHashCode

@Entity
@Table(name="article")
public class ArticleEntety {

	@Id
	private int id;
	
	private String title;
	private String body;
}