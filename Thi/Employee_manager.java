package Thi;

import java.util.ArrayList;

public class Employee_manager {
	ArrayList<Employee_Experience> nv_LauNam = new ArrayList<Employee_Experience>();
	ArrayList<Employee_Fresher> nv_Moi = new ArrayList<Employee_Fresher>();
	ArrayList<Employee_Intern> nv_ThucTap = new ArrayList<Employee_Intern>();

	public Employee_manager() {
		super();
	}

	public ArrayList<Employee_Experience> getNv_LauNam() {
		return nv_LauNam;
	}

	public void setNv_LauNam(ArrayList<Employee_Experience> nv_LauNam) {
		this.nv_LauNam = nv_LauNam;
	}

	public ArrayList<Employee_Fresher> getNv_Moi() {
		return nv_Moi;
	}

	public void setNv_Moi(ArrayList<Employee_Fresher> nv_Moi) {
		this.nv_Moi = nv_Moi;
	}

	public ArrayList<Employee_Intern> getNv_ThucTap() {
		return nv_ThucTap;
	}

	public void setNv_ThucTap(ArrayList<Employee_Intern> nv_ThucTap) {
		this.nv_ThucTap = nv_ThucTap;
	}

	public void themdanhsach(Employee_Experience ex) {
		nv_LauNam.add(ex);
	}

	public void themdanhsach1(Employee_Intern ex) {
		nv_ThucTap.add(ex);
	}

	public void themdanhsach2(Employee_Fresher ex) {
		nv_Moi.add(ex);
	}

	public int laysldanhsach() {

		return this.nv_LauNam.size();
	}

	public int laysldanhsach2() {

		return this.nv_Moi.size();
	}

	public int laysldanhsach3() {

		return this.nv_ThucTap.size();
	}

	public void lamrongdanhsach() {
		this.nv_LauNam.clear();
	}

	public void lamrongdanhsach2() {
		this.nv_Moi.clear();
	}

	public void lamrongdanhsach3() {
		this.nv_ThucTap.clear();
	}

	public void hienthi() {
		for (Employee_Experience launam : nv_LauNam) {
			System.out.println(launam.toString());
		}
	}

	public void hienthi2() {
		for (Employee_Fresher moi : nv_Moi) {
			System.out.println(moi.toString());
		}
	}

	public void hienthi3() {
		for (Employee_Intern thuctap : nv_ThucTap) {
			System.out.println(thuctap.toString());
		}
	}

	public boolean xoasinhvien(Employee_Experience ln) {
		return this.nv_LauNam.remove(ln);
	}
}
