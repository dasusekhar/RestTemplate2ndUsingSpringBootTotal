package com.example.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Clients {
	@Id
	private long vehicleId;
	private String vehilceName;
	private String vehicleCompany;
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehilceName() {
		return vehilceName;
	}
	public void setVehilceName(String vehilceName) {
		this.vehilceName = vehilceName;
	}
	public String getVehicleCompany() {
		return vehicleCompany;
	}
	public void setVehicleCompany(String vehicleCompany) {
		this.vehicleCompany = vehicleCompany;
	}
	public Clients(long vehicleId, String vehilceName, String vehicleCompany) {
		super();
		this.vehicleId = vehicleId;
		this.vehilceName = vehilceName;
		this.vehicleCompany = vehicleCompany;
	}
	public Clients() {
		super();
	}
	

}
