import java.util.*;
import java.io.*;
class Library implements Serializable{
	String authorName,BookName;
	int isbc;
	
	Library(String authorName,String BookName,int isbc){
		super();
		this.authorName=authorName;
		this.BookName=BookName;
		this.isbc=isbc;
	}
	public String toString(){
		return "Author Name:"+authorName+",Book Name:"+BookName+",ISBC num:"+isbc;
	}
}
class MainLibrary{
	public static void main(String...args)throws IOException,ClassNotFoundException{
	  HashSet<Library> hs= new HashSet<Library>();
	  
	  
	  Library s1=new Library("Indian Polity","Laxmikanth",21221);
	  Library s2=new Library("Indian History","R.s.sharma",415263); 
	  Library s3=new Library("Appitude & Mental Ability","Agarwal",635241);
	  
	  
	  hs.add(s1);
	  hs.add(s2);
	  hs.add(s3);
	  Iterator it=hs.iterator();
	  
	  
	  while(it.hasNext()){
		  System.out.println(it.next());
	  }
	  
	  System.out.println();
	  
	  FileOutputStream fos=new FileOutputStream("D:\\Library\\List.txt");
	  ObjectOutputStream oos=new ObjectOutputStream(fos);
	  oos.writeObject(hs);
	  fos.close();
	  oos.close();
	  
	  FileInputStream fis=new FileInputStream("D:\\Library\\List.txt");
	  ObjectInputStream ois=new ObjectInputStream(fis);
	   HashSet<Library> hs1= new HashSet<Library>();
	  ois.readObject();
	  fis.close();
	  ois.close();
	  
	  for(Library ll:hs){
		 System.out.println(ll);
	  }
	  }
}