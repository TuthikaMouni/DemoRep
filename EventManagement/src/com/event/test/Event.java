package com.event.test;

public class Event extends EMBase{
	public String description;
	public String startTime;
	public String endTime;
	public Boolean started;

	public Event( long id, String name, String desctiption) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
}
