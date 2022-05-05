package com.example.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.VO.ResponseTemplateVO;
import com.example.rest.entity.Clients;
import com.example.rest.service.VehicleService;



@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	@Autowired
	private VehicleService vehicleService;
	@PostMapping("/")
	public ResponseEntity<Clients> saveClients(@RequestBody Clients client)
	{
		Clients saves=vehicleService.saveClient(client);
		return new ResponseEntity<>(saves,HttpStatus.CREATED);
	}
	@GetMapping("/get/{vehicleId}")
	public ResponseEntity<?>fetchAll(@PathVariable("vehicleId") long vehicleId)
	{
		ResponseTemplateVO gets=vehicleService.fetchAll(vehicleId);
		
		return  new ResponseEntity<>(gets,HttpStatus.OK);
	}
	

}
