package mc.bc.ms.person.app.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import mc.bc.ms.person.app.models.Person;

public interface PersonRepository extends ReactiveMongoRepository<Person, String> {

}
