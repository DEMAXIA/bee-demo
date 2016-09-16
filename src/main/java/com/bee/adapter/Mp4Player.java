package com.bee.adapter;

public class Mp4Player implements AdvancedMediaPlayer {

	public void playVlc(String fileName) {
		// do nothing

	}

	public void playMp4(String fileName) {
		System.out.println("playing mp4 file, name: " + fileName);
	}

}
