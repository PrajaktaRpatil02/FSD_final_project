package com.example.finalassesmentbackend.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="roomprice")
	private Integer roomPrice;
	
	@Column(name="imageurl")
	private String imageUrl;
	
	@Column(name="description")
	private String description;
	
	@Column(name="rating")
	private Integer rating;
	
	@Column(name="city")
	private String city;
	
	@Column(name="email")
	private String email;
	
	@Column(name="wifi")
	private Boolean wifi;
	
	@Column(name="gym")
	private Boolean gym;
	
	@Column(name="pool")
	private Boolean pool;
	
	@Column(name="createat")
	@CreationTimestamp
	private LocalDateTime createAt;
	
	@Column(name="updatedat")
	@UpdateTimestamp
	private LocalDateTime updatedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(Integer roomPrice) {
		this.roomPrice = roomPrice;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getWifi() {
		return wifi;
	}

	public void setWifi(Boolean wifi) {
		this.wifi = wifi;
	}

	public Boolean getGym() {
		return gym;
	}

	public void setGym(Boolean gym) {
		this.gym = gym;
	}

	public Boolean getPool() {
		return pool;
	}

	public void setPool(Boolean pool) {
		this.pool = pool;
	}

	public LocalDateTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(Long id, String name, Integer roomPrice, String imageUrl, String description, Integer rating,
			String city, String email, Boolean wifi, Boolean gym, Boolean pool, LocalDateTime createAt,
			LocalDateTime updatedAt) {
		super();
		this.id = id;
		this.name = name;
		this.roomPrice = roomPrice;
		this.imageUrl = imageUrl;
		this.description = description;
		this.rating = rating;
		this.city = city;
		this.email = email;
		this.wifi = wifi;
		this.gym = gym;
		this.pool = pool;
		this.createAt = createAt;
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", roomPrice=" + roomPrice + ", imageUrl=" + imageUrl
				+ ", description=" + description + ", rating=" + rating + ", city=" + city + ", email=" + email
				+ ", wifi=" + wifi + ", gym=" + gym + ", pool=" + pool + ", createAt=" + createAt + ", updatedAt="
				+ updatedAt + "]";
	}
	
	
	
	

}
