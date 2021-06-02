package com.example.springbootrabbit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private String EmpName;
    private String EmpId;
    private String EmpDept;
    private String EmpBGrp;

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getEmpId() {
        return EmpId;
    }

    public void setEmpId(String empId) {
        EmpId = empId;
    }

    public String getEmpDept() {
        return EmpDept;
    }

    public void setEmpDept(String empDept) {
        EmpDept = empDept;
    }

    public String getEmpBGrp() {
        return EmpBGrp;
    }

    public void setEmpBGrp(String empBGrp) {
        EmpBGrp = empBGrp;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmpName='" + EmpName + '\'' +
                ", EmpId='" + EmpId + '\'' +
                ", EmpDept='" + EmpDept + '\'' +
                ", EmpBGrp='" + EmpBGrp + '\'' +
                '}';
    }
}
