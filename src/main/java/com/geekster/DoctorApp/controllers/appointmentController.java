package com.geekster.DoctorApp.controllers;

import com.geekster.DoctorApp.models.Appointment;
import com.geekster.DoctorApp.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("appointment")
public class appointmentController {


        @Autowired
        AppointmentService appointmentService;

        @PostMapping()
        public void bookAppointment(@RequestBody Appointment appointment)
        {
            appointmentService.bookAppointment(appointment);
        }

    }


