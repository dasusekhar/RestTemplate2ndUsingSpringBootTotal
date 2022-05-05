package com.example.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.rest.VO.Insrance;
import com.example.rest.VO.ResponseTemplateVO;
import com.example.rest.entity.Clients;
import com.example.rest.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService{
	@Autowired
	private VehicleRepository vehicleRepository;
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Clients saveClient(Clients client) {
		
		return vehicleRepository.save(client);
	}

	@Override
	public ResponseTemplateVO fetchAll(long vehicleId) {
		ResponseTemplateVO vo=new ResponseTemplateVO();
		Clients client=vehicleRepository.findByVehicleId(vehicleId);
		Insrance insur=restTemplate.getForObject("http://localhost:9195/insurance/insur/"+client.getId(), Insrance.class);
		vo.setClients(client);
		vo.setInsrance(insur);
		
		return vo;
	}

	

}
