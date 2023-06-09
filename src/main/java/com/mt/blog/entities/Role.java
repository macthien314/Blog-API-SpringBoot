package com.mt.blog.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "roles")
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Role {
	@Id
	private int id;

	private String name;
}
