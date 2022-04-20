package OopsConcepts;

public class recursionTesting {
	
	int factorial(int i){
		
		int result;
		
		if (i==1) return 1;
		result = factorial(i-1)*i;
		System.out.println(result);
		return result;
				
	}

}
