package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.Entities;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@PrimaryKeyJoinColumn(name = "user_id")
@Data
@NoArgsConstructor
@Table(name="employees")
@Entity
@EqualsAndHashCode(callSuper = false)
public class Employee extends User implements Entities {
	
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name ="last_name")
	private String lastName;
	
	public Employee(String email,String password,String firstName,String lastName) {
		
		super(email,password);
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
}
