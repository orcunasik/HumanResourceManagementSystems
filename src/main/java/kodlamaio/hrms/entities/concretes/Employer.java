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
@Entity
@Table(name = "employers")
@EqualsAndHashCode(callSuper = false)
public class Employer extends User implements Entities {

	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "web_address")
	private String webAddress;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "is_activated")
	private boolean isActivated;
	
	public Employer(String email,String password,String companyName, String webAddress,
			String phoneNumber,boolean isActivated) {
		
		super(email,password);
		this.companyName = companyName;
		this.webAddress = webAddress;
		this.phoneNumber = phoneNumber;
		this.isActivated = isActivated;
	}
	
}
