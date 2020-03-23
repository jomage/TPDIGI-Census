package fr.diginamic.recensement.io;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileRead {
	
	File file = new File("E:/dev/temp/recensement population 2016.csv");
	
	public List<String> readFile() throws IOException {
		return FileUtils.readLines(file, "UTF-8");
	}
	
	/**
	 * Returns some infos about the file.
	 * @return
	 */
	public String getInfos() {
		return "## File infos\npath=\"" + file.getAbsolutePath() + "\""
				+ "\nsize=" + file.length()/1024 + "KB";
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	

}
