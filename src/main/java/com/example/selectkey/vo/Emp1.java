package com.example.selectkey.vo;


public class Emp1 {

  private Integer empno;
  private String ename;
  private String job;
  private Integer mgr;
  private String hiredate;
  private Integer sal;
  private Integer comm;
  private Integer deptno;


  public Integer getEmpno() {
    return empno;
  }

  public void setEmpno(Integer empno) {
    this.empno = empno;
  }

  public String getEname() {
    return ename;
  }

  public void setEname(String ename) {
    this.ename = ename;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public Integer getMgr() {
    return mgr;
  }

  public void setMgr(Integer mgr) {
    this.mgr = mgr;
  }

  public String getHiredate() {
    return hiredate;
  }

  public void setHiredate(String hiredate) {
    this.hiredate = hiredate;
  }

  public Integer getSal() {
    return sal;
  }

  public void setSal(Integer sal) {
    this.sal = sal;
  }

  public Integer getComm() {
    return comm;
  }

  public void setComm(Integer comm) {
    this.comm = comm;
  }

  public Integer getDeptno() {
    return deptno;
  }

  public void setDeptno(Integer deptno) {
    this.deptno = deptno;
  }

  @Override
  public String toString() {
    return "Emp1{" +
            "empno=" + empno +
            ", ename='" + ename + '\'' +
            ", job='" + job + '\'' +
            ", mgr=" + mgr +
            ", hiredate='" + hiredate + '\'' +
            ", sal=" + sal +
            ", comm=" + comm +
            ", deptno=" + deptno +
            '}';
  }
}
