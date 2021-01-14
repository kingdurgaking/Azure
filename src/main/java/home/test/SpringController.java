package home.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

	@RequestMapping(method=RequestMethod.GET, path="/")
	public String hello() {
		return "Spring boot hello";
	}
}
