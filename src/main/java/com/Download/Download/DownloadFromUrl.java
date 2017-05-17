package com.Download.Download;

/**
 * Hello world!
 *
 */
public class DownloadFromUrl {
	public static void main(String[] args) {
		String source = "http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/neon/3/eclipse-jee-neon-3-win32-x86_64.zip&mirror_id=1222";
		String Destination = "F:/softwares/JAVA jar";
		String filename="eclipse-jee-neon-3-win32-x86_64.zip";
		
		try {
			new HTTPDownloadUtility().downloadFile(source, Destination, filename);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
