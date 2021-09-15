package Hareprograms;

import java.util.Random;

public class GenerateRandomNumberAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();

		int r=rand.nextInt(100);
		System.out.println(r);

		double r1=rand.nextDouble();  //range 0.0 to less then 1.0
		System.out.println(r1);

		// 2nd method
		System.out.println(Math.random());

	}

}
