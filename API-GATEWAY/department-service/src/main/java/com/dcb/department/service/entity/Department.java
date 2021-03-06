package com.dcb.department.service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deptId;

    public Department() {
    }

    private String deptName;

    public Department(Long deptId, String deptName, String deptAddr, String deptCode) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptAddr = deptAddr;
        this.deptCode = deptCode;
    }

    public Long getDeptId() {
        return deptId;
    }

    public Department setDeptId(Long deptId) {
        this.deptId = deptId;
        return this;
    }

    public String getDeptName() {
        return deptName;
    }

    public Department setDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    public String getDeptAddr() {
        return deptAddr;
    }

    public Department setDeptAddr(String deptAddr) {
        this.deptAddr = deptAddr;
        return this;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public Department setDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    private String deptAddr;
    private String deptCode;
}
