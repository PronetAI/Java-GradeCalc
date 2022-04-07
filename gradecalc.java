import java.util.Scanner;
public class grade_calc {
	double one;
	double two;
	double three;
	double four;
	double five;
	double avg;
	public double calcAverage()
	{avg=(one+two+three+four+five)/5;
	 return avg;}
	public String determineGrade(double score)
  {if (score>=90) {
		 return "A";}
	 else if (score>=80 && score >=89) {
		 return "B";}
	 else if (score>=70 && score >=79) {
		 return "C";}
	 else if (score>60 && score >=69) {
		 return "D";}
	 else if (score<=60) {
		 return "F";}
	 return "F";}
	public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in); 
		    grade_calc g1 = new grade_calc();
		    g1.one=sc.nextDouble();
		    g1.two=sc.nextDouble();
		    g1.three=sc.nextDouble();
		    g1.four=sc.nextDouble();
		    g1.five=sc.nextDouble();
		    System.out.println("Average = "+g1.calcAverage());
		    System.out.println(g1.determineGrade(g1.one)+g1.determineGrade(g1.two)+g1.determineGrade(g1.three)
		    +g1.determineGrade(g1.four)+g1.determineGrade(g1.five));}}
