package sample_project.javastudy;

class Staff {
	String name;
	int staffid;
	String email;
	
	public void sayhello() {
		System.out.println("hello " + this.name);
	}

	public Staff(String name, int staffid, String email) {
		super();
		this.name = name;
		this.staffid = staffid;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStaffid() {
		return staffid;
	}

	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
class RemoteStaff extends Staff {
	public String location;
	public RemoteStaff(String name, int staffid, String email) {
		super(name, staffid, email);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
}
public class staffinfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Staff bonta = new Staff("fumofumoさん", 123, "bonta@test.com");
		RemoteStaff orange = new RemoteStaff("orange momomo", 234, "orange@momo.co.jp");
		orange.location = "宇都宮";
		
		//bonta.sayhello();
		System.out.println("【社員情報】");
		System.out.println("【氏名】" + bonta.getName());
		System.out.println("【ID】" + bonta.getStaffid());
		System.out.println("【E-MAIL】" + bonta.getEmail());
		
		System.out.println("【社員情報】");
		System.out.println("【氏名】" + orange.getName());
		System.out.println("【ID】" + orange.getStaffid());
		System.out.println("【E-MAIL】" + orange.getEmail());
		System.out.println("【勤務地】" + orange.location);
	}

}
