import java.util.Scanner;
class VolumeOfaCylinder{
	public static void main(String [] args){
		Scanner am=new Scanner(System.in);
		System.out.println("enter the radius");
		int radius= am.nextInt();
		System.out.println("Enter the height");
		int height=am.nextInt();
		float volume=3.14f*radius*radius*height;
		System.out.println(volume);
		
	}
}