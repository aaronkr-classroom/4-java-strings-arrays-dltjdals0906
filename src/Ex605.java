
public class Ex605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java";
		String s2 = "java";
		String s3 = "java";
		
		System.out.println(s1 == s2); // 같아요 ?
		System.out.println(s1 != s2);
		System.out.println(s2 == s3);
		System.out.println(s2 != s3);
		
		String s4 = s2.concat(s3); // + 결합
		System.out.println(s4);
	}

}
