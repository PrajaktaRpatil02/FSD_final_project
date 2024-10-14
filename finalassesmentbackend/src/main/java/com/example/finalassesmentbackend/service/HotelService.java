package com.example.finalassesmentbackend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.example.finalassesmentbackend.bean.RequestBean;
import com.example.finalassesmentbackend.bean.ResponseBean;
import com.example.finalassesmentbackend.entity.Hotel;
import com.example.finalassesmentbackend.repository.HotelRepository;

import jakarta.persistence.EntityExistsException;

@Service
public class HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	public ResponseBean fetchAllHotels() {
		ResponseBean responseBean = new ResponseBean();

		List<Hotel> HotelList = hotelRepository.findAll();
		if (ObjectUtils.isEmpty(HotelList)) {

			throw new EntityExistsException("Hotel details not found");

		}

		responseBean.setData(HotelList);
		responseBean.setMessage("Data fech successfully");

		return responseBean;

	}

	public ResponseBean saveHotelDetails(Hotel hotel) {
		ResponseBean responseBean = new ResponseBean();
		if (ObjectUtils.isEmpty(hotel)) {

			throw new EntityExistsException("Incorrect request");

		}

		Hotel hotelResponse = hotelRepository.save(hotel);
		responseBean.setData(hotelResponse);
		responseBean.setMessage("Data save successfully");

		return responseBean;

	}

	public ResponseBean updateHotelDetails(long id, Hotel hotel) {
		ResponseBean responseBean = new ResponseBean();
		Optional<Hotel> hotelResponse = hotelRepository.findById(id);

		if (hotelResponse.isEmpty()) {

			throw new EntityExistsException("Data not Found");

		}
		Hotel hotelDetails = hotelResponse.get();
		hotelDetails.setCity(hotel.getCity());
		hotelDetails.setDescription(hotel.getDescription());
		hotelDetails.setEmail(hotel.getEmail());
		hotelDetails.setGym(hotel.getGym());
		hotelDetails.setImageUrl(hotel.getImageUrl());
		hotelDetails.setName(hotel.getName());
		hotelDetails.setPool(hotel.getPool());
		hotelDetails.setRating(hotel.getRating());
		hotelDetails.setRoomPrice(hotel.getRoomPrice());

		hotelRepository.save(hotelDetails);
		responseBean.setData(hotelDetails);
		responseBean.setMessage("Data updated");
		return responseBean;

	}

	public ResponseBean filterDetails(RequestBean requestBean) {

		ResponseBean responseBean = new ResponseBean();

		List<Hotel> hotelResponse = new ArrayList<>();

		List<Hotel> hotelDetailsList = hotelRepository.findByCityIgnoreCase(requestBean.getCity());
		if (ObjectUtils.isEmpty(hotelDetailsList)) {

			throw new EntityExistsException("Data not Found");

		}

		for (Hotel hotel : hotelDetailsList) {

			if (hotel.getRating() <= requestBean.getMax() || hotel.getRating() >= requestBean.getMin()) {
				hotelResponse.add(hotel);

			}

		}
		responseBean.setData(hotelResponse);
		responseBean.setMessage("data fech successfully");
		return responseBean;

	}

}
