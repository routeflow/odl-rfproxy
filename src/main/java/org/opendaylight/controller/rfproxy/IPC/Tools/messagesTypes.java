package org.opendaylight.controller.rfproxy.IPC.Tools;

public interface messagesTypes {
	public static final int PortRegister = 0;
	public static final int PortConfig = 1;
	public static final int DatapathPortRegister = 2;	
	public static final int DatapathDown = 3;
	public static final int VirtualPlaneMap = 4;
	public static final int DataPlaneMap = 5;
	public static final int RouteMod = 6;
}