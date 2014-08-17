package org.opendaylight.controller.rfproxy.RFProtocol;

import org.opendaylight.controller.rfproxy.IPC.IPC.IPCMessage;
import org.opendaylight.controller.rfproxy.IPC.Tools.fields;
import org.opendaylight.controller.rfproxy.IPC.Tools.messagesTypes;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class PortRegister extends IPCMessage implements fields, messagesTypes {
    public PortRegister() {};

    public PortRegister(long vm_id, int vm_port, String hwaddress) {
        set_vm_id(vm_id);
        set_vm_port(vm_port);
        set_hwaddress(hwaddress);
    };

    public String get_hwaddress(){
        return this.hwaddress;
    }

    public void set_hwaddress(String hwaddress){
        this.hwaddress = hwaddress;
    }

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

    public int get_type() {
        return messagesTypes.PortRegister;
    };

    public DBObject to_DBObject() {
        DBObject data = new BasicDBObject();

        data.put("vm_id", String.valueOf(get_vm_id()));
        data.put("vm_port", String.valueOf(get_vm_port()));
        data.put("hwaddress", get_hwaddress());

        return data;
    };

    public void from_DBObject(DBObject data) {
        DBObject content = (DBObject) data.get(fields.CONTENT_FIELD);

        this.set_vm_id(Long.valueOf(content.get("vm_id").toString()));
        this.set_vm_port(Integer.parseInt(content.get("vm_port").toString()));
        this.set_hwaddress(content.get("hwaddress").toString());
    };

    public String str() {
        String message;

        message = "PortRegister" + "\n vm_id: " + String.valueOf(get_vm_id()) + "\n vm_port: " + String.valueOf(get_vm_port()) + "\nhwaddress: " + get_hwaddress();

        return message;
    };

    private long vm_id;
    private int vm_port;
    private String hwaddress;

}