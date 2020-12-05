package miu.edu.lab11.domain;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
//@NamedQuery(name = "Employee.findEmployeesByLastName", query = "SELECT e FROM Employee e WHERE LOWER(e.lastName) = LOWER(:lastName)")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EMP_ID")
	private long id;

	@Column(name = "F_NAME")
	private String firstName;
	@Column(name = "L_NAME")
	private String lastName;
	private Integer salary;

	@OneToMany(cascade = CascadeType.ALL)
	@Fetch(FetchMode.JOIN)
	@JoinColumn
	private List<Phone> phones;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
}
