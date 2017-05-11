package com.backend.node.MinTransport;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.backend.node.MinTransport.resource.Minimum;
@Path("/node")
public class NodeTransport {
	String name;
	
	@GET
    @Produces(MediaType.TEXT_PLAIN)
	public String getNod()
	{
		return "Apply path params";
	}
	@GET
	@Path("/{nodeId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getNode(@PathParam("nodeId") String nodeId)
	{
		name=nodeId;
		return ("String is"+nodeId);
	}
	@GET
	@Path("/{nodeId:.*}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getNode1(@PathParam("nodeId") String nodeId)
	{
		String[] ne=nodeId.split("/");
		//int f=Integer.parseInt(ne[0]);
		int len=ne.length;
		String[] arr=new String[ne.length];
		for(int i=0;i<len;i++)
		{
			arr[i]=ne[i];
		}
		Minimum min1=new Minimum();
		
		double cost;
		cost=min1.getUrl(arr);
		//System.out.println(cost);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		return ("Minimum cost is"+" "+cost);
		
	}
	
}
