import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null)
		{
			throw new IllegalArgumentException();
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index < 0 || index >= students.length)
		{
			throw new IllegalArgumentException();
		}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(student==null)
		{
			throw new IllegalArgumentException();
		}
		else if(index < 0 || index >= students.length)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			students[index]=student;
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			students[0]=student;
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			students[students.length - 1]=student;
		}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(student==null)
		{
			throw new IllegalArgumentException();
		}
		else if(index < 0 || index >= students.length)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			students[index]=student;
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index < 0 || index >= students.length)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			for (int i = 0; i < students.length; i++) 
			{
				if (index == i) 
				{
					for (int j = i + 1; j < students.length - 1; j++) 
					{
						students[i] = students[j];
						i++;
					}
				}
			}
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		for(int i = 0; i < students.length; i++)
		{
			if (students[i] == student)
			{
				for (int j = i + 1; j < students.length - 1; j++) {
					students[i] = students[j];
					i++;
				}
			}
			else
			{
				throw new IllegalArgumentException("Student not exist");
			}
		}
		if(student==null)
		{
			throw new IllegalArgumentException();
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index < 0 || index >= students.length)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			ArrayList<Student> arrayList = new ArrayList<Student>(Arrays.asList(students));
			arrayList.subList(index, arrayList.size()).clear();
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(student==null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			ArrayList<Student> arrayList = new ArrayList<Student>(Arrays.asList(students));
			int pos = arrayList.indexOf(student);
			arrayList.subList(pos, arrayList.size()).clear();
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index < 0 || index >= students.length)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			ArrayList<Student> arrayList = new ArrayList<Student>(Arrays.asList(students));
			arrayList.subList(0, index).clear();
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if(student==null)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			ArrayList<Student> arrayList = new ArrayList<Student>(Arrays.asList(students));
			int pos = arrayList.indexOf(student);
			arrayList.subList(0, pos).clear();
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		for (int j=0; j < students.length; j++)
        {
            for(int i = j + 1; i < students.length; i++)
            {
                if (students[ i ].compareTo(students[j]) < 0) 
                {
                    Student t = students[j];
                    students[j] = students[i];
                    students[i] = t;
                }
            }
        }
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
