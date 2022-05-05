package com.example.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rest.entity.Clients;


@Repository
public interface VehicleRepository extends JpaRepository<Clients,Long> {

	Clients findByVehicleId(long vehicleId);

	

}
