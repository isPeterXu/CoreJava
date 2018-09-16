//import java.util.Random;
//
///**
// * @Minghui Xu
// * 
// */
////import static java.lang.Math.*;
////public class LearningJava{
////	public static void main(String[] args) {
////		int m = 7;
////		int n = 7;
////		int a = 2 * ++m;
////		int b = 2 * n++;
////		String all = String.join(";","M","X","XL");
////		"hello".equals("t");
////		//System.out.println("hello".equalsIgnoreCase("Hello"));
////		System.out.println(sqrt(4));
////	}
////}
//
////import java.util.*;
////
////public class LearningJava{
////	public static void main(String[] args) {
////		Scanner in = new Scanner(System.in);
////		
////		//get first input
////		System.out.print("what's your name");
////		String name = in.next();
////		//get second input
////		System.out.print("How old are you?");
////		int age = in.nextInt();
////		//display output on console
////		System.out.println(name+age);
////	}
////}
//
////import java.io.Console;
////import java.util.*;
////
////public class LearningJava{
////	public static void main(String[] args) {
////		Console cons = System.console();
////		String username = cons.readLine("User name:");
////		char[] passwd = cons.readPassword("Passwd is:");
////	}
////}
//
////import java.util.*;
////
////public class LearningJava{
////	public static void main(String[] args) {
////	System.out.printf("%,(.2f",-10000000.0/3);
////	}
////}
//
////import java.util.*;
////
////public class LearningJava{
////	public static void main(String[] args) {
////		
////	}
////}
//
////import java.util.*;
////
////public class LearningJava{
////	public static void main(String[] args) {
////		//read inputs
////		Scanner in = new Scanner(System.in);
//////		System.out.print("How much money do you need to retire");
//////		double goal = in.nextDouble();
////		
////		System.out.print("How much money will you contribute every year?");
////		double payment = in.nextDouble();
////		
////		System.out.print("Interest rate in %:");
////		double interestRate = in.nextDouble();
////		
////		double balance = 0;
////		int years = 0;
////		
////		String input;
////		//update account balance while goal isn't reached
//////		while (balance < goal)
//////		{
//////			balance += payment;
//////			double interest = balance * interestRate / 100;
//////			balance += interest;
//////			years++;
//////		}
////		do {
////			balance += payment;
////			double interest = balance * interestRate / 100;
////			balance += interest;2
////			years++;
////			System.out.printf("After year %d, your balance is %,.2f%n", years, balance);
////			System.out.print("Ready to retire? (Y/N)");
////			input = in.next();
////		}
////		while (input.equals("N"));
////		
////		System.out.println("You can retire in " + years + "years.");
////	}
////}
//
////import java.util.*;
////import java.math.*;
////
////public class LearningJava{
////	public static void main(String[] args) {
////		Scanner in = new Scanner(System.in);
////		
////		System.out.print("How many numbers do you need to draw?");
////		int k = in.nextInt();
////		System.out.print("What is the highest number you can draw");
////		int n = in.nextInt();
////		BigInteger lotteryOdds = BigInteger.valueOf(1);
////		for (int i = 1; i <= k; i++)
////			lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1).divide(BigInteger.valueOf(i)));
////		System.out.println("Your odds are 1 in "+lotteryOdds + ", Good Luck");
////	}
////}
//
//
////import java.util.*;
////import java.math.*;
////public class LearningJava{
////	public static void main(String[] args) {
////		int[] a = new int[100];
////		for (int i = 0; i < a.length; i++)
////			a[i] = i + 1;
////		System.out.println(a[10]);
////	}
////}
//
////import java.util.*;
////import java.math.*;
////public class LearningJava{
////	public static void main(String[] args) {
////		int[] a = new int[100];
////		for (int i = 0; i < a.length; i++)
////			a[i] = i + 1;
////		for (int element : a)
////			System.out.println(element);
////		System.out.println(a[10]);
////	}
////}
//
////import java.util.*;
////import java.math.*;
////
////public class LearningJava{
////	public static void main(String[] args) {
////		int[] smallPrimes = {2, 3, 3, 4, 4, 1, 2};
////		smallPrimes = new int[] {17, 19, 20, 18, 30, 31};
////		int[] luckyNumbers = smallPrimes;
////		luckyNumbers[3] = 12;
////		for (int element: luckyNumbers)
////			System.out.println(element);
////	}
////}
//
//
///**
// * Calender Using LocalDate
// */
////import java.time.*;
////
////public class LearningJava{
////	public static void main(String[] args) {
////		LocalDate date = LocalDate.now();
////		System.out.print(date + "\n");
////		//System.out.println();
////		int month = date.getMonthValue(); // Month
////		int today = date.getDayOfMonth(); // Day
////		
////		date = date.minusDays(today - 1); // Set to start of month [date - (today - 1)]
////		DayOfWeek weekday = date.getDayOfWeek(); //
////		System.out.print(weekday);
////		System.out.println();
////		int value = weekday.getValue(); //1 = Monday
////		
////		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
////		for (int i = 1; i < value; i++)
////			System.out.print("    ");
////		while (date.getMonthValue() == month) {
////			System.out.printf("%3d", date.getDayOfMonth());
////			if (date.getDayOfMonth() == today)
////				System.out.print("*");
////			else
////				System.out.print(" ");
////			date = date.plusDays(1);
////			if (date.getDayOfWeek().getValue() == 1) System.out.println();
////		}
////		if (date.getDayOfWeek().getValue() != 1) System.out.println();
////	}
////}
//
////import java.time.*;
////
////public class LearningJava{
////	public static void main(String[] args) {
////		Employee[] staff = new Employee[3];
////		staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 14);
////		staff[1] = new Employee("Harry Hacker", 60000, 1997, 1, 24);
////		staff[2] = new Employee("Tony Tester", 45000, 1982, 2, 11);
////		
////		//raise everyone's salary by 5%
////		for (Employee e : staff)
////			e.raiseSalary(5);
////		for (Employee e : staff)
////			System.out.println("name = " + e.getName() + ", Salary" + e.getSalary() + ", hireDay" + e.getHireDay());
////	}
////}
////	
////	class Employee{
////		private String name;
////		private double salary;
////		private LocalDate hireDay;
////		
////		public Employee(String n, double s, int year, int month, int day) 
////		{
////			name = n;
////			salary = s;
////			hireDay = LocalDate.of(year, month, day);
////		}
////		
////		public String getName() //method
////		{
////			return name;
////		}
////		public double getSalary() //method
////		{
////			return salary;
////		}
////		public LocalDate getHireDay() //method
////		{
////			return hireDay;
////		}
////		public void raiseSalary(double byPercent) // method
////		{
////			double raise = salary * byPercent / 100;
////			salary += raise;
////		}
////	}
//
////import java.lang.Math;
////
////public class LearningJava{
////	public static void main(String[] args) {
////		int count = 1;
////		int a = - count++; // a = - count; count = count + 1;1
////		System.out.println(a);
////		int b = count;
////		System.out.println(b);
////	}
////}
//
////import java.util.*;
////
////public class LearningJava
////{
////	public static void main(String[] args) {
////		Employee[] staff = new Employee[3]; // Employee arrays
////		
////		staff[0] = new Employee("Harry", 4000); //staffs
////		staff[1] = new Employee(60000);
////		staff[2] = new Employee();
////		
////		for (Employee e : staff)
////			System.out.println("name =" + e.getName() + ",id" + e.getId() + ",salary" + e.getSalary());
////	}
////}
////
////class Employee{
////	private static int nextId;
////	
////	private int id;
////	private String name = "";
////	private double salary;
////	
////	static
////	{
////		Random generator = new Random();
////		nextId = generator.nextInt(10000); // nextId \in 0-9999
////	}
////	
////	
////	public Employee(double s)
////	{
////		this("Employee #" + nextId, s);
////	}
////	
////	public Employee(String n, double s)
////	{
////		id = nextId;
////		nextId++;
////		name = n;
////		salary = s;
////	}
////	
////	public Employee()
////	{
////		id = nextId;
////		nextId++;
////		name = " ";
////	}
////	
////	public String getName()
////	{
////		return name;
////	}
////	
////	public double getSalary()
////	{
////		return salary;
////	}
////	
////	public int getId()
////	{
////		return id;
////	}
////}
//
//
//public class LearningJava
//{
//	public static void main(String[] args)
//	{
//		System.out.println("Testing tripleValue:");
//		double percent = 10;
//		System.out.println("Before: percent =" + percent);
//		tripleValue(percent);
//		System.out.println("After: percent =" + percent);
//		
//		System.out.println("\nTesting tripleSalary:");
//		Employee harry = new Employee("Harry", 50000);
//		System.out.println("Before: salary=" + harry.getSalary());
//		tripleSalary(harry);
//		System.out.println("After: salary=" + harry.getSalary()	);
//		
//		System.out.println("\nTesting swap:");
//		Employee a = new Employee("Alice", 70000);
//		Employee b = new Employee("Bob", 60000);
//		System.out.println("Before: a=" + a.getName());
//		System.out.println("Before: b=" + b.getName());
//		swap(a,b);
//		System.out.println("After: a=" + a.getName());
//		System.out.println("After: b=" + b.getName());
//	}
//	
//	public static void tripleValue(double x)
//	{
//		x = 3 * x;
//		System.out.println("End of method: x =" + x);
//	}
//	
//	public static void tripleSalary(Employee x)
//	{
//		x.raiseSalary(200);
//		System.out.println("End of method: salary=" + x.getSalary());
//	}
//	
//	public static void swap(Employee x, Employee y)
//	{
//		Employee temp = x;
//		x = y;
//		y = temp;
//		System.out.println("End of method: x=" + x.getName());
//		System.out.println("End of method: y=" + y.getName());
//	}
//}
//
//class Employee
//{
//	private static int nextId;
//	
//	private int id;
//	private String name;
//	private double salary;
//	
//	static
//	{
//		Random random = new Random();
//		nextId = random.nextInt(1000);
//	}
//	
//	{
//		id = nextId;
//		nextId++;
//	}
//	
//	public Employee(String n, double s)
//	{
//		name = n;
//		salary = s;
//	}
//	
//	public Employee(double s)
//	{
//		this("Employee  #" + nextId, s);
//	}
//	
//	public String getName()
//	{
//		return name;
//	}
//	
//	public double getSalary()
//	{
//		return salary;
//	}
//	
//	public void raiseSalary(double byPercent)
//	{
//		double raise = salary * byPercent /100;
//		salary += raise;
//	}
//}

