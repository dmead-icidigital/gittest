package com.meadholm.dale;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestShoot {

	public static void main(String[] args) {

		BufferedReader keybd =
				new BufferedReader(new InputStreamReader(System.in));
		String strLine = null;
		Gun M = new Gun();
		M.initializeGun("M16", 30, "pewpewpewpewpew", 3);
		Gun GG = new Gun();
		GG.initializeGun("Golden Gun", 20, "bang", 1);
		Gun AK =  new Gun();
		AK.initializeGun("AK47", 40, "powpowpowpowpow", 5);

		try {               
			while(true)
			{
				System.out.println("Choose GoldenGun ('GG'), AK47 ('AK'), M16,('M16'), or exit");
				strLine = keybd.readLine();

				if(strLine.equals("exit")) {
					  
						System.out.println("exit routine");
						break;} else if(strLine.equals("GG")) {           
						getChoice(GG,keybd);
					}

				  else if (strLine.equals("AK")){
					getChoice(AK,keybd);					
				}

				else if (strLine.equals("M16")){
					getChoice(M,keybd);			
				}
			}
		
		keybd.close(); 


	}catch(

	Exception e)
	{
		System.out.println("Error while reading line from console : " + e);
	}

}

	public static void getChoice(Gun myGun, BufferedReader keybd) {
		String strLine = "";

		System.out.println("You Choose the " + myGun.getGunName());
		System.out.println(myGun.shoot());
		System.out.println(myGun.getStatus());
		System.out.println("Would you like to reload the " + myGun.getGunName() + "?");
		try {
			strLine = keybd.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (strLine.equals("yes")) {
			myGun.reload();
			System.out.println(myGun.getStatus());
		}

	}

}
