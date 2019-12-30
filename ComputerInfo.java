package sample_project.javastudy;

class Computer {
	public String os;
	public int memory;
	public int storage;
}

public class ComputerInfo {

	public static void main(String[] args) {
		Computer desktop = new Computer();
		desktop.os = "windows 10";
		desktop.memory = 4;
		desktop.storage = 512;
		
		System.out.println("\nOS:" + desktop.os);
		System.out.println("Memory: " + desktop.memory + "GB");
		System.out.println("HDD容量: " + desktop.storage + "GB");
		
		Computer desktop2 = desktop;
		
		desktop2.os = "Ubuntu";
		desktop2.memory = 2;
		desktop2.storage = 256;
		
		System.out.println("\nOS:" + desktop2.os);
		System.out.println("Memory: " + desktop2.memory + "GB");
		System.out.println("HDD容量: " + desktop2.storage + "GB");

	}

}
