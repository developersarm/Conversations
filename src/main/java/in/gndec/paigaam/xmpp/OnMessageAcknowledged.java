package in.gndec.paigaam.xmpp;

import in.gndec.paigaam.entities.Account;

public interface OnMessageAcknowledged {
	public void onMessageAcknowledged(Account account, String id);
}
