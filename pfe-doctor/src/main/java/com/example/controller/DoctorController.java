package com.example.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.core.domain.entities.Doctor;
import com.example.core.domain.services.DoctorService;


@RestController
public class DoctorController {

	@Autowired
	DoctorService doctorService;
	
	
	@RequestMapping(value="/addDoctor", method = RequestMethod.GET)
	@ResponseBody
	private String sysout(@RequestBody  String body) {
		
		JSONObject jsonObject = new JSONObject(body);
		Doctor doctorToAdd = new Doctor();
		doctorToAdd.setGender("Female");
		doctorToAdd.setEmail("hma.ameni@gmail.com");
		doctorToAdd.setUserName("HMAmeni");
		doctorToAdd.setPassword("2486");
		doctorService.saveDoctor(doctorToAdd);

		System.out.println("hello from sysout test \n" + jsonObject);
		return "hello from sysout test";
	}
}
