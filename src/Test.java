import java.util.Scanner;


public class Test {

	
	public static void main(String[] args){
		AllFunction af  = new AllFunction();
		fc1 bf = new fc1();
		Fc2 cf = new Fc2();
		Fc3 df = new Fc3();
		Fc4 ef = new Fc4();
		Fc5 ff = new Fc5();
		Fc6 gf = new Fc6();
		Fc7 hf = new Fc7();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number for X");
		double x = input.nextDouble();
		System.out.println(af.setx(x));
		System.out.println(af.setsin(x));
		System.out.println(af.setcos(x));
		System.out.println(af.settan(x));
		System.out.println(af.setcossin(x));
		System.out.println(af.setsincos(x));
		System.out.println(af.setlog(x));
		
		// another way to print out
		System.out.println(bf.setx(x));
		System.out.println(cf.setsin(x));
		System.out.println(df.setcos(x));
		System.out.println(ef.settan(x));
		System.out.println(ff.setcossin(x));
		System.out.println(gf.setsincos(x));
		System.out.println(hf.setlog(x));
	}
}
