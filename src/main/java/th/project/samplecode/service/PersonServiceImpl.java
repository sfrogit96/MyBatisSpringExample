package th.project.samplecode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.project.samplecode.entity.Person;
import th.project.samplecode.mapper.PersonMapper;

@Service(value = "personService")
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonMapper personMapper;
	
	public int insertPerson(Person person) {
		return personMapper.insertPerson(person);
	}
	
	public int updatePerson(Person person) {
		return personMapper.updatePerson(person);
	}
	
	public int deletePersonById(int personId) {
		return personMapper.deletePersonById(personId);
	}
	
	public List<Person> selectAllPerson(){
		return personMapper.selectAllPerson();
	}
	
	public Person selectPersonById(int personId) {
		return personMapper.selectPersonById(personId);
	}
}
