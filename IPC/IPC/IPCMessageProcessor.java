package org.opendaylight.controller.rfproxy.IPC.IPC;

/**
 * Class for an IPC message processor. A processor deals with received messages
 * and implement behavior based on the needs of the application.
 */
public abstract class IPCMessageProcessor {
	/**
	 * This method should process messages based on the desired behavior.
	 * 
	 * @param from
	 *            the message sender
	 * @param to
	 *            the message receiver
	 * @param channel
	 *            the channel where the message was sent
	 * @param msg
	 *            the message to process
	 * @return true if the message was successfully processed, false otherwise
	 */
	public abstract boolean process(String from, String to, String channel,
			IPCMessage msg);
}
