package th.project.samplecode.mapper;

import java.util.List;

import th.project.samplecode.entity.Person;

public interface PersonMapper {
 
	public int insertPerson(Person person);
	public int updatePerson(Person person);
	public int deletePersonById(int personId);
	public List<Person> selectAllPerson();
	public Person selectPersonById(int personId);
	
}
