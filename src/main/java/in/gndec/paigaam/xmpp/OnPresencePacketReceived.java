package in.gndec.paigaam.xmpp;

import in.gndec.paigaam.entities.Account;
import in.gndec.paigaam.xmpp.stanzas.PresencePacket;

public interface OnPresencePacketReceived extends PacketReceived {
	public void onPresencePacketReceived(Account account, PresencePacket packet);
}
