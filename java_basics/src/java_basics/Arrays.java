package java_basics;

public class Arrays {

	public static void main(String[] args) {
		

		int [] arr = new int[100];
		arr[0] = 1;
		arr[2] = 1000;
		arr[99] = 93432;
		
		System.out.println(arr[54]); 
		System.out.println(arr[99]); 
		
	
		String [] words = new String[] {"My", "Name", "is"};
		System.out.println(words[2]);
		
		
		String [] words2 = new String[3];
		words2[0] = "My";
		words2[1] = "Name";
		words2[2] = "is";
		System.out.println(words2[1]);
		
		words2 = new String[10];
		System.out.println(words2[2]); 

	}

}
