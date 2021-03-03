package org.gugino.canvapp.windows;

import java.util.HashMap;

import org.gugino.canvapp.utils.Debug;

public class WindowHandler {
	public static HashMap<String, Window> activeWindows = new HashMap<>();
	
	public static void createWindow(String _windowID, String _windowTitle, int _windowWidth, int _windowHeight, boolean _windowResizable, int _closeOperation) {
		Window _createdWindow = new Window(_windowID, _windowTitle, _windowWidth, _windowHeight, _windowResizable, _closeOperation);
		addWindow(_windowID, _createdWindow);
	}
	
	public static void addWindow(String _windowID, Window _window) {
		if(!activeWindows.containsKey(_windowID)) {
			activeWindows.put(_windowID, _window);
			Debug.printInfo("Window add with ID ".concat(_windowID));
		}else Debug.printError("Window with ID ".concat(_windowID).concat(" already exists"));
	}

	public static void removeWindow(String _windowID) {
		if(activeWindows.containsKey(_windowID)) {
			activeWindows.remove(_windowID);
			Debug.printInfo("Window removed with ID ".concat(_windowID));
		}else Debug.printError("Window with ID ".concat(_windowID).concat(" doesn't exists"));
	}
	
	public static Window getWindowByID(String _windowID) {
		if(activeWindows.containsKey(_windowID)) return activeWindows.get(_windowID);
		
		Debug.printError("No window found with ID ".concat(_windowID));
		return null;
	}
}
