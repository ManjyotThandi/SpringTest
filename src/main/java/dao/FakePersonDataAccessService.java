package dao;

import java.util.ArrayList;
import java.util.*;


import model.Person;

public class FakePersonDataAccessService implements PersonDao {

	// creates an instance of array list with the List interface. Of type Person
	private static List<Person> DB = new ArrayList<>();
	
	@Override
	public int insertPerson(UUID id, Person person) {
		// add a new instance of person to DB array list
		DB.add(new Person(id, person.getName()));
		return 1;
	}

}
