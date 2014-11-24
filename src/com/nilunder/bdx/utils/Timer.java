package com.nilunder.bdx.utils;

import com.badlogic.gdx.utils.TimeUtils;



public class Timer {
	
	private long delta;
	private long timeLast;

	public Timer(){
		this(1f);
	}
	
	public Timer(float secondsDelta){
		delta(secondsDelta);
		timeLast = TimeUtils.millis();
	}

	public void delta(float secondsDelta){
		delta = (long)(secondsDelta * 1000);
	}
	
	public boolean time(){
		long timeNow = TimeUtils.millis();
		if (timeNow - timeLast > delta){
			timeLast = timeNow;
			return true;
		}
		return false;
	}
}
