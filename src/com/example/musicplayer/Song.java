package com.example.musicplayer;
/**
 * �����࣬��Ϊһ��ListViewһ����¼
 * @author Mr.Chen
 *
 */

public class Song {
	
	//������
	private String title;
	
	//������
	private String singerName;
	
	//����ͼƬ��ID
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
