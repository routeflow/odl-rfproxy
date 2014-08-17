package org.opendaylight.controller.rfproxy.RFProtocol;

import org.opendaylight.controller.rfproxy.IPC.IPC.IPCMessage;
import org.opendaylight.controller.rfproxy.IPC.Tools.fields;
import org.opendaylight.controller.rfproxy.IPC.Tools.messagesTypes;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class PortConfig extends IPCMessage implements fields, messagesTypes {
    public PortConfig() {};

    public PortConfig(int vm_id, int vm_port, int operation_id) {
        set_vm_id(vm_id);
        set_vm_port(vm_port);
        set_operation_id(operation_id);
    };

    public int get_vm_id() {
        return this.vm_id;
    };

    public void set_vm_id(int vm_id) {
        this.vm_id = vm_id;
    };

    public int get_vm_port() {
        return this.vm_port;
    };

    public void set_vm_port(int vm_port) {
        this.vm_port = vm_port;
    };

    public int get_operation_id() {
        return this.operation_id;
    };

    public void set_operation_id(int operation_id) {
        this.operation_id = operation_id;
    };

    public int get_type() {
        return messagesTypes.PortConfig;
    };

    public DBObject to_DBObject() {
        DBObject data = new BasicDBObject();

        data.put("vm_id", String.valueOf(get_vm_id()));
        data.put("vm_port", String.valueOf(get_vm_port()));
        data.put("operation_id", String.valueOf(get_operation_id()));

        return data;
    };

    public void from_DBObject(DBObject data) {
        DBObject content = (DBObject) data.get(fields.CONTENT_FIELD);

        this.set_vm_id(Integer.parseInt(content.get("vm_id").toString()));
        this.set_vm_port(Integer.parseInt(content.get("vm_port").toString()));
        this.set_operation_id(Integer.parseInt(content.get("operation_id").toString()));
    };

    public String str() {
        String message;

        message = "PortConfig" + "\n vm_id: " + String.valueOf(get_vm_id()) + "\n vm_port: " + String.valueOf(get_vm_port()) + "\n operation_id: " + String.valueOf(get_operation_id()) + "\n";

        return message;
    };

    private int vm_id;
    private int vm_port;
    private int operation_id;

}