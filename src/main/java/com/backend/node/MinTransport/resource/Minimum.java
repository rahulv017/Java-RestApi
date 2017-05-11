package com.backend.node.MinTransport.resource;

import java.util.ArrayList;
import java.util.Iterator;

public class Minimum {

	public Minimum() {
		// TODO Auto-generated constructor stub
	}

	double sum=0;
	 public double getUrl(String[]ne)
	{
		double cost[]=new double[100];
		double weight[]=new double[100];
		Distance dis=new Distance();
		
	   /* while(it.hasNext())
	    {
	    	if(it.equals("C"))
	    	{
	    		//int d=Integer.parseInt((String) it.next());
	    		String str=(String)it.next();
	    		int d=(int)str.charAt(0);
	    		System.out.println(d);
	    		char c=str.charAt(1);
	    		int e=(int)str.charAt(2);
	    		weight[d]+=dis.findcost(d, c, e);
	    		
	    	}
	    	else
	    	{
	    		//int d=Integer.parseInt((String) it.next());
	    		String str=(String)it.next();
	    		int d=(int)str.charAt(0);
	    		System.out.println(d);
	    		char c=str.charAt(1);
	    		int e=(int)str.charAt(2);
	    		weight[d]+=dis.findcost(d, c, e);
	    	}
	    	
	    	
	    		
	    		
	    	}*/
		for(int i=0;i<ne.length;i++)
		{
			if(ne[i].equals("C"))
			{
				int d=(int)(ne[i+1].charAt(0)-48);
				char c=ne[i+1].charAt(1);
				int e=(int)(ne[i+1].charAt(2)-48);
				System.out.println(d+" "+e+" ");
				weight[d]+=dis.findcost(d, c, e);
				
				
			}
		}
	    Resource res=new Resource();
	    Nodes  node=new Nodes();
	    for(int i=1;i<4;i++)
	    {
	    	System.out.println(weight[i]);
	    	 res=node.getNumber(i);
	    	 
	    	 
	    	if(weight[i]>5)
			{
				cost[res.getNodeId()]+= (5*res.getDistance()*10);
				cost[res.getNodeId()]+=(weight[i]-5)*res.getDistance()*8;
			}
			else if(weight[i]!=0)
			{
				cost[res.getNodeId()]+=5*res.getDistance()*10;
			}
		    
	    	sum=sum+cost[res.getNodeId()];
	    }
	    
	    return sum;
	        
	    }
	    
		
	}

