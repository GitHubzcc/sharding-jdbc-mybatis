package com.lyz.sharding.service.impl;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lyz.sharding.entity.Student;
import com.lyz.sharding.mapper.StudentMapper;
import com.lyz.sharding.service.StudentService;
  
@Service  
public class StudentServiceImpl implements StudentService{  
      
    @Resource  
    public StudentMapper studentMapper;  
  
    public boolean insert(Student student) {  
        return studentMapper.insert(student) > 0 ? true : false;  
    }  
  
}  