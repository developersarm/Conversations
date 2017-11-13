package in.gndec.paigaam.xmpp;

import in.gndec.paigaam.entities.Account;
import in.gndec.paigaam.xmpp.stanzas.IqPacket;

public interface OnIqPacketReceived extends PacketReceived {
	void onIqPacketReceived(Account account, IqPacket packet);
}
