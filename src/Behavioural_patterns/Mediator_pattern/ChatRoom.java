package Behavioural_patterns.Mediator_pattern;

import java.util.Date;

public class ChatRoom {

	public static void showMessgae(User user,String message) {
		System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
	}
}
