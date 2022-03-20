package com.example.demo;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TestModel {

	private Long id;
	private Timestamp timestamp;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
	private Timestamp isoTimestamp;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public Timestamp getIsoTimestamp() {
		return isoTimestamp;
	}

	public void setIsoTimestamp(Timestamp isoTimestamp) {
		this.isoTimestamp = isoTimestamp;
	}

}
