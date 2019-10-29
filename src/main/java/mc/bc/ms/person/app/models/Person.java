package mc.bc.ms.person.app.models;

import java.util.Date;

import javax.validation.constraints.NotBlank;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Document(collection = "persons")
public class Person {
	@NotBlank
	private String id;
	@NotBlank
	private String names;
	@NotBlank
	private String lastNames;
	@NotBlank
	private String gender;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateBirth;
	@NotBlank
	private String typeDoc;
	
}
