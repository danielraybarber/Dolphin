package com.tts.Dolphin.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dolphin {
	@Id
	public String dolphinName;
	public String ownersName;
	
	public String getOwnersName() {
		return ownersName;
	}
	public void setOwnersName(String ownersName) {
		this.ownersName = ownersName;
	}
	public String getDolphinName() {
		return dolphinName;
	}
	public void setDolphinName(String dolphinName) {
		this.dolphinName = dolphinName;
	}
}
