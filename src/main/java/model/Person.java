package model;

// This allows for creation of a unique global ID
import java.util.UUID;

public class Person {
	private final UUID id;
	private final String name;
	
	// constructor for Person Model
	public Person(UUID id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// Getters for the private variables
	public UUID getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}
