package bootcamp;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Service {

	private String[] studentList = {"A Person", "B Person","C Person"};
	private String[] rev = new String[studentList.length];

	@PostConstruct
	public void init() {
		for (int i = 0; i < studentList.length; i++)
			rev[i] = studentList[studentList.length-i-1];
	}
	
	public String[] getList() {
		return studentList;
	}
	
	public String[] getReverseList() {
		return rev;
	}

}
