package mc.bc.ms.person.app.services;

import java.util.List;
import java.util.Map;

import mc.bc.ms.person.app.models.Person;
import reactor.core.publisher.Mono;

public interface PersonService {
	
	public Mono<Map<String, Object>> savePersons(List<Person> person);

}
