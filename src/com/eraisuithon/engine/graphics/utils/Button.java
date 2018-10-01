package com.eraisuithon.engine.graphics.utils;

public abstract class Button {
	int x, y, xSize, ySize;
	public Button(int x, int y, int xSize, int ySize) {
		this.x = x;
		this.y = y;
		this.xSize = xSize;
		this.ySize = ySize;
	}
	
	public abstract void onPress();

	public abstract void onRelease();

	public abstract void onHover();
	
	public abstract void onHoverOff();
	
}
