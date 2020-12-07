import java.util.scanner.*;
public class Minutes{
public static void main(String[] args){
double minutesInYear=60*24*365;
Scanner sc = new Scanner(system.in);
System.out.println("Input the number of minutes: ");
double min = sc.nextDouble();
long years = (long)(min/minutesInYear);
int days = (int)(min/60/24)%365;
System.out.println((int)min +"minutes is approximately "+ years + "years and "+ days + "days");
}
}
