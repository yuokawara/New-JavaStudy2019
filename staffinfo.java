package sample_project.javastudy;

class Staff {
	String name;
	int staffid;
	String email;
	
	public void sayhello() {
		System.out.println("hello " + this.name);
	}
}
public class staffinfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Staff bonta = new Staff();
		bonta.name = "fumofumoさん";
		
		bonta.sayhello();
	}

}
