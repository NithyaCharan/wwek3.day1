package week3.day1.assignment;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student ID : " +id);
	}
	
	public void getStudentInfo(int id,String name) {
		System.out.println("Student ID : " +id);
		System.out.println("Student Name : " +name);

	}
	
	public void getStudentInfo(String email , long phoneNum) {
		System.out.println("Student email : " +email);
		System.out.println("Student Phone Number : " +phoneNum );

	}
	
	public static void main(String[] args) {
		
		//examples of method overloading
		//same method name, differnce in number of arguements and type ofarguements
		
		Students st = new Students();
		st.getStudentInfo(116045);
		st.getStudentInfo(116045, "Xyz");
		st.getStudentInfo("xyz@abc.com", 1233654778L);
		
	}
}
