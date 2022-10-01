package emp;

import java.io.Serializable;

//BEAN  POJO
public class EmpDetails implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int empid;
	private String empname;
	private String empemail;
	
	public EmpDetails() {
		super();
	}
	/*
	public EmpDetails(int empid, String empname, String empemail) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empemail = empemail;
	}
*/
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	
	
	
	

}
