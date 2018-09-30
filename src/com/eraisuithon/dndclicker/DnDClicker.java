package com.eraisuithon.dndclicker;

import com.eraisuithon.controllers.*;

public class DnDClicker {
	Timer timer;
	
	int missingTicks;
	
	float fps = 60.0f;
	float tps = 2.0f;
	
	boolean running = true;
	
	public DnDClicker() {
	}
	
	public DnDClicker(float tps, float fps) {
		this.tps = tps;
		this.fps = fps;
	}
	
	protected void start() {
		init();
		startLoop();
		stop();
	}
	
	private void init() {
		timer = new Timer(tps);
	}
	
	private void startLoop() {
		timer.initTimer();
		while (running) {
			timer.update();
			missingTicks = timer.getMissingTicks();
			for (int i = 0; i < missingTicks; i++) {
				tick();
				timer.tickPassed();
			}
			render();
			
			timer.sleep();
		}
	}
	
	private void stop() {

	}
	
	private void tick() {
		
	}
	
	private void render() {

	}
}
