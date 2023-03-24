package week5.day5;

public class Student {
	
		public void getStudentInfo (String studentName,String studentDept) {
			System.out.println(studentDept);
			System.out.println(studentName);
		}
		
		public void getStudentInfo (int studentId,String studentEmail) {
			System.out.println(studentId);
			System.out.println(studentEmail);
		}
		
		public void getStudentInfo (String studentName,long studentMobileNumber) {
			System.out.println(studentName);
			System.out.println(studentMobileNumber);
		}
		
	public static void main(String[] args) {
		
		Student Leader = new Student ();
		
		
		Leader.getStudentInfo("Tesla", "Mech");
		Leader.getStudentInfo(787167, "arunchiranjeevi001@gmail.com");
		Leader.getStudentInfo("Tesla",7871674504L );
	}
	}

