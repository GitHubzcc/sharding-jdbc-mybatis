package com.lyz.sharding.service;  

import java.util.List;
import java.util.Map;

import com.lyz.sharding.entity.User;

/**
 * 处理用户的Service
 * @author liuyazhuang
 *
 */
public interface UserService {  
      
    public boolean insert(User u);  
      
    public List<User> findAll();  
      
    public List<User> findByUserIds(List<Integer> ids);  
      
    public void transactionTestSucess();  
      
    public void transactionTestFailure() throws IllegalAccessException;

    List<Map<String, Object>> findList();

}  