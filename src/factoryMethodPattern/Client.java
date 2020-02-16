package factoryMethodPattern;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("请输入性别（man/woman/robot）");
		String sex = sc.nextLine();
		System.out.println("请输入姓名");
		String name = sc.nextLine();
		Factory factory = new Factory();
		Person person = factory.personCreate(sex);
		if(person == null) {
			System.out.println("性别有误");
			return;
		}
		person.setName(name);
		System.out.println(person.speak());

		

	}



}
