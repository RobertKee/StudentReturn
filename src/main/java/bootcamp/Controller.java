package bootcamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	Service service;
	
	@RequestMapping("/students")
	public String[] students() {
		return service.getList();
	}
	
	@RequestMapping("/reverse")
	public String[] reverse() {
		return service.getReverseList();
	}
	
}
