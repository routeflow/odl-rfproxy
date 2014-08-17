package org.opendaylight.controller.rfproxy.IPC.IPC;

/**
 * Class for an IPC message factory. A factory is responsible for creating
 * message objects for a given type.
 */
public abstract class IPCMessageFactory {
	/**
	 * This method should build messages and return them. Implementations can
	 * initialize the message with default application values, for example.
	 * 
	 * @param type
	 *            the type of the message to build
	 * @return a pointer to the built message
	 */
	public abstract IPCMessage buildForType(int type);

}
