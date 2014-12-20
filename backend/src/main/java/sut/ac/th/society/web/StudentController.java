package sut.ac.th.society.web;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sut.ac.th.society.domain.Student;
import sut.ac.th.society.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository repo;
	
	@RequestMapping("/test/add")
	@ResponseBody
	public String add(@Valid @RequestBody Student student){
		repo.save(student);
		return("Add OK");
	}
}
