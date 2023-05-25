package com.sipmle.pactice.boot.TableCreating.registrationform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/show")
public class RegisterationFormController {
	@Autowired
	RegisterationFormService registrationService;

	@PostMapping
	public ResponseEntity<?>createAuthenticationToken(@RequestBody RegistrationFrom request) throws Exception{
		return ResponseEntity.ok(registrationService.saveinfo(request));
		
	}
}
