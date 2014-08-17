package org.opendaylight.controller.rfproxy.RFProtocol;

import org.opendaylight.controller.rfproxy.IPC.IPC.IPCMessage;
import org.opendaylight.controller.rfproxy.IPC.Tools.fields;
import org.opendaylight.controller.rfproxy.IPC.Tools.messagesTypes;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class VirtualPlaneMap extends IPCMessage implements fields, messagesTypes {
    public VirtualPlaneMap() {};

    public VirtualPlaneMap(long vm_id, int vm_port, long vs_id, int vs_port) {
        set_vm_id(vm_id);
        set_vm_port(vm_port);
        set_vs_id(vs_id);
        set_vs_port(vs_port);
    };

    public long get_vm_id() {
        return this.vm_id;
    };

    public void set_vm_id(long vm_id) {
        this.vm_id = vm_id;
    };

    public int get_vm_port() {
        return this.vm_port;
    };

    public void set_vm_port(int vm_port) {
        this.vm_port = vm_port;
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
        return messagesTypes.VirtualPlaneMap;
    };

    public DBObject to_DBObject() {
        DBObject data = new BasicDBObject();

        data.put("vm_id", String.valueOf(get_vm_id()));
        data.put("vm_port", String.valueOf(get_vm_port()));
        data.put("vs_id", String.valueOf(get_vs_id()));
        data.put("vs_port", String.valueOf(get_vs_port()));

        return data;
    };

    public void from_DBObject(DBObject data) {
        DBObject content = (DBObject) data.get(fields.CONTENT_FIELD);

        this.set_vm_id(Long.parseLong(content.get("vm_id").toString()));
        this.set_vm_port(Integer.parseInt(content.get("vm_port").toString()));
        this.set_vs_id(Long.parseLong(content.get("vs_id").toString()));
        this.set_vs_port(Integer.parseInt(content.get("vs_port").toString()));
    };

    public String str() {
        String message;

        message = "VirtualPlaneMap" + "\n vm_id: " + String.valueOf(get_vm_id()) + "\n vm_port: " + String.valueOf(get_vm_port()) + "\n vs_id: " + String.valueOf(get_vs_id()) + "\n vs_port: " + String.valueOf(get_vs_port()) + "\n";

        return message;
    };

    private long vm_id;
    private int vm_port;
    private long vs_id;
    private int vs_port;

}