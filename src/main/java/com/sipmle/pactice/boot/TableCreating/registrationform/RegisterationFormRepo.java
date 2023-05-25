package com.sipmle.pactice.boot.TableCreating.registrationform;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
@Service
public interface RegisterationFormRepo extends JpaRepository<RegistrationFrom, String>{

}