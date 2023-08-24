package com.example.day4.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day4.entity.StudentEntity;
import com.example.day4.service.StudentService;

@RestController
public class StudentController {
@Autowired
StudentService studentservice;
@PostMapping("adddetails")
public StudentEntity add(@RequestBody StudentEntity studententity)
{
	return studentservice.saveinfo(studententity);
}
@PostMapping("addndetails")
public List<StudentEntity> insert(@RequestBody List<StudentEntity> studententity)
{
	return studentservice.savedetails(studententity);
}
@GetMapping("show")
public List<StudentEntity> showdetails()
{
	return studentservice.showinfo();
}
@DeleteMapping("delid/{id}")
public void deletemyid(@PathVariable int id)
{
	studentservice.deleteid(id);
	
}
@GetMapping("getid/{id}")
public Optional<StudentEntity> showid(@PathVariable int id)
{
	return studentservice.findid(id);
}
@PutMapping("update/{id}")
public String modify(@PathVariable int id,@RequestBody StudentEntity studententity)
{
	return studentservice.updateinfobyid(id, studententity);
}



}