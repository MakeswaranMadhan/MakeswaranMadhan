package com.Config_Reader;

public class File_Reader {
	
	private File_Reader() {
	}
	
	public static File_Reader getInstanceFR() {
		File_Reader fr = new File_Reader();
		return fr;

	}
	
	public Read_Config getInstanceCR() throws Throwable {
		
		Read_Config reader = new Read_Config();
		
		return reader;

	}

}
