package healthcare.doctors.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DoctorController {

	String patientHost = "patients-service";
  int patientPort = 80;
  
  @Autowired
  RestTemplate restTemplate;
  
@GetMapping(path = "/api/doctor/")
public ResponseEntity<Object> getDoctor(){
	
	
	return  ResponseEntity.ok("response as doctor service - rebuilt - ");
}



@GetMapping(path = "/api/doctor/patients/")
public ResponseEntity<Object>  getPatients(){

//	String url = String.format("http://%s:%d/api/patient", patientHost, patientPort);
String url = "http://patients-service.default.svc.cluster.local/api/patient/";	
String response = restTemplate.getForObject(url, String.class);
return ResponseEntity.ok(response);

}



}

