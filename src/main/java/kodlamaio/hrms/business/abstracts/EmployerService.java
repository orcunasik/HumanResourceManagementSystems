package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerService {

	Result login(String email, String password);
	Result register(Employer employer);
	
	List<Employer> getAll();
	List<String> getAllEmails();
}
