package kodlamaio.hrms.core.concretes;


import java.rmi.RemoteException;

import org.springframework.stereotype.Component;

import kodlamaio.hrms.core.abstracts.MernisCheckService;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


@Component
public class MernisCheckAdapter implements MernisCheckService {

	@Override
	public boolean checkIfRealPerson(JobSeeker jobSeeker) {

		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(
					Long.valueOf(jobSeeker.getIdentityNumber()),
					jobSeeker.getFirstName().toUpperCase(),
					jobSeeker.getLastName().toUpperCase(),
					jobSeeker.getBirthDate().getYear()
					);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
