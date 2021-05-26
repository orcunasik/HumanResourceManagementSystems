package kodlamaio.hrms.emailService;

import org.springframework.stereotype.Service;

@Service
public class EmailSendManager {

	public void emailSend(String email) {
		System.out.println("Doğrulama Kodu '"+email+"' Adresine Gönderildi");
	}
}
