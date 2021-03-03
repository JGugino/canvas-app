package org.gugino.canvapp;

import javax.swing.JFrame;

import org.gugino.canvapp.windows.WindowHandler;

public class ProgramStart {

	public static void main(String[] args) {
		WindowHandler.createWindow("test-window", "Test Window", 1280, 720, true, JFrame.EXIT_ON_CLOSE);
		
		/*TODO: 
		 * Implement mouse and keyboard input
		 * Implement UI Items (take from game-manager)
		 * Implement Adding UI to windows
		 * Implement Reading UI from XML file (transfer from game-manager)
		*/
	}
}
