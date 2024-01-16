//Q3. Write a Java program to create a base class Sports with a method called play(). Create three subclasses: Football, Basketball, and Rugby. Override the play() method in each subclass to play a specific statement for each sport.

package java_test;

//base class
class Sports{
	public void play() {
	   System.out.println("play sports");
	}
}
//subclass Football
class Football extends Sports{
	//overriding the method
	public void play() {
		System.out.println("play football");
	}
}
//subclass Basketball
class Basketball extends Sports{
	//overriding the method
	 public void play() {
		 System.out.println("play basketball");
	 }
}
//subclass rugby
class rugby extends Sports{
	//overriding the method
	 public void play() {
		 System.out.println("play rugby");
}
}
// main method
public class Play_sports {

	public static void main(String[] args) {
	   Sports s=new Sports();
	   Football f=new Football();
	   Basketball b=new Basketball();
	   rugby r=new rugby();
	   
	   s.play();
	   f.play();
	   b.play();
	   r.play();

	}
}


