package com.cvbank.application.enteties.admin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

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
@Table(name="/admin_account")
public class AccountAdminEntety {

	@Id @Column(length=100) @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String firstName;
	private String lastName;
	
	@Email
	private String email;
	@Pattern(regexp="(^$|[0-9]{10})", message="Wrong phone number")
	private int phone;
}