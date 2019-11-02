package mc.bc.ms.person.app.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
	
	@GetMapping("/dates/{first}/{last}")
	public Flux<Person> findDateRangesPerson(@PathVariable String first, @PathVariable String last){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			 Date firstDate = df.parse(first);
			 Date lastDate = df.parse(last);
			 
			 return perServ.findAllDateRange(firstDate, lastDate);

	        } catch (ParseException e) {
	            return null;
	        }
	}

}
