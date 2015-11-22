package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity (name = "STORAGE")
public class ModelStorageTable {
	@Id @GeneratedValue
	@Column (name = "ACTION_ID")
	private int actionID;
	@Column (name = "ACTION")
	private String action;
	@Column (name = "PC_NAME_1")
	private String pcName1;
	@Column (name = "PC_NAME_2")
	private String pcName2;
	@Column (name = "ROOM_FROM")
	private String roomFrom;
	@Column (name = "ROOM_TO")
	private String roomTo;
	
	public int getActionID() {
		return actionID;
	}
	public void setActionID(int actionID) {
		this.actionID = actionID;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getPcName1() {
		return pcName1;
	}
	public void setPcName1(String pcName1) {
		this.pcName1 = pcName1;
	}
	public String getPcName2() {
		return pcName2;
	}
	public void setPcName2(String pcName2) {
		this.pcName2 = pcName2;
	}
	public String getRoomFrom() {
		return roomFrom;
	}
	public void setRoomFrom(String roomFrom) {
		this.roomFrom = roomFrom;
	}
	public String getRoomTo() {
		return roomTo;
	}
	public void setRoomTo(String roomTo) {
		this.roomTo = roomTo;
	}
	
}
