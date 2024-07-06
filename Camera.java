public class Camera{
	public static void main(String[] args) {
		String cameraBrand = "Sony";
		String brandName = cameraBrand.concat(" Alpha");
		System.out.println(brandName);

		String firstName = "Manoj";
		String secondName = "Kumar";
		System.out.println(firstName.concat(secondName));

		String result = firstName + " " + secondName;
		System.out.println(result);

		String str1 = "Hello";
		String str2 = "World";
		String result1 = str1.concat(" ").concat(str2);
		System.out.println("Result 1 : " + result1);

		String str3 = "Java";
		String str4 = "Programming";
		String result2 = str3.concat(" ").concat(str4);
		System.out.println("Result 2 : " + result2);

		String str5 = "I";
		String str6 = "Love";
		String result3 = str5.concat(" ").concat(str6).concat(" ").concat(str3).concat(" ").concat(str4);
		System.out.println("Result 3 : " + result3);


		String x = "Manoj  ";
		String y = "  Prasanna  ";
		System.out.println(x.trim()+y.trim());
		String value = x.trim() + y.trim();
		System.out.println(value);


		String car = "Toyota Supra";
		char[] charvalue = car.toCharArray();
		int len = charvalue.length;
        System.out.println("Char Array Lenght :" + len);
        System.out.println("Char Array Elements :");
		for(int i=0;i<charvalue.length;i++){
			System.out.println(charvalue[i]);
		}

		boolean isempty = cameraBrand.isEmpty();
		System.out.println(isempty);


		char charresult = firstName.charAt(3);
		System.out.println(charresult);


		int intValue = secondName.length();
		System.out.println(intValue);


		boolean isEndsWith = firstName.endsWith("oj");
		System.out.println(isEndsWith);


		int compare = firstName.compareTo(secondName);
		System.out.println(compare);

		String intern = firstName.intern();
		System.out.println(intern);

		boolean itStartsWith = firstName.startsWith("Man");
		System.out.println(itStartsWith);
	}
}