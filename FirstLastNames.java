package com.org.arrays;

import java.util.Arrays;
//input string array which contain names. Names format is First name middle name,
//last name separated by a space.First name n last name are required but middle name is optional
//print each last name nd a count of how may times it occurs.one name per line. Each last name
//should appear only once in output.sorting the out put alphabetically is a plus.
//no need to use any advanced language feature.not use any collection
public class FirstLastNames {
	
	private static void lastNameCount(String[] str){
		// comment
		String[] lastName = new String[str.length];
		int j=0,;
		for(String s:str){
			String[] fnln = s.split(" ");
			if(fnln.length==3){
				String firstName = fnln[0];
				String middleName = fnln[1];
				String latName = fnln[2];
				lastName[j]=latName;
				j++;
			}
			else{
				String firstName = fnln[0];
				String latName = fnln[1];
				lastName[j]=latName;
				j++;
			}
		}
		Arrays.sort(lastName);// this array contains duplicates in sorted order
		/*System.out.println(lastName[0]);
		System.out.println(lastName[1]);
		System.out.println(lastName[2]);
		System.out.println(lastName[3]);
		System.out.println(lastName.length);*/
		
		//this loop counts the occurence of each element in the sorted array
		int count=1;
		for(int i=0; i+1<lastName.length; i++){
			/*System.out.println(i);
			System.out.println(lastName[i]);
			System.out.println(lastName[i+1]);*/
			System.out.println(lastName[i].equals(lastName[i+1]));
			if(lastName[i].equals(lastName[i+1])){
				count++;
				if(i+1==lastName.length-1){
					System.out.println(lastName[i]+" occurence is "+count);
				}
			}
			else{
				System.out.println(lastName[i]+" occurence is "+count);
				if(i+1==lastName.length-1){
					count=1;
					System.out.println(lastName[i+1]+" occurence is "+count);
				}
				count=1;
			}
		}
	}

	public static void main(String[] args) {
		
		String[] str = {"Vasudeva sharma", "Siva arugunta", "Krishna arugunta"};
		String[] str1 = {"Vasudeva sharma", "Siva arugunta", "Krishna arugunta", "Vasudeva sharma"};
		String[] str2 = {"Vasudeva sharma", "Sudhakar kundena", "Krishna arugunta"};
		String[] str3 = {"Vasudeva sharma", "Sudhakar sharma", "Krishna sharma"};
		System.out.println(str);// prints the address of object
		lastNameCount(str3);
				
	}

}
