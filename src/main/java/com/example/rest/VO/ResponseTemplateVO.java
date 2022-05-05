package com.example.rest.VO;

import com.example.rest.entity.Clients;

public class ResponseTemplateVO {
	
	private Insrance insrance;
	private Clients clients;
	public Insrance getInsrance() {
		return insrance;
	}
	public void setInsrance(Insrance insrance) {
		this.insrance = insrance;
	}
	public Clients getClients() {
		return clients;
	}
	public void setClients(Clients clients) {
		this.clients = clients;
	}
	public ResponseTemplateVO(Insrance insrance, Clients clients) {
		super();
		this.insrance = insrance;
		this.clients = clients;
	}
	public ResponseTemplateVO() {
		super();
	}
	
	

}
