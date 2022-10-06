package java_basic;

public class ReferenceCopy {

	public static void main(String[] args) {

		String [] subjects = 
			{"Java", "Database", "Web FrontEnd","Spring Framework",
					"Nodejs","react","react-native","블록체인 기반기술",
					"스마트 컨트랙트","dApp"};
			
			String [] copy = subjects;
			System.out.println(subjects[0]);
			
			copy[0] = "자바";
			System.out.println(subjects[0]);
	}

}
