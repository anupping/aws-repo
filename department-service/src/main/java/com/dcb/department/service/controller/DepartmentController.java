package com.dcb.department.service.controller;

import com.dcb.department.service.entity.Department;
import com.dcb.department.service.serivice.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        //log.info("Inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{deptId}")
    public Department findDepartmentById(@PathVariable("deptId") Long deptId){
        //log.info("Inside findDepartmentById of DepartmentController");
        return departmentService.findByDeptId(deptId);
    }
}
