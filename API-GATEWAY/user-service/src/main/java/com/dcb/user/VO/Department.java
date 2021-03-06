package com.dcb.user.VO;

import lombok.Data;

@Data
public class Department {

    private Long deptId;
    private String deptName;
    private String deptAddr;
    private String deptCode;

    public Department() {
    }

    public Department(Long deptId, String deptName, String deptAddr, String deptCode) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptAddr = deptAddr;
        this.deptCode = deptCode;
    }
}
