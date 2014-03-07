
public  class AllFunction extends AbstructDrawFunction  {
	
	public double setx(double x){
		return x*x;
	}
	public double setsin(double x){
		return Math.sin(x);
	}
	public double setcos(double x){
		return Math.cos(x);
	}
	public double settan(double x){
		return Math.tan(x);
	}
	public double setcossin(double x){
		return Math.cos(x)+5*Math.sin(x);
	}
	public double setsincos(double x){
		return 5*Math.cos(x) + Math.sin(x);
	}
	public double setlog(double x){
		return Math.log10(x) + x*x;
	}
	@Override
	double f(double x) {
		// TODO Auto-generated method stub
		return x;
	}
	
	
}
