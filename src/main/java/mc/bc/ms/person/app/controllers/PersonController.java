package mc.bc.ms.person.app.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mc.bc.ms.person.app.models.Person;
import mc.bc.ms.person.app.services.PersonService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/persons")
public class PersonController {
	@Autowired
	private PersonService perServ;
	
	@PostMapping
	public Mono<Map<String, Object>> createPersons(@RequestBody List<Person> person){
		return perServ.savePersons(person);
	}
}
