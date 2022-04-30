package test;

public class test 
{

	public static void Add() {
		
		System.out.println("Inside Parent");

	}
	
	

}

class test2 extends test
{
	public  static void Add() {
		
		System.out.println("Inside Child");

	}
	
	public static void main(String agrs[]) {
		
		
		test t =  new test2();
		t.Add();
		
	}
	
	
	
}
