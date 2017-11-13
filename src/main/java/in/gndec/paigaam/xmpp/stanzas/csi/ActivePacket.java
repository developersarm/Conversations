package in.gndec.paigaam.xmpp.stanzas.csi;

import in.gndec.paigaam.xmpp.stanzas.AbstractStanza;

public class ActivePacket extends AbstractStanza {
	public ActivePacket() {
		super("active");
		setAttribute("xmlns", "urn:xmpp:csi:0");
	}
}
