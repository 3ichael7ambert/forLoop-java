package Java.forLoop-java;

public class forLoopBreak {
	public static void main(String[ ] args) {
		for(int x=1; x<10; x++) {
			System.out.println(x);
			if(x == 4) {
				break;
			}
		}
	}
}