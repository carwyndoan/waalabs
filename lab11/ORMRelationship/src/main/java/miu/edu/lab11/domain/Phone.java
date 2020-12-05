/**
 * 
 */
package miu.edu.lab11.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Rujuan Xing
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CELLPHONE")
public class Phone {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;

	@Column(name = "AREA_CODE")
	private Integer areaCode;

	@Column(name = "P_NUMBER")
	private Integer number;
	private Integer prefix;
}
