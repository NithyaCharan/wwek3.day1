package org.system;

public class Desktop extends Computer{

	public void desktopSize() {
		System.out.println("The size of the desktop is medium");
	}
	
	public static void main(String[] args) {
		
		Desktop dst = new Desktop();
		
		dst.computerModel();
		
		dst.desktopSize();
	}
}
