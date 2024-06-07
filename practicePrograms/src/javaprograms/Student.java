package javaprograms;

public class Student {
	private int reg_no;
	private String name;
	
	public Student(int reg_no, String name) {
		this.reg_no = reg_no;
		this.name = name;
	}
	
	public int getreg_no() {
		return reg_no;
	}
	
	public void setreg_no(int reg_no) {
		this.reg_no=reg_no;
	}
	
	public String get_name() {
		return name;
	}
	
	public void set_name(String name) {
		this.name=name;
	}

}
