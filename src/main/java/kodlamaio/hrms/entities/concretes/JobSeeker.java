package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

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
@Table(name ="job_seekers")
@Entity
@EqualsAndHashCode(callSuper = false)
public class JobSeeker extends User implements Entities{

	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "identity_number")
	private String identityNumber;
	
	@Column(name = "birth_date")
	private LocalDate birthDate;
	
	public JobSeeker(String email,String password,String firstName,
			String lastName,String identityNumber,LocalDate birthDate ) {
		
		super(email,password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthDate = birthDate;
	}
	
}
