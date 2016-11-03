package com.example.musicplayer;
/**
 * 歌曲类，作为一个ListView一个记录
 * @author Mr.Chen
 *
 */

public class Song {
	
	//歌曲名
	private String title;
	
	//歌手名
	private String singerName;
	
	//背景图片的ID
	private int bgImage;
	
	public Song(String title,String singerName,int bgImage)
	{
		this.title=title;
		this.singerName=singerName;
		this.bgImage=bgImage;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public int getBgImage() {
		return bgImage;
	}

	public void setBgImage(int bgImage) {
		this.bgImage = bgImage;
	}
	
	
	
	
}
