package EmployeeManagement;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDatabase {
	Employee e;
	Scanner sc = new Scanner(System.in);
	List<Employee> l = new LinkedList<Employee>();

	public void addEmp() {
		System.out.println("Enter Employee id");
		int id = sc.nextInt();
		System.out.println("Enter Employee name");
		String name = sc.next();
		System.out.println("Enter Employee age");
		int age = sc.nextInt();
		System.out.println("Enter Employee deptno");
		int deptno = sc.nextInt();
		System.out.println("Enter Employee sal");
		double sal = sc.nextDouble();
		System.out.println("Enter Employee job");
		String job = sc.next();
		e = new Employee(id, name, age, deptno, sal, job);
		if (l.add(e)) {
			System.out.println("Employee is added");
		} else {
			System.out.println("Employee is not added");
		}
	}

	public void removeEmp() {
		System.out.println("Enter Employee id");
		int id = sc.nextInt();
		for (int i = 0; i < l.size(); i++) {
			Employee E = l.get(i);
			if (E.id == id) {
				l.remove(E);
				System.out.println("Employee is removed");
				return;
			}
		}
		System.out.println("id is not found");
	}

	public void searchEmp() {
		System.out.println("Enter Employee id");
		int id = sc.nextInt();
		for (int i = 0; i < l.size(); i++) {
			Employee E = l.get(i);
			if (E.id == id) {
				System.out.println(E);
				return;
			}
		}
		System.out.println("id is not found");
	}

	public void displayEmp() {
		for (int i = 0; i < l.size(); i++) {
			Employee E = l.get(i);
			System.out.println("id =" + E.id);
			System.out.println("name =" + E.name);
			System.out.println("age =" + E.age);
			System.out.println("deptno =" + E.deptno);
			System.out.println("sal =" + E.sal);
			System.out.println("job =" + E.job);
		}
	}

	public void updateEmp() {
		System.out.println("1.id");
		System.out.println("2.name");
		System.out.println("3.age");
		System.out.println("4.deptno");
		System.out.println("5.sal");
		System.out.println("6.job");
		switch (sc.nextInt()) {
		case 1: {
			System.out.println("Enter id of Employee");
			int id = sc.nextInt();
			for (int i = 0; i < l.size(); i++) {
				Employee E = l.get(i);
				if (E.id == id) {
					System.out.println("Enter new id");
					E.id = sc.nextInt();
					System.out.println("id is update");
					return;
				}
			}
			System.out.println("id is not found");
			break;
		}
		case 2: {
			System.out.println("Enter id of Employee");
			int id = sc.nextInt();
			for (int i = 0; i < l.size(); i++) {
				Employee E = l.get(i);
				if (E.id == id) {
					System.out.println("Enter new name");
					E.name = sc.next();
					System.out.println("name is update");
					return;
				}
			}
			System.out.println("id is not found");
			break;
		}
		case 3: {
			System.out.println("Enter id of Employee");
			int id = sc.nextInt();
			for (int i = 0; i < l.size(); i++) {
				Employee E = l.get(i);
				if (E.id == id) {
					System.out.println("Enter new age");
					E.age = sc.nextInt();
					System.out.println("age is update");
					return;
				}
			}
			System.out.println("id is not found");
			break;
		}
		case 4: {
			System.out.println("Enter id of Employee");
			int id = sc.nextInt();
			for (int i = 0; i < l.size(); i++) {
				Employee E = l.get(i);
				if (E.id == id) {
					System.out.println("Enter new deptno");
					E.deptno = sc.nextInt();
					System.out.println("deptno is update");
					return;
				}
			}
			System.out.println("id is not found");
			break;
		}
		case 5: {
			System.out.println("Enter id of Employee");
			int id = sc.nextInt();
			for (int i = 0; i < l.size(); i++) {
				Employee E = l.get(i);
				if (E.id == id) {
					System.out.println("Enter new sal");
					E.sal = sc.nextDouble();
					System.out.println("sal is update");
					return;
				}
			}
			System.out.println("id is not found");
			break;
		}
		case 6: {
			System.out.println("Enter id of Employee");
			int id = sc.nextInt();
			for (int i = 0; i < l.size(); i++) {
				Employee E = l.get(i);
				if (E.id == id) {
					System.out.println("Enter new job");
					E.job = sc.next();
					System.out.println("job is update");
					return;
				}
			}
			System.out.println("id is not found");
			break;
		}
		}
	}
}
