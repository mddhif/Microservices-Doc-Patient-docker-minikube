package healthcare.patients.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

	
@GetMapping(path = "/api/patient")
public ResponseEntity<Object> getPatient(){
	
	
	return  ResponseEntity.ok("response as patient entity - rebuilt");
}
}

