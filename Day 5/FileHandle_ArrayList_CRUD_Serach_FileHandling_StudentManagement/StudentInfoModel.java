package FileHandle_ArrayList_CRUD_Serach_FileHandling_StudentManagement;

import java.io.Serializable;

public class StudentInfoModel implements Serializable, Comparable<StudentInfoModel>
{
	private int roll;
	private String name;
	private double sub1;
	private double sub2;
	private double totalmarks;
	
	public double getTotalmarks() {
		return totalmarks;
	}
	public void setTotalmarks(double totalmarks) {
		this.totalmarks = totalmarks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSub1() {
		return sub1;
	}
	public void setSub1(double sub1) {
		this.sub1 = sub1;
	}
	
	public double getSub2() {
		return sub2;
	}
	public void setSub2(double sub2) {
		this.sub2 = sub2;
	}
	
	@Override
	public int compareTo(StudentInfoModel o) 
	{
		return (int)(o.totalmarks - this.totalmarks);//DESC
		//return (int)(this.totalmarks - o.totalmarks);//ASC
		//return (this.name.compareTo(o.name));
	}
	
}
