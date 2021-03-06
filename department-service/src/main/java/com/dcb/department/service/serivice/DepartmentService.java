package com.dcb.department.service.serivice;

import com.dcb.department.service.entity.Department;
import com.dcb.department.service.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department){
        //log.info("Inside the saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findByDeptId(Long deptId){
        //log.info("Inside the findDepartmentById of DepartmentService");
        return  departmentRepository.findByDeptId(deptId);
    }
}
