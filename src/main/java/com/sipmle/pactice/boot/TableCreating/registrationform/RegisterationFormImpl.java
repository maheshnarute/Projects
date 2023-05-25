package com.sipmle.pactice.boot.TableCreating.registrationform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public class RegisterationFormImpl implements RegisterationFormService {
	@Autowired
	RegisterationFormRepo resiterRepo;

	@Override
	public ResponseEntity<?> saveinfo(RegistrationFrom request) {
		resiterRepo.save(request);
		return new ResponseEntity<>("Submitsuccess",HttpStatus.OK);
	}

}
