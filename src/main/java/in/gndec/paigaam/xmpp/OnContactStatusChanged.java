package in.gndec.paigaam.xmpp;

import in.gndec.paigaam.entities.Contact;

public interface OnContactStatusChanged {
	public void onContactStatusChanged(final Contact contact, final boolean online);
}
