package com.in28minutes.microservices.currencyexchangeservice;

import java.math.BigDecimal;

public class ExchangeValue {
	
	private long id;
	private String from;
	private String to;
	private BigDecimal convertionMultiple;
	private int port;
	public ExchangeValue() {
		
	}
	
	public ExchangeValue(long id, String from, String to, BigDecimal convertionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.convertionMultiple = convertionMultiple;
	}

	public long getId() {
		return id;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public BigDecimal getConvertionMultiple() {
		return convertionMultiple;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	
	
}
