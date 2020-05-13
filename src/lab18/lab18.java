package lab18;

import java.util.ArrayList;

public class lab18 {
	static ArrayList<Integer> negativeNumber = new ArrayList<>();
	public static void main(String[] args){
			System.out.println(add("1!2"));
	}
	
public static int add(String numbers){
	String[] MyData;
	MyData = numbers.split(("\\n|,|;|\\.|\\?|!|:|@|\\[|\\]|\\(|\\)|\\{|\\}|_|\\*|/"));
	int returnAnswer = 0; 
	if(numbers == "") {
		return 0;
	}

	for(int i = 0; i < MyData.length; i++) {
		if(MyData[i].contains("[^a-zA-z0-9]")) {
			MyData[i].replaceAll("[^a-zA-z0-9]","");
		}

		if(Integer.parseInt(MyData[i]) < 0) {
			negativeNumber.add(Integer.parseInt(MyData[i]));
			System.out.println("negatives not allowed");
			MyData[i] = "0";
		}
		if(Integer.parseInt(MyData[i]) > 1000) {
			MyData[i] = "0";
		}
		
		
		returnAnswer = returnAnswer + Integer.parseInt(MyData[i]);
	}
	return returnAnswer;
}
	

	
	
}
