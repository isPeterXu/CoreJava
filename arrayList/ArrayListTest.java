//package arrayList;
//
//import java.util.*;
//
//import abstractClasses.Employee;
//
//public class ArrayListTest {
//	public static void main(String[] args)
//	{
//		ArrayList<Employee> staff = new ArrayList<>();
//		
//		staff.add(new Employee("Carl", 31231, 1982, 12, 1));
//		staff.add(new Employee("Carl", 100, 1982, 12, 1));
//		staff.add(new Employee("Carl", 331, 1982, 12, 1));
//		
//		System.out.println(staff.size());
//		
//		staff.set(1, new Employee("peter", 100, 1231, 12, 1));
//		staff.add(staff.size(), new Employee("peter", 100, 1231, 12, 1));
//		
//		
//		for (Employee e : staff)
//			e.raiseSalary(5);
//		
//		for (Employee e : staff)
//			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
//	}
//}
