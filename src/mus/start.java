package mus;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class start {

	public static void main(String[] args) {
		System.out.println("����� �������� ��������");
		newt t = new newt("��� �����");
		System.out.println("����� ������� �� ��������");
		while(true)
		{
		sto();
		}
	}

	static void sto()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
		}
	}
	
	static boolean go()
	{
		try {
			FileInputStream music=new FileInputStream("1.mp3");
			Player player = new Player(music);
			player.play();
			player.close();
			music.close();
		} catch (FileNotFoundException e) {
			System.out.print("���� �� ������!");
		} catch (JavaLayerException e) {
			System.out.print("���� �� �������!");
		} catch (IOException e) {
			System.out.print("���� �� �����������!");
		}
		
		return true;	
	}
}
