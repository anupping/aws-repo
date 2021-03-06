package com.dcb.user.VO;

import com.dcb.user.entity.User;

public class ResponseTemplateVO {

    private User user;
    private Department department;

    public ResponseTemplateVO() {
    }

    public ResponseTemplateVO(User user, Department department) {
        this.user = user;
        this.department = department;
    }

    public void setUser(User user) {
        this.user=user;
    }

    public void setDepartment(Department department) {
        this.department=department;
    }

    public User getUser() {
        return user;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "ResponseTemplateVO{" +
                "user=" + user +
                ", department=" + department +
                '}';
    }
}
