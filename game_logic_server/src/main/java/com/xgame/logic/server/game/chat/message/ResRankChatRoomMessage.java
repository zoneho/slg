package com.xgame.logic.server.game.chat.message;
import com.xgame.logic.server.game.chat.bean.ChatRoomBean;
import java.util.ArrayList;
import java.util.List;
import com.xgame.msglib.ResMessage;

import com.xgame.msglib.able.Communicationable;
import com.xgame.msglib.annotation.MsgField;
/** 
 * @author ProtocolEditor
 * Chat-ResRankChatRoom - 返回带排行功能的房间
 */
public class ResRankChatRoomMessage extends ResMessage {
	
	//模块号+消息号
	public static final int ID=1002108;
	//模块号
	public static final int FUNCTION_ID=1002;
	//消息号
	public static final int MSG_ID=108;
	
	/**房间列表*/
	@MsgField(Id = 1)
	public List<ChatRoomBean> chatRoomList = new ArrayList<ChatRoomBean>();
		
	@Override
	public int getId() {
		return ID;
	}

	@Override
	public String getQueue() {
		return "s2s";
	}
	
	@Override
	public String getServer() {
		return null;
	}
	
	@Override
	public boolean isSync() {
		return false;
	}

	@Override
	public CommandEnum getCommandEnum() {
		return Communicationable.CommandEnum.PLAYERMSG;
	}
	
	@Override
	public HandlerEnum getHandlerEnum() {
		return Communicationable.HandlerEnum.SC;
	}
	
	@Override
	public String toString(){
		StringBuffer buf = new StringBuffer("[");
		buf.append("chatRoomList:{");
		for (int i = 0; i < chatRoomList.size(); i++) {
			buf.append(chatRoomList.get(i).toString() +",");
		}
		if(buf.charAt(buf.length()-1)==',') buf.deleteCharAt(buf.length()-1);
		buf.append("},");
		if(buf.charAt(buf.length()-1)==',') buf.deleteCharAt(buf.length()-1);
		buf.append("]");
		return buf.toString();
	}
}