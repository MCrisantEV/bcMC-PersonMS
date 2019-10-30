package mc.bc.ms.person.app.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mc.bc.ms.person.app.models.Person;
import mc.bc.ms.person.app.services.PersonService;
import reactor.core.publisher.Flux;
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
	
	@GetMapping("/{id}")
	public Mono<Person> findIdPerson(@PathVariable String id){
		return perServ.findId(id);
	}
	
	@GetMapping
	public Flux<Person> findAllIdPerson(@RequestBody List<Person> person){
		return perServ.findAllId(person);
	}
	
	@GetMapping("/names/{names}")
	public Flux<Person> findAllNamesPerson(@PathVariable String names){
		return perServ.findAllNames(names);
	}

}
