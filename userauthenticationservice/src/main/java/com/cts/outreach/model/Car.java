package com.cts.outreach.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Table(name="cars")
@Entity
@Data
@XmlRootElement
public class Car {
	
	@Id
	@Column(name="CARID")
	private int carId;
	@Column(name="CARNAME")
	private String carName;
	@Column(name="PRICE")
	private int price;
	
	
	

}
