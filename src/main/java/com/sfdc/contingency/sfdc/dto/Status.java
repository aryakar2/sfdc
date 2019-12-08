/**
 * 
 */
package com.sfdc.contingency.sfdc.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author KARA1
 *
 */
public class Status {
	
	private String code;
	private List<Message> messages = new ArrayList<Message>();
	
	
	public void addMessage(Message message) {

		messages.add(message);

	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public List<Message> getMessages() {
		return messages;
	}


	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

}
