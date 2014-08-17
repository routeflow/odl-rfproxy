package org.opendaylight.controller.rfproxy.IPC.Tools;


public class Option {
	private int type;
	private short value;

	public Option(int type, short v){
		this.type = type;
		this.value = v;
	}

	public int get_type(){
		return this.type;
	}

	public void set_type(int t){
		this.type = t;
	}

	public short get_value(){
		return this.value;
	}

	public void set_value(short v){
		this.value = v;
	}
	
	public String toString(){
		return "Option:\n type: " + type + "\n value: " + value;
	}
}