package com.example.demo.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.Reservation;
import com.example.demo.service.ReservationService;

@Controller
public class ReservationController {
	@Autowired
	ReservationService reservationService;
	
	@GetMapping("/allReservation")
	@ResponseBody
	public List<Reservation> getAllMemeber() {
		return reservationService.getAllReservation();
	}
	
	@GetMapping("/insertReservation")
	@ResponseBody
	public boolean insertReservation(Reservation reservation) {
		return reservationService.insertReservation(reservation);
	}
}
