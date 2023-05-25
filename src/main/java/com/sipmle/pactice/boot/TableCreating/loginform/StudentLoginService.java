package com.sipmle.pactice.boot.TableCreating.loginform;

import org.springframework.http.ResponseEntity;

public interface StudentLoginService {
	ResponseEntity<?>savestd(StudentLogin request);
	

}
