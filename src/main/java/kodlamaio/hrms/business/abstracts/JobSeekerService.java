package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	
	Result login(String email,String password);
	Result register(JobSeeker jobSeeker);
	
	List<JobSeeker> getAll();
	List<String> getAllEmails();
	List<String> getAllIdentificationNumber();
}
