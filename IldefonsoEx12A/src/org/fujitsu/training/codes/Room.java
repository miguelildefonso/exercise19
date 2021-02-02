package org.fujitsu.training.codes;

public class Room {
	
	private Double rate;
	private Dimension dimension;
	private Byte numOfPerson;
	private static int counter;
	
	public Room() {
	}
	
	public Room(Double rate, Dimension dimension, Byte numOfPerson) {
		this.rate = rate;
		this.dimension = dimension;
		this.numOfPerson = numOfPerson;
	}
	
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Dimension getDimension() {
		return dimension;
	}
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	public Byte getNumOfPerson() {
		return numOfPerson;
	}
	public void setNumOfPerson(Byte numOfPerson) {
		this.numOfPerson = numOfPerson;
	}
	
	public static Room getInstance() throws NullPointerException, Exception{
		if(counter < 3){
			counter++;
			return new Room();
		}else {
			throw new NullPointerException();
			}
		}

}
