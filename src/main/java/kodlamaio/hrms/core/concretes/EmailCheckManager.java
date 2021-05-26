package kodlamaio.hrms.core.concretes;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

import kodlamaio.hrms.core.abstracts.EmailCheckService;

@Component
public class EmailCheckManager implements EmailCheckService {

	private static final String email_pattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	
	@Override
	public boolean emailCheck(String email) {
		Pattern pattern = Pattern.compile(email_pattern,Pattern.CASE_INSENSITIVE);
		return pattern.matcher(email).find();
	}

}
