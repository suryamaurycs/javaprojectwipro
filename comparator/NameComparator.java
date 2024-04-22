package comparator;

class NameComparator implements Comparator<Student>{
public int compara(Student o1, Student o2) {
	//Student s1 = (Student)o1;
	//Student s2 = (Student)o2;
	
	return o1.name.compareTo(o2.name);
}

}
