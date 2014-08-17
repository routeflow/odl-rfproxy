package org.opendaylight.controller.rfproxy.IPC.Tools;

public interface defs {

	public static final String MONGO_ADDRESS = "127.0.0.1:27017";
	public static final String MONGO_DB_NAME = "db";

	public static final String RFCLIENT_RFSERVER_CHANNEL = "rfclient<->rfserver";
	public static final String RFSERVER_RFPROXY_CHANNEL = "rfserver<->rfproxy";

	public static final String RFTABLE_NAME = "rftable";
	public static final String RFCONFIG_NAME = "rfconfig";

	public static final String RFSERVER_ID = "rfserver";
	public static final String RFPROXY_ID = "0";

	public static final String DEFAULT_RFCLIENT_INTERFACE = "eth0";

	public static final long RFVS_DPID = 8243406406160905843L;

	/* RF ethernet protocol */
	public static final long RF_ETH_PROTO = 2570L;

	public static final boolean MATCH_L2 = true;

	/* Drop all incoming packets */
	public static final int DC_DROP_ALL = 0;

	/* Clear flow table */
	public static final int DC_CLEAR_FLOW_TABLE = 1;

	/* Flow to communicate two linked VMs */
	public static final int DC_VM_INFO = 2;

	/* RIPv2 protocol */
	public static final int DC_RIPV2 = 3;

	/* OSPF protocol */
	public static final int DC_OSPF = 4;

	/* BGP protocol */
	public static final int DC_BGP_INBOUND = 5;

	/* BGP protocol */
	public static final int DC_BGP_OUTBOUND = 6;

	/* ARP protocol */
	public static final int DC_ARP = 7;

	/* ICMP protocol */
	public static final int DC_ICMP = 8;

	/* Send all traffic to the controller */
	public static final int DC_ALL = 9;

	public static final int PC_MAP = 0;
	
	public static final int PC_RESET = 1;
	
	/* Default Priority */
	public static final short DEFAULT_PRIORITY = (short) 0x8000;
	
	public static final byte IPPROTO_OSPF = (short) 0x59;
	
	public static final short ETHERTYPE_ARP = (short) 0x0806;
	
	public static final short IPORT_BGP = (short) 0x00B3;

}
