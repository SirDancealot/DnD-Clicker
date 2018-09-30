package com.eraisuithon.dndclicker;

public class DnDClickerMain extends DnDClicker {
	public DnDClickerMain() {
		super();
	}

	public DnDClickerMain(float tps, float fps) {
		super(tps, fps);
	}
	
	public static void main(String[] args) {
		if (args.length != 0)
			new DnDClickerMain(Float.valueOf(args[0]), Float.valueOf(args[1])).start();
		else
			new DnDClickerMain().start();
	}
}
