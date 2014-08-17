package org.opendaylight.controller.rfproxy.RFProtocol;

import org.opendaylight.controller.rfproxy.IPC.IPC.IPCMessage;
import org.opendaylight.controller.rfproxy.IPC.Tools.fields;
import org.opendaylight.controller.rfproxy.IPC.Tools.messagesTypes;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class DataPlaneMap extends IPCMessage implements fields, messagesTypes {
	public DataPlaneMap() {
	};

	public DataPlaneMap(long dp_id, int dp_port, long vs_id, int vs_port) {
		set_dp_id(dp_id);
		set_dp_port(dp_port);
		set_vs_id(vs_id);
		set_vs_port(vs_port);
	};

	public long get_dp_id() {
		return this.dp_id;
	};

	public void set_dp_id(long dp_id) {
		this.dp_id = dp_id;
	};

	public int get_dp_port() {
		return this.dp_port;
	};

	public void set_dp_port(int dp_port) {
		this.dp_port = dp_port;
	};

	public long get_vs_id() {
		return this.vs_id;
	};

	public void set_vs_id(long vs_id) {
		this.vs_id = vs_id;
	};

	public int get_vs_port() {
		return this.vs_port;
	};

	public void set_vs_port(int vs_port) {
		this.vs_port = vs_port;
	};

	public int get_type() {
		return messagesTypes.DataPlaneMap;
	};

	public DBObject to_DBObject() {
		DBObject data = new BasicDBObject();

		data.put("dp_id", String.valueOf(get_dp_id()));
		data.put("dp_port", String.valueOf(get_dp_port()));
		data.put("vs_id", String.valueOf(get_vs_id()));
		data.put("vs_port", String.valueOf(get_vs_port()));

		return data;
	};

	public void from_DBObject(DBObject data) {
		DBObject content = (DBObject) data.get(fields.CONTENT_FIELD);

		this.set_dp_id(Long.parseLong(content.get("dp_id").toString()));
		this.set_dp_port(Integer.parseInt(content.get("dp_port").toString()));
		this.set_vs_id(Long.parseLong(content.get("vs_id").toString()));
		this.set_vs_port(Integer.parseInt(content.get("vs_port").toString()));
	};

	public String str() {
		String message;

		message = "DataPlaneMap" + "\n dp_id: " + String.valueOf(get_dp_id())
				+ "\n dp_port: " + String.valueOf(get_dp_port()) + "\n vs_id: "
				+ String.valueOf(get_vs_id()) + "\n vs_port: "
				+ String.valueOf(get_vs_port()) + "\n";

		return message;
	};

	private long dp_id;
	private int dp_port;
	private long vs_id;
	private int vs_port;

}