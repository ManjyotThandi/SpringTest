package dao;

import java.util.UUID;

import model.Person;

public interface PersonDao {
	// Insert a person into our dummy db
	int insertPerson(UUID id, Person person);
	
	// this allows for creation of a method with a body in an interface
	// In case User wants to add person on their own. This will return a 0 or 1 depending on if the insert  was successful
	default int addPerson(Person person) {
		UUID id = UUID.randomUUID();
		return insertPerson(id,person);
	}
}
