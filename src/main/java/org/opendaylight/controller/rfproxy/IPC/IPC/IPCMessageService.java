package org.opendaylight.controller.rfproxy.IPC.IPC;

/**
 * Class for an IPC messaging service using the Publish/Subscribe model. Every
 * time a service is created, an ID is supplied by its user, which tells the
 * publish/subscribe model where to deliver the messages sent to that ID.
 */
public abstract class IPCMessageService {
	public String id;

	/**
	 * Returns the id of the service user.
	 * 
	 * @return a string with the user ID
	 */
	public abstract String get_id();

	/**
	 * Sets the id of the service user.
	 * 
	 * @param id
	 *            a string with the user ID
	 */
	public abstract void set_id(String id);

	/**
	 * Listen to messages. Empty messages are built using the factory, populated
	 * based on the received data and sent to processing by the processor. The
	 * method can be blocking or not.
	 * 
	 * @param channelId
	 *            the channel to listen to messages on
	 * 
	 * @param factory
	 *            the message factory
	 * 
	 * @param processor
	 *            the message processor
	 * 
	 * @param block
	 *            true if blocking behavior is desired, false otherwise
	 */
	public abstract void listen(String channelId, IPCMessageFactory factory,
			IPCMessageProcessor processor, boolean block);

	/**
	 * Send a message to another user on a channel.
	 * 
	 * @param channelId
	 *            the channel to send the message to
	 * 
	 * @param to
	 *            the user to send the message to
	 * 
	 * @param msg
	 *            the message
	 * 
	 * @return true if the message was sent, false otherwise
	 */
	public abstract boolean send(String channelId, String to, IPCMessage msg);
}
