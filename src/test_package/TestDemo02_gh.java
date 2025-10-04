package test_package;

import java.util.HashSet;

public class TestDemo02_gh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArr = {10, 20, 55, 20, 45, 22, 55, 67, 90};
		
		for(int i=0; i<numArr.length; i++) {
			
			int num = numArr[i];
			
			for(int j=0; j<numArr.length; j++) {
				
				if(!(i==j)) {
					if(num == numArr[j]) {
						System.out.println("Number is duplicate : "+num);
					}
				}
				
			}
		}
		
		
		//================================
		
	    int[] numbers = {10, 20, 55, 20, 45, 22, 55, 67, 90}; //{1, 5, 7, 2, 5, 3, 1, 9, 7, 4};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : numbers) {
            if (!seen.add(num)) {
                duplicates.add(num); // Already exists in 'seen'
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicate elements are: " + duplicates);
        }
	}

}
