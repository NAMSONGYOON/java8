package sec2;

public class Student {

	String name;
	int kor;
	int eng;
	int mat;
	
	
	public Student () {
	public Student(String name){ this.name = name; }
	public Student(String name, int kor, int eng, int mat) {
		this(name,kor,90);
	}
	
	public Student(String name, int kor, int eng) {
	this(name,kor,eng,80);
	}
	
	public Student(String name, int kor, int eng, int mat) {
	this(name,kor,eng,90);
	
	
	System.out.println("총점: "+calcTot);
	System.out.println("평균: "+calcTot/3);
	System.out.println("학점: "+calcHak);
	System.out.println();
}
	
	}
	
	}
}
