package com.maven.Java8Task;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.LinkedList;
/**
 * Hello world!
 *
 */
public class App 
{
	public static boolean isPalindrome(String input) {
	    String temp = input.replaceAll("\\s+", "").toLowerCase();
	    return IntStream.range(0, input.length() / 2)
	        .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
	}
	 
    public static void main( String[] args )
    {
    	int arr[] = {1,2,3,4,5};
    	
        
    	System.out.println("1. Average of array is "+avg(arr));
        List<String> sent = new LinkedList<String>();
        sent.add("and");
        sent.add("Aar");
        sent.add("Hels");
    	List<String> result = search(sent);
    	System.out.println("\n2. Result after search function");
    	for(int i=0;i<result.size();i++)
    			System.out.print(result.get(i)+" ");
    	
    	 String a = "Protijayi Meye MADAM GiniiniG Soudipta Gina";
    	 System.out.println("\n\n3. Found Palindromes");

         List<String> list = Arrays.stream(a.split(" ")).collect(Collectors.toList());
        
         for(int i=0;i<list.size();i++) {
        	 if(isPalindrome(list.get(i)))
        		 System.out.println( list.get(i));
         }

    

    }
    
    public static double avg(int arr[]) {
    	
    	 List<Integer> intList = new LinkedList<Integer>();
    	 for(int x:arr)
    	 	intList.add(x);

    	    double average = intList.stream().mapToInt(val -> val).average().orElse(0.0);
    	    return average;
    }
    public static List<String> search(List<String> list) {
    	return list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
    }
}
