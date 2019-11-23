package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestC {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(23);
	al.add(45);
	al.add(10);
	al.add(78);
	
	
	List<Integer> l= al.stream().map(i -> i*3).collect(Collectors.toList());
	
	for(Integer i : l) {
		System.out.println(i);
	}
}
}
