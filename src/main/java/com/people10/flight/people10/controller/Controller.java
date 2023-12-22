package com.people10.flight.people10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.people10.flight.people10.DTO.RequestDTO;
import com.people10.flight.people10.service.ApiService;


@RestController
@RequestMapping("/i")
public class Controller{	
	
	private ApiService service;
	
	public void Controller(ApiService apiService) {
		this.service=apiService;
	}
	
	@GetMapping("/publish")
	public String publishMessage(
			@RequestParam RequestDTO requestDTo)
	{
			service.fetchData(requestDTo);
			return "success";
	}
	
	
}