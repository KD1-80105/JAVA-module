package com.sunbeam;

import java.util.Scanner;

public class PartyVotes {
	static Scanner sc=new Scanner(System.in);
	private String party;
	private int Votes;

	public PartyVotes(String party, int votes) {

		this.party = party;
		Votes = votes;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public int getVotes() {
		return Votes;
	}

	public void setVotes(int votes) {
		Votes = votes;
	}

	@Override
	public String toString() {
		return "PartyVotes [party=" + party + ", Votes=" + Votes + "]";
	}

	
	
	
}
