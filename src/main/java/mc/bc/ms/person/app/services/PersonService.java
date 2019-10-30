package mc.bc.ms.person.app.services;

import java.util.List;
import java.util.Map;

import mc.bc.ms.person.app.models.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonService {
	
	public Mono<Map<String, Object>> savePersons(List<Person> person);
	
	public Mono<Person> findId(String id);
	
	public Flux<Person> findAllId(List<Person> person);
	
	public Flux<Person> findAllNames(String names);

}
