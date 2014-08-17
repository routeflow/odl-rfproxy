package org.opendaylight.controller.rfproxy.RFProtocol;

import org.opendaylight.controller.rfproxy.IPC.IPC.IPCMessage;
import org.opendaylight.controller.rfproxy.IPC.Tools.fields;
import org.opendaylight.controller.rfproxy.IPC.Tools.messagesTypes;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class DatapathDown extends IPCMessage implements fields, messagesTypes {
    public DatapathDown() {};

    public DatapathDown(String ct_id, long dp_id) {
        set_ct_id(ct_id);
        set_dp_id(dp_id);
    };

    public String get_ct_id(){
        return this.ct_id;
    };

    public void set_ct_id(String ct_id){
        this.ct_id = ct_id;
    };

    public long get_dp_id() {
        return this.dp_id;
    };

    public void set_dp_id(long dp_id) {
        this.dp_id = dp_id;
    };

    public int get_type() {
        return messagesTypes.DatapathDown;
    };

    public DBObject to_DBObject() {
        DBObject data = new BasicDBObject();

        data.put("ct_id", get_ct_id());
        data.put("dp_id", String.valueOf(get_dp_id()));

        return data;
    };

    public void from_DBObject(DBObject data) {
        DBObject content = (DBObject) data.get(fields.CONTENT_FIELD);

        this.set_ct_id(content.get("ct_id").toString());
        this.set_dp_id(Long.parseLong(content.get("dp_id").toString()));
    };

    public String str() {
        String message;

        message = "DatapathDown" + "\n dp_id: " + String.valueOf(get_dp_id()) + "\n";

        return message;
    };

    private String ct_id;
    private long dp_id;

}