/**
 * 
 */
package com.students.domain;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @author B.Pirasanth
 *
 */
public class Phone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Max(value = 999, message = "{Phone.size.validation}")
	@Min(value = 100, message = "{Phone.size.validation}")
 	private Integer area;
	@Max(value = 999, message = "{Phone.size.validation}")
	@Min(value = 100, message = "{Phone.size.validation}")
 	private Integer prefix;
	@Max(value = 9999, message = "{Phone.size.validation}")
	@Min(value = 1000, message = "{Phone.size.validation}")
 	private Integer number;
	

 
	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

 	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getPrefix() {
		return prefix;
	}

	public void setPrefix(Integer prefix) {
		this.prefix = prefix;
	}
}
