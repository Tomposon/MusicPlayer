package com.example.musicplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.ScrollView;
import android.widget.TextView;

public class LyricActivity extends Activity{

	private String[] lyrics_text={"穿起一身金衣装\n" +
            "取消今天的工作\n" +
            "挤身缤纷的色彩\n" +
            "来让我去告诉你\n" +
            "派对永无真意义\n" +
            "不管相识不相识\n" +
            "尽管多 D Say Hello\n" +
            "不需诸多的挑剔\n" +
            "无谓太过有性格\n" +
            "派对你要不缺席\n" +
            "你话唔俾面\n" +
            "佢话唔赏面\n" +
            "似为名节做奴隶\n" +
            "种种方式的捆绑\n" +
            "请柬一出怎抵挡\n" +
            "想出千般的推搪\n" +
            "明日富贵与闭翳\n" +
            "也要靠你俾下面\n" +
            "你话唔俾面\n" +
            "佢话唔赏面\n" +
            "似为名节做奴隶\n" +
            "你都咪话唔俾面\n" +
            "咪话唔赏面\n" +
            "似用人脸造钱币\n" +
            "你话唔俾面\n" +
            "佢话唔赏面\n" +
            "似为名节做奴隶\n" +
            "你都咪话唔俾面\n" +
            "咪话唔赏面\n" +
            "似用人脸造钱币\n" +
            "至惊至惊你地唔俾面\n" +
            "至惊至惊你地唔俾面\n" +
            "至惊至惊你地唔俾面\n" +
            "至惊至惊你地唔俾面","拦路雨偏似雪花\n" +
            "饮泣的你冻吗\n" +
            "这风褛我给你磨到有襟花\n" +
            "连调了职也不怕\n" +
            "富士山下\n" +
            "富士山下\n" +
            "怎么始终牵挂\n" +
            "苦心选中今天想车你回家\n" +
            "原谅我不再送花\n" +
            "伤口应要结疤\n" +
            "花瓣铺满心里坟场才害怕\n" +
            "如若你非我不嫁\n" +
            "彼此终必火化\n" +
            "一生一世等一天需要代价\n" +
            "谁都只得那双手\n" +
            "靠拥抱亦难任你拥有\n" +
            "要拥有必先懂失去怎接受\n" +
            "曾沿着雪路浪游\n" +
            "为何为好事泪流\n" +
            "谁能凭爱意要富士山私有\n" +
            "何不把悲哀感觉\n" +
            "假设是来自你虚构\n" +
            "试管里找不到它染污眼眸\n" +
            "前尘硬化像石头\n" +
            "随缘地抛下便逃走\n" +
            "我绝不罕有\n" +
            "往街里绕过一周\n" +
            "我便化乌有\n" +
            "情人节不要说穿\n" +
            "只敢抚你发端\n" +
            "这种姿态可会令你更心酸\n" +
            "留在汽车里取暖\n" +
            "应该怎么规劝\n" +
            "怎么可以将手腕忍痛划损\n" +
            "人活到几岁算短\n" +
            "失恋只有更短\n" +
            "归家需要几里路谁能预算\n" +
            "忘掉我跟你恩怨\n" +
            "樱花开了几转\n" +
            "东京之旅一早比一世遥远\n" +
            "谁都只得那双手\n" +
            "靠拥抱亦难任你拥有\n" +
            "要拥有必先懂失去怎接受\n" +
            "曾沿着雪路浪游\n" +
            "为何为好事泪流\n" +
            "谁能凭爱意要富士山私有\n" +
            "何不把悲哀感觉\n" +
            "假设是来自你虚构\n" +
            "试管里找不到它染污眼眸\n" +
            "前尘硬化像石头\n" +
            "随缘地抛下便逃走\n" +
            "我绝不罕有\n" +
            "往街里绕过一周\n" +
            "我便化乌有\n" +
            "谁都只得那双手\n" +
            "靠拥抱亦难任你拥有\n" +
            "要拥有必先懂失去怎接受\n" +
            "曾沿着雪路浪游\n" +
            "为何为好事泪流\n" +
            "谁能凭爱意要富士山私有\n" +
            "何不把悲哀感觉\n" +
            "假设是来自你虚构\n" +
            "试管里找不到它染污眼眸\n" +
            "前尘硬化像石头\n" +
            "随缘地抛下便逃走\n" +
            "我绝不罕有\n" +
            "往街里绕过一周\n" +
            "我便化乌有\n" +
            "你还嫌不够\n" +
            "我把这陈年风褛\n" +
            "送赠你解咒","    忧郁奔向冷的天 撞落每滴小雨点\n" +
            "　　张开口似救生圈 实现雨的酸与甜\n" +
            "　　搓起心爱的香烟 弄着脚底的软垫\n" +
            "　　酒醉与心碎心碎沟起污染一片\n" +
            "　　WOO HOO 无心睡眠 WOO HOO脑交战\n" +
            "　　踏着旧日怀念昨天的你\n" +
            "　　夜是渗着前事全挥不去\n" +
            "　　若是你在明日能得一见\n" +
            "　　就让我在怀内重得温暖\n" +
            "　　忧郁奔向冷的天\n" +
            "　　活在我的心里边\n" +
            "　　始终只有你方可\n" +
            "　　令逝去的心再甜\n" +
            "\n" +
            "　　忧郁奔向冷的天 撞落每滴小雨点\n" +
            "　　张开口似救生圈 实现雨的酸与甜\n" +
            "　　搓起心爱的香烟 弄着脚底的软垫\n" +
            "　　酒醉与心碎心碎沟起污染一片\n" +
            "　　WOO HOO无心睡眠 WOO HOO脑交战\n" +
            "　　踏着旧日怀念昨天的你\n" +
            "　　夜是渗着前事全挥不去\n" +
            "　　若是你在明日能得一见\n" +
            "　　就让我在怀内重得温暖\n" +
            "　　忧郁奔向冷的天\n" +
            "　　活在我的心里边\n" +
            "　　始终只有你方可\n" +
            "　　令逝去的心再甜\n" +
            "　　WOO HOO无心睡眠 WOO HOO脑交战\n" +
            "　　踏着旧日怀念昨天的你\n" +
            "　　夜是渗着前事全挥不去\n" +
            "　　若是你在明日能得一见\n" +
            "　　就让我在怀内重得温暖\n" +
            "　　忧郁奔向冷的天 活在我的心里边\n" +
            "　　始终只有你方可 令逝去的心再甜\n" +
            "　　忧郁奔向冷的天 活在我的心里边\n" +
            "　　始终只有你方可 令逝去的心再甜\n" +
            "　　忧郁奔向冷的天"};
	private TextView textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.lyric);
		textView=(TextView)findViewById(R.id.lyric);
		Intent intent=getIntent();
		String title=intent.getStringExtra("song_title");
	
		if("俾面派对".equals(title))
			textView.setText(lyrics_text[0]);
		else if("富士山下".equals(title))
			textView.setText(lyrics_text[1]);
		else textView.setText(lyrics_text[2]);
		
	}
	
	

}
