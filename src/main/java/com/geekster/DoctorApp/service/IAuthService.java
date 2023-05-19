package com.geekster.doctorApp.service;
import com.geekster.DoctorApp.models.AuthenticationToken;
import com.geekster.DoctorApp.models.Patient;

public class IAuthService {

    void saveToken(AuthenticationToken token);
    AuthenticationToken getToken(Patient patient);
    boolean authenticate(String userEmail, String token);


}
