package com.hospital.appointment.Appointment_storage;

import org.springframework.data.repository.CrudRepository;

import com.hospital.appointment.Appointment_storage.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment,String>,CustomRepository,CustomTwo{

	
	
}
