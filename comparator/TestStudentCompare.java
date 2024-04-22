package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestStudentCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<E> al = new ArrayList();
		al.add(new Student(101,"Ginni",23));
		al.add(new Student(101,"Martin",27));
		al.add(new Student(101,"Robert",21));
		
		System.out.println("Sorting by Name");
		
		Collections.sort(al.newNameComparator());
		Iterator<E> itr = al.iterator();
		while(itr.hasNext()) {
			Student st = (Student)itr.next();
			System.out.println(st.rollno+ " "+st.name+" " + st.age);
			
		}
		System.out.println("Sorting by age");
		
		Collectons.sort(al,new ageComparator());
		Iterator itr2 = al.iterator();
		while(itr2.hasNext()) {
			Student st = (Student)itr2.next();
			System.out.println(st.rollno + " "+st.name + " "+st.age);
		}
			
	}

}
