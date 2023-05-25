package com.sipmle.pactice.boot.TableCreating.loginform;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
@Service
public interface StudentLoginRepo extends JpaRepository<StudentLogin, String>{

}
