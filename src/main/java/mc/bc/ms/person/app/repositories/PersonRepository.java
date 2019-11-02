package mc.bc.ms.person.app.repositories;

import java.util.Date;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import mc.bc.ms.person.app.models.Person;
import reactor.core.publisher.Flux;

public interface PersonRepository extends ReactiveMongoRepository<Person, String> {
	
	public Flux<Person> findByNamesLike(String names);
	
	public Flux<Person> findByDateBirthBetween(Date firstDate, Date lastDate);
	
}
