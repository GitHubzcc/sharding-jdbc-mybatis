package com.lyz.sharding.mapper;

import java.util.List;
import java.util.Map;

import com.lyz.sharding.entity.User;
  
  
/**
 * 处理用户的数据操作接口
 * @author liuyazhuang
 *
 */
public interface UserMapper {  
      
    Integer insert(User u);  
      
    List<User> findAll();  
      
    List<User> findByUserIds(List<Integer> userIds);

    List<Map<String, Object>> findList();
  
}  