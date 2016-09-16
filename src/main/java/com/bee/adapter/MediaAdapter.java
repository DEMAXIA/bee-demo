package com.bee.adapter;

public class MediaAdapter implements MediaPlayer {

	private AdvancedMediaPlayer musicPlayer;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			musicPlayer = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			musicPlayer = new Mp4Player();
		}
	}

	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			musicPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			musicPlayer.playMp4(fileName);
		}
	}

}
