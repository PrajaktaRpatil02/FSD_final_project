package com.example.finalassesmentbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.finalassesmentbackend.bean.RequestBean;
import com.example.finalassesmentbackend.bean.ResponseBean;
import com.example.finalassesmentbackend.entity.Hotel;
import com.example.finalassesmentbackend.service.HotelService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	
	@GetMapping("/fetchHotels")
	public ResponseEntity<ResponseBean>fetchAllHotels(){
		
		return new ResponseEntity<>(hotelService.fetchAllHotels(),HttpStatus.OK);
	}
	
	@PostMapping("/savehotel")
	 public ResponseEntity<ResponseBean>saveHotelDetails(@RequestBody Hotel hotel){
		 
		 return new ResponseEntity<>(hotelService.saveHotelDetails(hotel),HttpStatus.CREATED);
	 }
	
	
	@PutMapping("/updatehotel/{id}")
	public ResponseEntity<ResponseBean>updateHotelDetails(@PathVariable Long id,@RequestBody Hotel hotel){
		return new ResponseEntity<>(hotelService.updateHotelDetails(id, hotel),HttpStatus.OK);
		
	}
	
	
	@PostMapping("/filterhotel")
	public ResponseEntity<ResponseBean> filterDetails(@RequestBody RequestBean requestBean){
		
		return new ResponseEntity<>(hotelService.filterDetails(requestBean),HttpStatus.OK);
		
	}

}
