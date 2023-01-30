package org.ssglobal.training.codes.itemA;

import java.util.PriorityQueue;
import java.util.Queue;

public class LoanMgt {
	private Queue<String> members = new PriorityQueue<>();
	
	public void addMember(String member) {
		members.offer(member);
	}
	
	public void getPriority() {
		if (!members.isEmpty()) {
			System.out.println(members.peek());
			members.poll();
		}
	}
}
