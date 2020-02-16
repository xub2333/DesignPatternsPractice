package factoryMethodPattern;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("�������Ա�man/woman/robot��");
		String sex = sc.nextLine();
		System.out.println("����������");
		String name = sc.nextLine();
		Factory factory = new Factory();
		Person person = factory.personCreate(sex);
		if(person == null) {
			System.out.println("�Ա�����");
			return;
		}
		person.setName(name);
		System.out.println(person.speak());

		

	}



}
