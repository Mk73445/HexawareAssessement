


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaAssessment {

	public static void main(String[] args) {
		
		//Question 1. Input: List = {5, 13, 4, 21, 13, 27, 2, 59, 59, 34}
		List<Integer> elements = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
        Set<Integer> duplicateElements = elements.stream().filter(element -> Collections.frequency(
        		elements, element) > 1).collect(Collectors.toSet());
        System.out.println("Duplicate elements are : " + duplicateElements );
        
    
		// Question 2. Input: List = {4,5,7,8,99,100,101,33,32,4,4}
		List<Integer> numbers = Arrays.asList(4, 5, 7, 8, 99, 100, 101, 33, 32, 4, 4);
		List<Integer> distNumbers = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("numbers after remove duplicates : " + distNumbers);

		
		// Question 3. Input: List = {3,90,350,5}
		Integer maxElement = Stream.of(3, 90, 350, 5).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("maximum element : " + maxElement);

		
		// Question 4. Input :list { 6, 8, 3, 5, 1, 9 };
		Integer minNum = Stream.of(6, 8, 3, 5, 1, 9).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("minimum number : " + minNum);
		
		Integer maxNum = Stream.of(6, 8, 3, 5, 1, 9).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("maximum number : " + maxNum);

	}

}
