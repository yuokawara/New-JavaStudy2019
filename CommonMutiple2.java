package sample_project.javastudy;

public class CommonMutiple2 {

	public static void main(String[] args) {
		// 2または3の倍数以外の表記
		int i = 1;
		while (i < 50) {
			if (!((i % 3 == 0) || (i % 2 == 0))){ 
				System.out.println(i);
			}
			i++;
		}

	}

}
