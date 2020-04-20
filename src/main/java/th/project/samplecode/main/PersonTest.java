package th.project.samplecode.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import th.project.samplecode.config.AppConfig;
import th.project.samplecode.entity.Person;
import th.project.samplecode.service.PersonService;

public class PersonTest {
	
	public static void main(String[] args) {
		AbstractApplicationContext context  = new AnnotationConfigApplicationContext(AppConfig.class);
		
		PersonService personService = (PersonService) context.getBean("personService");
		
		Person person1 = new Person( "Hai", "Ha Noi", "Nam", 1234568);
		Person person2 = new Person( "Cuong", "HCM", "Nam", 1234569);
		//insert
		personService.insertPerson(person1);
		personService.insertPerson(person2);
        System.out.println("insert : " + person1);
        System.out.println("insert : " + person2);
        
        //select all
        
        List<Person> personList = personService.selectAllPerson();
        System.out.println("SELECT ALL: ");
        for(Person per: personList) {
        	System.out.println(per);
        }
        
		//select by id 
        Person personSelected = personService.selectPersonById(6);
        
        personSelected.setAddress("Changed Address");
        personService.updatePerson(personSelected);
        
        System.out.println("Update person: "+personSelected);
        
        //delete by id
         
        
	}

}
