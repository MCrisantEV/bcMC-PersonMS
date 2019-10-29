package mc.bc.ms.person.app.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.bc.ms.person.app.repositories.PersonRepository;
import mc.bc.ms.person.app.services.PersonService;

@Service
public class PersonImpl implements PersonService {
	
	@Autowired
	private PersonRepository perRep;
}
