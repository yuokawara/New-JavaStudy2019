package sample_project.javastudy;

public class BmiCalc {
/* BMI計算プログラム 
 * BMI = 体重　/ (身長 * 身長)
 * 体重　Kg　身長　cm
 * */
	public static void main(String[] args) {
		double weight,height,bmi;
		
		weight = 90;
		height = 180;
		
		height /= 100;
		bmi = weight / (height * height);
		
		System.out.println(bmi);
		
		if(bmi < 18.5)  {
			System.out.println("痩せ型だよー");
		} else if(bmi <= 21) {
			System.out.println("標準だよー");
		} else {
			System.out.println("太り過ぎだよー");
		}

	}

}
