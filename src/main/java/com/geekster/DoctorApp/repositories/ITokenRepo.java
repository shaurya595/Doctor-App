package com.geekster.DoctorApp.repositories;

import com.geekster.DoctorApp.models.AuthenticationToken;
import com.geekster.DoctorApp.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepo extends JpaRepository<AuthenticationToken, Long> {


    AuthenticationToken findByPatient(Patient patient);

    AuthenticationToken findFirstByToken(String token);
}