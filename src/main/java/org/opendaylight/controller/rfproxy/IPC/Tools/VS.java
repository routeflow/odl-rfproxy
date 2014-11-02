package org.opendaylight.controller.rfproxy.IPC.Tools;

public class VS {
	private long vs_id;
	private int vs_port;

	public VS(long vsId, int vsPort) {
		this.vs_id = vsId;
		this.vs_port = vsPort;
	}

	public long getVs_id() {
		return vs_id;
	}

	public void setVs_id(long vsId) {
		vs_id = vsId;
	}

	public int getVs_port() {
		return vs_port;
	}

	public void setVs_port(int vsPort) {
		vs_port = vsPort;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		VS other = (VS) obj;

		return this.vs_id == other.vs_id && this.vs_port == other.vs_port;
	}

	@Override
	public int hashCode() {
		int result = 0;
		result = (int) (vs_id / 12) + vs_port;
		
		return result;
	}

}
