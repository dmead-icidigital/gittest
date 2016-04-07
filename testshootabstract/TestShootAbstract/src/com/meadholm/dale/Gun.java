package com.meadholm.dale;

public abstract class Gun {
	private int MagazineCapacity;
	private int RoundsLeft;
	private String GunName;
	private String GunNoise;
	private int ShotsPerRound;
	
	public void reload(){
		RoundsLeft = MagazineCapacity;	
	}
	public String shoot() {
		RoundsLeft=RoundsLeft-ShotsPerRound;
		if (RoundsLeft>0){
			return GunNoise;
		} else {
			return "Click";
		}
	}
	public void setMagazineCapacity(int rounds) {
		MagazineCapacity = rounds;
	}
	public int getMagazineCapacity(){
		return MagazineCapacity;
	}
	public void setGunName(String name) {
		GunName = name;
	}
	public void setShotsPerRound(int SPR){
		ShotsPerRound = SPR;
	}
	public String getGunName(){
		return GunName;
	}
	public void setGunNoise(String noise){
		GunNoise = noise;
	}
	public String getStatus(){
		return "Your " + GunName + " has " + RoundsLeft + " rounds left.";
	}
	public void initializeGun(String name, int magcap, String noise, int shotsperround){
		GunName = name;
		MagazineCapacity = magcap;
		GunNoise = noise;
		ShotsPerRound = shotsperround;
		RoundsLeft=magcap;
		
	}

}
