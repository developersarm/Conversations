package in.gndec.paigaam.xmpp.jingle;

import in.gndec.paigaam.entities.DownloadableFile;

public interface OnFileTransmissionStatusChanged {
	void onFileTransmitted(DownloadableFile file);

	void onFileTransferAborted();
}
