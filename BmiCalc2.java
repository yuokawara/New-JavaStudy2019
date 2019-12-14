package sample_project.javastudy;

import java.util.Scanner;
public class BmiCalc2 {
/* BMI計算プログラム 
 * BMI = 体重　/ (身長 * 身長)
 * 体重　Kg　身長　cm
 * */
	public static void main(String[] args) {
		double weight,height,bmi;
		
//		weight = 90;
//		height = 180;
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("体重は？ (kg) :");
		weight =  stdIn.nextDouble();
		System.out.println("身長は？ (cm) :");
		height =  stdIn.nextDouble();
		
		height /= 100;
		bmi = weight / (height * height);
		
		System.out.println("BMI :" + bmi + " です。 ");
		
		if(bmi < 18.5)  {
			System.out.println("痩せ型だよー");
		} else if(bmi <= 25) {
			System.out.println("標準だよー");
		} else {
			System.out.println("太り過ぎだよー");
		}

	}

}
