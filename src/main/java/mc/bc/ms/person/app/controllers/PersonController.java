package mc.bc.ms.person.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mc.bc.ms.person.app.services.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {
	@Autowired
	private PersonService perServ;
}
