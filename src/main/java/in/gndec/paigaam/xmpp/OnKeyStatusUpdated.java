package in.gndec.paigaam.xmpp;

import in.gndec.paigaam.crypto.axolotl.AxolotlService;

public interface OnKeyStatusUpdated {
	public void onKeyStatusUpdated(AxolotlService.FetchStatus report);
}
