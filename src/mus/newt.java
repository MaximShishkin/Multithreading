package mus;

public class newt extends Thread{
	
	Thread t;
	
	public newt(String name)
	{
		t = new Thread(this, name);
		System.out.println("����� �����: " + t);
		t.start(); 
	}
	
	public void run() {
		while(start.go());
	}
}
