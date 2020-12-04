package miu.edu.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity(name="location")
public class Address {

    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
 	private long id;

 	private String street;
	private String city;
	
 	private String state;

 	@Column(name="zip")
  	private String zipCode;
}
