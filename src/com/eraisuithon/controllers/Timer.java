package com.eraisuithon.controllers;

public class Timer {
	private static final long MS_PER_SEC = 1000L;
	private static final float MS_TO_SEC = 1.0f / (float)MS_PER_SEC;
	
	private long last;
	
	private float tps;
	
	private float dt;
	private int missingTicks;
	
	
	
	
	public Timer(float tps) {
		this.setTps(tps);
	}
	
	public void initTimer() {
		last = System.currentTimeMillis();
		dt = 1.0f;
	}
	
	public void update() {
		long now = System.currentTimeMillis();
		long dMs = now - last;
		last = now;
		dt += dMs * MS_TO_SEC * tps;
		missingTicks = (int) dt;
	}
	
	public float getDeltaTicks() {
		return dt;
	}
	
	public int getMissingTicks() {
		return missingTicks;
	}
	
	public void tickPassed() {
		dt--;
	}
	
	public void sleep() {

	}

	public void setTps(float tps) {
		this.tps = tps;
	}
}
