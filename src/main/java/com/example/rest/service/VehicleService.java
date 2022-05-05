package com.example.rest.service;


import com.example.rest.entity.Clients;

public interface VehicleService {

	Clients saveClient(Clients client);

	com.example.rest.VO.ResponseTemplateVO fetchAll(long vehicleId);

	

}
