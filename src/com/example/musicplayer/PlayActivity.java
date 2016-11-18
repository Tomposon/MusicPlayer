package com.example.musicplayer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;


public class PlayActivity extends Activity implements OnClickListener{

	private ListView songListView;
	private List<Song> songList=new ArrayList<Song>();
	private SongAdapter songAdapter;
	private MediaPlayer mediaPlayer=new MediaPlayer();
	
	private Button play;
	private Button pause;
	private Button stop;
	
	private Song currentSong=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_play);
        initSongList();
        play=(Button)findViewById(R.id.play_music);
        pause=(Button)findViewById(R.id.pause_music);
        stop=(Button)findViewById(R.id.stop_music);
        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);
        songAdapter=new SongAdapter(this,R.layout.songitem_layout,songList);
        songListView=(ListView)findViewById(R.id.song_list_view);
        songListView.setAdapter(songAdapter);
     
        songListView.setOnItemClickListener(new OnItemClickListener()
        {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				// TODO Auto-generated method stub
				//停止当前播放歌曲，播放所点击的歌曲
				
				Song song=songList.get(position);
				if(currentSong!=song){
					if(mediaPlayer.isPlaying())
						mediaPlayer.reset();
					currentSong=song;
					String title=song.getTitle();
					if("俾面派对".equals(title)){
						initMediaPlayer("m1.mp3");
						
					}
					else if("富士山下".equals(title)){
						initMediaPlayer("m2.mp3");
						
					}
					else {
						initMediaPlayer("m3.mp3");
						
					}
					
					mediaPlayer.start();
				}
				
				if(!mediaPlayer.isPlaying()){
					
				}
				
				
				
				
				Intent intent=new Intent(PlayActivity.this,LyricActivity.class);
				intent.putExtra("song_title", song.getTitle());
				startActivity(intent);
			
			}
        	
        });
    }
    

    
    private void initSongList()
    {
    	songList.add(new Song("俾面派对","BEYOND",R.drawable.c1));
    	songList.add(new Song("富士山下","陈奕迅",R.drawable.c2));
    	songList.add(new Song("无心睡眠","张国荣",R.drawable.c3));
    }

    private void initMediaPlayer(String songPath)
    {
    	
    	try {
    		File file=new File(Environment.getExternalStorageDirectory(),songPath);
			mediaPlayer.setDataSource(file.getPath());
			mediaPlayer.prepare();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }



	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.play_music:
			if(!mediaPlayer.isPlaying()){
				mediaPlayer.start();
			}
			break;
		case R.id.pause_music:
			if(mediaPlayer.isPlaying())
			{
				mediaPlayer.pause();
			}
			break;
		case R.id.stop_music:
			if(mediaPlayer.isPlaying()){
				mediaPlayer.reset();
				
			}
			break;
			default:break;
		}
	}
	
	protected void onDestory()
	{
		super.onDestroy();
		if(mediaPlayer!=null)
		{
			mediaPlayer.stop();
			mediaPlayer.release();
		}
	}

}
