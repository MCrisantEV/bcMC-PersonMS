package mc.bc.ms.person.app.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.bc.ms.person.app.models.Person;
import mc.bc.ms.person.app.repositories.PersonRepository;
import mc.bc.ms.person.app.services.PersonService;
import reactor.core.publisher.Mono;

@Service
public class PersonImpl implements PersonService {

	@Autowired
	private PersonRepository perRep;

	@Override
	public Mono<Map<String, Object>> savePersons(List<Person> person) {
		Map<String, Object> respuesta = new HashMap<String, Object>();
		
		return perRep.saveAll(person).collectList().map(res -> {
			respuesta.put("id", res.size());
			return respuesta;
		});
	}
}
