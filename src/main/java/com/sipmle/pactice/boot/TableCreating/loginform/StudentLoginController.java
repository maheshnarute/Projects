package com.sipmle.pactice.boot.TableCreating.loginform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class StudentLoginController {
	@Autowired
	StudentLoginService service;
	@PostMapping
	ResponseEntity<?>student(@RequestBody StudentLogin request ) throws Exception{
		
		return ResponseEntity.ok(service.savestd(request));
	}
//	@DeleteMapping("/delete")
//	ResponseEntity<?>studentre(@RequestBody StudentLogin deleteids) throws Exception{
//		return ResponseEntity.ok(service.deleteid(deleteids));
//		}
	
}
