package in.gndec.paigaam.xmpp.jingle;

import in.gndec.paigaam.entities.Account;
import in.gndec.paigaam.xmpp.PacketReceived;
import in.gndec.paigaam.xmpp.jingle.stanzas.JinglePacket;

public interface OnJinglePacketReceived extends PacketReceived {
	void onJinglePacketReceived(Account account, JinglePacket packet);
}
