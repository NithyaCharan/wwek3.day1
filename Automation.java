package week3.day1.assignment;

public class Automation extends MultipleLangauge{

	public void Selenium() {
		System.out.println("From interface TestTool");
	}

	public void Java() {
		System.out.println("From interface Language");		
	}

	@Override
	public void ruby() {
		System.out.println("Abstract method from abstract class");
	}

	public static void main(String[] args) {
		
		Automation at = new Automation();
		at.Java();
		at.python();
		at.ruby();
		at.Selenium();
	}
}
