package factoryMethodPattern;

public class Factory {
	public Person personCreate(String sex) {
		try {
			switch (sex) {
			case "man":
				return new Man();
			case "woman":
				return new Woman();
			case "robot":
				return new Robot();
			default:
				System.out.println("�����������������");
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}

}
