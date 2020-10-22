import java.util.LinkedHashSet;
import java.lang.Exception;

public class LinkedHashSetExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(10);
		lhs.add(999);
		lhs.add(666);
		lhs.add(666);
		lhs.add(666);
		lhs.add(null);
		lhs.add(null);
		
		System.out.print(lhs);
	}

}