package com.eraisuithon.engine;

public abstract class AppController {
	final int DEFAULT_TPS = 20;
	final int DEFAULT_FPS = 60;
	Timer timer;
	
	public AppController() {
		timer = new Timer(DEFAULT_TPS);
	}
	
	public AppController(int tps, int fps) {
		timer = new Timer(tps);
	}
}
