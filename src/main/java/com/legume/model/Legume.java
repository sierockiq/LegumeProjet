package com.legume.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "LEGUME",  uniqueConstraints = {
		@UniqueConstraint(columnNames = "NAME")})
public class Legume implements java.io.Serializable {

	private Integer legumeId;
	private String name;

	public Legume() {
	}

	public void setLegumeId(Integer legumeId) {
		this.legumeId = legumeId;
	}

	public Legume(String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "LEGUME_ID", unique = true, nullable = false)
	public Integer getLegumeId() {
		return this.legumeId;
	}

	public void setStockId(Integer legumeId) {
		this.legumeId = legumeId;
	}

	@Column(name = "NAME", unique = true, nullable = false, length = 10)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Stock [legumeId=" + legumeId + ", name=" + name+ "]";
	}
}