package miu.edu.restfulemployee.domain;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
@AllArgsConstructor
public class Employee  {
	@Size(min = 4, max = 45, message = "Size of firstname between 4 and 45")
 	private String firstName;
	
 	private String lastName;

 	@Email
 	private String email;
}
