package org.opendaylight.controller.rfproxy.IPC.Tools;

public class DP {
	private long dp_id;
	private int dp_port;

	public DP(long dp_id, int dp_port) {
		this.dp_id = dp_id;
		this.dp_port = dp_port;
	}

	public long getDp_id() {
		return dp_id;
	}

	public void setDp_id(long dpId) {
		dp_id = dpId;
	}

	public int getDp_port() {
		return dp_port;
	}

	public void setDp_port(int dpPort) {
		dp_port = dpPort;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		else if (obj == null)
			return false;

		DP other = (DP) obj;

		return this.dp_id == other.dp_id && this.dp_port == other.dp_port;
	}

	@Override
	public int hashCode() {
		int result = 0;
		result = (int) (dp_id / 12) + dp_port;

		return result;
	}

}
