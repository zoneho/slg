package com.xgame.config.rank;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:21 
 */
public class RankPir extends BaseFilePri{
	
	/**﻿ID*/
	int id;
	/**名称*/
	int name;
	/**类型（1玩家2军团）*/
	int type;
	/**子类型（1当前战斗力值，2历史占领领土数量，3拥有领土数量，4摧毁&损坏部队，5资源采集数量，6战斗胜利次数，7资源贸易数量，8指挥官抓捕数量，9军团援建次数，10政府占领时间，11集结进攻胜利次数）*/
	int subType;
	/**展示排名数*/
	int showNum;
	
	
	
	/**﻿ID*/
	public int getId(){
		return id;
	}
	/**名称*/
	public int getName(){
		return name;
	}
	/**类型（1玩家2军团）*/
	public int getType(){
		return type;
	}
	/**子类型（1当前战斗力值，2历史占领领土数量，3拥有领土数量，4摧毁&损坏部队，5资源采集数量，6战斗胜利次数，7资源贸易数量，8指挥官抓捕数量，9军团援建次数，10政府占领时间，11集结进攻胜利次数）*/
	public int getSubType(){
		return subType;
	}
	/**展示排名数*/
	public int getShowNum(){
		return showNum;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}