package com.promeritage.interview.model;

import com.promeritage.interview.abstrac.Mammalia;

public class Human extends Mammalia{
	@Override
	public boolean viviparity() {
		return false;
	}
}
