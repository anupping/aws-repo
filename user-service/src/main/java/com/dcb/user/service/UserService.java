package com.dcb.user.service;

import com.dcb.user.VO.Department;
import com.dcb.user.VO.ResponseTemplateVO;
import com.dcb.user.entity.User;
import com.dcb.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepository.save(user);
    }


    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);
        System.out.println(user);
        if(user == null)
            throw new IllegalArgumentException("User not found!!");
        Department department = restTemplate.getForObject("http://localhost:9001/departments/"+user.getDeptId(),Department.class);
        System.out.println(department);
        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }


    public User findByUserId(Long userId) {
        return userRepository.findByUserId(userId);
    }
}
