package org.mobicents.protocols.ss7.map;

import org.mobicents.protocols.ss7.map.api.MAPProvider;
import org.mobicents.protocols.ss7.map.api.MAPStack;
import org.mobicents.protocols.ss7.sccp.SccpProvider;
import org.mobicents.protocols.ss7.tcap.TCAPStackImpl;
import org.mobicents.protocols.ss7.tcap.api.TCAPProvider;
import org.mobicents.protocols.ss7.tcap.api.TCAPStack;

public class MAPStackImpl implements MAPStack {
	
	private TCAPStack tcapStack = null;
	
	private MAPProvider mapProvider = null;
	
	//TODO Not sure if SccpProvider should be passed as arg?
	public MAPStackImpl(SccpProvider sccpProvider){
		tcapStack = new TCAPStackImpl(sccpProvider);
		TCAPProvider tacpProvider = tcapStack.getProvider();
		mapProvider = new MAPProviderImpl(tacpProvider);
	}

	public MAPProvider getMAPProvider() {
		// TODO Auto-generated method stub
		return null;
	}

	

}