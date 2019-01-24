package io.man.unit2;

public class ThisReferenceExample {
	public void doProcess(int i, Process process){
		process.process(i);
	}
	public void execute(int i ){
		doProcess(i, x->{
							System.out.println(x);
							System.out.println(this);
						});
		
	}
	public static void main(String[] args) {
		int i=10;
		ThisReferenceExample thisRef = new ThisReferenceExample();
		thisRef.doProcess(i, x->{System.out.println(x);/*System.out.println(this );*/}); //this is not accessible in static context
		
		thisRef.execute(i);
	}
	@Override
	public String toString() {
		return "ThisReferenceExample".toString();
	}

}
