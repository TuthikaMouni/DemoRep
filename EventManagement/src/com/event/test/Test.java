package com.event.test;

public class Test {

	public static void main(String[] args) {
		Organizer organizer = new Organizer();
		organizer.id = 123l;
		organizer.name = "Mounika";
		System.out.println(organizer);
		System.out.println(organizer.name);

		Event event = new Event(456l, "Apple Inc", "Grand Launch");
		System.out.println(event.name);

		Venue venue = new Venue();
		venue.id = 456l;
		venue.name = "Iphone 100";
		venue.description = "Grand Launch";
		System.out.println(venue.description);

	}

}
