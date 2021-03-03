package org.gugino.canvapp.utils;

public class Debug {
	
	public static void printMessage(String _message) {
		System.out.println("[MSG] ".concat(_message));
	}
	
	public static void printInfo(String _infoMessage) {
		System.out.println("[INFO] ".concat(_infoMessage));
	}
	
	public static void printError(String _errorMessage) {
		System.err.println("[ERROR] ".concat(_errorMessage));
	}
	
}
