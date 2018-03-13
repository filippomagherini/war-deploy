package it.scaffold.deploy.controllers.rest;

import javax.net.ssl.SSLEngineResult.Status;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTest {
	@RequestMapping(value={"/","/test"}, method= RequestMethod.GET )
	public ResponseEntity<String> testHome(){
		
		return new ResponseEntity<String>("OK i am RUNNING", HttpStatus.OK);
	}

}
