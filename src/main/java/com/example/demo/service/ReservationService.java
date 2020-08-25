package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ReservationDao;
import com.example.demo.dto.Reservation;

@Service
public class ReservationService {
	
	@Autowired
	ReservationDao ReservationDao;
	
	public List<Reservation> getAllReservation() {
		List<Reservation> Reservations = ReservationDao.getReservationList();
		return Reservations;
	}
	public boolean insertReservation(Reservation r) {
		return ReservationDao.addReservation(r);
	}
	public boolean updateReservation(Reservation r) {
		return ReservationDao.updateReservation(r);
	}
	public boolean deleteReservation(Reservation r) {
		return ReservationDao.deleteReservation(r);
	}

}