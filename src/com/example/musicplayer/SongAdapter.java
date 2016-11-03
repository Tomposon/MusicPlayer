package com.example.musicplayer;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SongAdapter extends ArrayAdapter<Song>{

	private int resourceId;
	
	public SongAdapter(Context context,int textViewResourceId,
			List<Song> objects) {
		super(context,textViewResourceId, objects);
		// TODO Auto-generated constructor stub
		resourceId=textViewResourceId;
	
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		Song song=getItem(position);
		View view=LayoutInflater.from(getContext()).inflate(resourceId, null);
		
		ImageView bgImage=(ImageView)view.findViewById(R.id.bgImage);
		TextView title=(TextView)view.findViewById(R.id.title);
		TextView singerName=(TextView)view.findViewById(R.id.singerName);
		
		bgImage.setImageResource(song.getBgImage());
		title.setText(song.getTitle());
		singerName.setText(song.getSingerName());
		
		return view;
		
	}
	
	

}
