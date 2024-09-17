package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Bruttoinntekt = showInputDialog("Bruttoinntekt: ");
int bruttoinntekt1 = Integer.parseInt(Bruttoinntekt);

if (bruttoinntekt1 >=  0 && bruttoinntekt1 <= 208050) {
	System.out.println("Trinnskatten blir: 0kr");
}
else if (bruttoinntekt1 >=  208051 && bruttoinntekt1 <= 292850) {
	double skattenivå = (bruttoinntekt1/100)*1.7;
	System.out.println("Trinnskatten blir: "+ skattenivå + "kr for bruttolønn på "+ bruttoinntekt1);
}
else if (bruttoinntekt1 >=  292851 && bruttoinntekt1 <= 670000) {
	double skattenivå = (bruttoinntekt1/100)*4.0;
	System.out.println("Trinnskatten blir: "+ skattenivå + "kr for bruttolønn på "+ bruttoinntekt1);
}
else if (bruttoinntekt1 >=  670001 && bruttoinntekt1 <= 937900) {
	double skattenivå = (bruttoinntekt1/100)*13.6;
	System.out.println("Trinnskatten blir: "+ skattenivå + "kr for bruttolønn på "+ bruttoinntekt1);
}
else if (bruttoinntekt1 >=  937901 && bruttoinntekt1 <= 1350000) {
	double skattenivå = (bruttoinntekt1/100)*16.6;
	System.out.println("Trinnskatten blir: "+ skattenivå + "kr for bruttolønn på "+ bruttoinntekt1);
}
else {
	double skattenivå = (bruttoinntekt1/100)*17.6;
	System.out.println("Trinnskatten blir: "+ skattenivå + "kr for bruttolønn på "+ bruttoinntekt1);
}
}
}
