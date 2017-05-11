package com.backend.node.MinTransport.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Nodes {

	int number;
	int total;

	
	Resource getNumber(int number,int total)
	{
		Resource res=new Resource();
	 if(number==1)
	 {
		 ArrayList<String> str=new ArrayList<String>();
		 str.add("A");
		 str.add("B");
		 str.add("C");
		 Map<Character, Float> mp=new HashMap<Character,Float>();
		 mp.put('A', (float) 10);
		 mp.put('B',(float) 3);
		 mp.put('C', (float) 8);
		 
		 
		 res.setNodeId(1);
		 res.setDistance(3);
		 res.setPacketId(str);
		 res.setWeight(mp);
		 res.setNumber(total);
		 return res;
	 }
	 if(number==2)
	 {
		 ArrayList<String> str=new ArrayList<String>();
		 str.add("D");
		 str.add("E");
		 str.add("F");
		 Map<Character,Float> mp=new HashMap<Character,Float>();
		 mp.put('D', (float) 6);
		 mp.put('E',(float) 12);
		 mp.put('F', (float) 2);
		 
		 
		 res.setNodeId(2);
		 res.setDistance(2.5);
		 res.setPacketId(str);
		 res.setWeight(mp);
		 res.setNumber(total);
		 return res;
	 }
	 if(number==3)
	 {
		 ArrayList<String> str=new ArrayList<String>();
		 str.add("G");
		 str.add("H");
		 str.add("I");
		 Map<Character,Float> mp=new HashMap<Character,Float>();
		 mp.put('G', (float) 0.5);
		 mp.put('H',(float) 1);
		 mp.put('I', (float) 2);
		 
		 
		 res.setNodeId(3);
		 res.setDistance(2);
		 res.setPacketId(str);
		 res.setWeight(mp);
		 res.setNumber(total);
		 return res;
	 }
	 return res;
	}
	Resource getNumber(int number)
	{
		Resource res=new Resource();
	 if(number==1)
	 {
		 ArrayList<String> str=new ArrayList<String>();
		 str.add("A");
		 str.add("B");
		 str.add("C");
		 Map<Character, Float> mp=new HashMap<Character,Float>();
		 mp.put('A', (float) 10);
		 mp.put('B',(float) 3);
		 mp.put('C', (float) 8);
		 
		 
		 res.setNodeId(1);
		 res.setDistance(2);
		 res.setPacketId(str);
		 res.setWeight(mp);
		 //res.setNumber(total);
		 return res;
	 }
	 if(number==2)
	 {
		 ArrayList<String> str=new ArrayList<String>();
		 str.add("D");
		 str.add("E");
		 str.add("F");
		 Map<Character,Float> mp=new HashMap<Character,Float>();
		 mp.put('D', (float) 6);
		 mp.put('E',(float) 12);
		 mp.put('F', (float) 2);
		 
		 
		 res.setNodeId(2);
		 res.setDistance(2.5);
		 res.setPacketId(str);
		 res.setWeight(mp);
		 //res.setNumber(total);
		 return res;
	 }
	 if(number==3)
	 {
		 ArrayList<String> str=new ArrayList<String>();
		 str.add("G");
		 str.add("H");
		 str.add("I");
		 Map<Character,Float> mp=new HashMap<Character,Float>();
		 mp.put('G', (float) 0.5);
		 mp.put('H',(float) 1);
		 mp.put('I', (float) 2);
		 
		 
		 res.setNodeId(3);
		 res.setDistance(2);
		 res.setPacketId(str);
		 res.setWeight(mp);
		 res.setNumber(total);
		 return res;
	 }
	 return res;
	}
	
}
