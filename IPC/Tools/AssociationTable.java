package org.opendaylight.controller.rfproxy.IPC.Tools;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

import org.opendaylight.controller.rfproxy.IPC.Tools.DP;
import org.opendaylight.controller.rfproxy.IPC.Tools.VS;


public class AssociationTable {
	private Map<DP, VS> dp_to_vs;
	private Map<VS, DP> vs_to_dp;

	public AssociationTable() {
		dp_to_vs = new HashMap<DP, VS>();
		vs_to_dp = new HashMap<VS, DP>(); 
	}

	public void update_dp_port(DP dp, VS vs) {
		if (this.dp_to_vs.containsKey(dp)) {
			VS old_vs = this.dp_to_vs.get(dp);
			this.vs_to_dp.remove(old_vs);
		}
		this.dp_to_vs.put(dp, vs);
		this.vs_to_dp.put(vs, dp);
	}

	public VS dp_port_to_vs_port(DP dp) {
		if (this.dp_to_vs.containsKey(dp)) {
			return this.dp_to_vs.get(dp);
		} else {
			return null;
		}
	}

	public DP vs_port_to_dp_port(VS vs) {
		if (this.vs_to_dp.containsKey(vs) == true) {
			return this.vs_to_dp.get(vs);
		} else {
			return null;
		}
	}

	public void delete_dp(long dp_id) {
		Set<DP> toRemove = new HashSet<DP>();

		for (Iterator<DP> i = this.dp_to_vs.keySet().iterator(); i.hasNext();) {
			DP element = i.next();
			if (element.getDp_id() == dp_id) {
				toRemove.add(element);
			}
		}

		for (Iterator<DP> i = toRemove.iterator(); i.hasNext();) {
			this.vs_to_dp.remove(this.dp_to_vs.remove(i.next()));
		}
	}
}
