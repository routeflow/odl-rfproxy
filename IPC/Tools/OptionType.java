package org.opendaylight.controller.rfproxy.IPC.Tools;


public interface OptionType {
	public final int RFOT_PRIORITY = 1;     // Route priority
	public final int RFOT_IDLE_TIMEOUT = 2; // Drop route after specified idle time
	public final int RFOT_HARD_TIMEOUT = 3; // Drop route after specified time has passed
	public final int RFOT_CT_ID = 255;
}