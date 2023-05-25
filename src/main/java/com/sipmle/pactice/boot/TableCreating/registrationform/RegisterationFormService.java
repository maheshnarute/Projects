package com.sipmle.pactice.boot.TableCreating.registrationform;

import org.springframework.http.ResponseEntity;

public interface RegisterationFormService {
	ResponseEntity<?>saveinfo(RegistrationFrom request);

}
