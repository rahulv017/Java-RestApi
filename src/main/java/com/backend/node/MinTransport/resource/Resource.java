package com.backend.node.MinTransport.resource;

import java.util.ArrayList;
import java.util.Map;

public class Resource {

	int nodeId;
	double distance;
	
	ArrayList<String> packetId;
	Map<Character,Float> weight;
	int number;
	public int getNodeId() {
		return nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double d) {
		this.distance = d;
	}
	public ArrayList<String> getPacketId() {
		return packetId;
	}
	public void setPacketId(ArrayList<String> packetId) {
		this.packetId = packetId;
	}
	public Map<Character,Float> getWeight() {
		return weight;
	}
	public void setWeight(Map<Character, Float> weight) {
		this.weight = weight;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	
	
	
}
