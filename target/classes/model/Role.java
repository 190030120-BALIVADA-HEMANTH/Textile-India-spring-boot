package com.sheryians.major.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Data
@Table(name = "roles")
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
    
	
	@Column(nullable = false , unique = true)
	@NotEmpty
	private String name;

	@ManyToMany(mappedBy = "roles")
	private List<User> users;
	
}
