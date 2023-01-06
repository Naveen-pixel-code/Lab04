import java.util.*;
class Student implements Comparator<Student>{
	String studname;
	int studid;
	double attendance;
		public int compare(Student s1, Student s2){
		return s1.studname.compareTo(s2.studname);
	}
	Student(String studname,int studid,double attendance)
	{
		this.studname=studname;
		this.studid=studid;
		this.attendance=attendance;
			}
	Student(){
	}
	public String toString()
	{
		return "Student Name :"+studname+",\tStudent ID :"+studid+",\tAttendance :"+attendance;
	}
}
class MainStudent
{
	public static void main(String args[])
	{
		LinkedList<Student> s=new LinkedList<Student>();
		Student s1=new Student("Naveen Kumar",490,90.3);
		Student s3= new Student("Keerthivasan",495,88.7);
		Student s2=new Student("Arun Kumar",456,74.6);
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		Collections.sort(s,new Student());
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}