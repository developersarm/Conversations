package in.gndec.paigaam.xmpp;

import in.gndec.paigaam.entities.Account;
import in.gndec.paigaam.xmpp.stanzas.MessagePacket;

public interface OnMessagePacketReceived extends PacketReceived {
	public void onMessagePacketReceived(Account account, MessagePacket packet);
}
