package com.example.day4.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.day4.entity.StudentEntity;
import com.example.day4.repository.StudentRepository;

@Service
public class StudentService 
{
@Autowired
StudentRepository studentrepository;
////entry of one student
public StudentEntity saveinfo(StudentEntity studententity)
{
return studentrepository.save(studententity);
}
///list of students
public List<StudentEntity> savedetails(List<StudentEntity> studententity)
{
return (List<StudentEntity>)studentrepository.saveAll(studententity);
}
///get totally
public List<StudentEntity> showinfo()
{
return studentrepository.findAll();
}
///delete by id
public void deleteid(int id)
{
studentrepository.deleteById(id);
}
///get by id
public Optional<StudentEntity> findid(int id)
{
return studentrepository.findById(id);
}

///put by id
public String updateinfobyid(int id,StudentEntity studententity)
{
studentrepository.saveAndFlush(studententity);
if(studentrepository.existsById(id))
{
	return "updated";
}
else
{
	return "Not Updated";
}
}





}
