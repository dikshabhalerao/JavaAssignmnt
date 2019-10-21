package assignment1;

public class ComplexNo5 {
	double real,imag;
	
	public ComplexNo5(double d, double e) {
       this.real=d;
	   this.imag=e;
	}
	public static void main(String[] args) {
		ComplexNo5 m= new ComplexNo5(2.3,3.4);
		ComplexNo5 n= new ComplexNo5(4.3,5.4);
		ComplexNo5 temp;
		 temp=add(m,n);
		 System.out.printf("sum=%f+%fi",temp.real,temp.imag);
		
	}
	
	public static ComplexNo5 add (ComplexNo5 m,ComplexNo5 n) {
	
	ComplexNo5 temp = new ComplexNo5(0.0, 0.0);
    temp.real = m.real + n.real;
    temp.imag = m.imag + n.imag;
    return(temp);
}
	public static ComplexNo5 mul (ComplexNo5 m,ComplexNo5 n) {
		
		ComplexNo5 temp = new ComplexNo5(0.0, 0.0);
	    temp.real = m.real * n.real;
	    temp.imag = m.imag * n.imag;
	    return(temp);
}
	public static ComplexNo5 div (ComplexNo5 m,ComplexNo5 n) {
		
		ComplexNo5 temp = new ComplexNo5(0.0, 0.0);
	    temp.real = m.real / n.real;
	    temp.imag = m.imag / n.imag;
	    return(temp);
	}

}
