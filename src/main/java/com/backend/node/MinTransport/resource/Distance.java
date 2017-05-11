package com.backend.node.MinTransport.resource;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Distance {
	int sum;;
	double cost[]=new double[100];
	

	double findcost(int num,char pro,int total)
	{
		double weight = 0;
		Resource res=new Resource();
		Nodes node=new Nodes();
		res=node.getNumber(num, total);
		Map<Character, Float>map=new HashMap<Character,Float>();
		map=res.getWeight();
		Float d=new Float(0);
		//System.out.println("hello" + "/" + "kya");
   // Map<String, String> map = ...
    for (Entry<Character, Float> entry : res.getWeight().entrySet())
{
    	 
    //System.out.println(entry.getKey() + "/" + entry.getValue());
    if(pro==entry.getKey())
		 d=entry.getValue();
}


		weight+=d*total;
		/*if(d>5)
		{
			cost[res.getNodeId()]+= (5*res.getDistance()*10);
			cost[res.getNodeId()]+=(d-5)*res.getDistance()*8;
		}
		else
		{
			cost[res.getNodeId()]+=5*res.getDistance()*10;
		}*/
		return weight;
	}
}
