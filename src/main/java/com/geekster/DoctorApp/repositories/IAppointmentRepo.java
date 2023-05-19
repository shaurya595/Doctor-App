package com.geekster.DoctorApp.repositories;

import com.geekster.DoctorApp.models.Appointment;
import com.geekster.DoctorApp.models.AppointmentKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepo extends JpaRepository<Appointment, AppointmentKey> {

    public String findByIdAppId(Long id);
}