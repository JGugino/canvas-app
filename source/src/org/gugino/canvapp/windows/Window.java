package org.gugino.canvapp.windows;

import java.awt.Dimension;
import javax.swing.JFrame;

public class Window extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public String windowID, windowTitle;
	public int windowWidth, windowHeight;
	public boolean windowResizable = false;
	public int windowCloseOperation;
	
	public WindowSurface windowSurface;
	
	public boolean windowActive = false;
	
	public Window(String _windowID, String _windowTitle, int _windowWidth, int _windowHeight, boolean _windowResizable, int _closeOperation) {
		this.windowID = _windowID;
		this.windowTitle = _windowTitle;
		this.windowWidth = _windowWidth;
		this.windowHeight = _windowHeight;
		this.windowResizable = _windowResizable;
		this.windowCloseOperation = _closeOperation;
		
		windowInitialization();
	}

	private void windowInitialization() {		
		this.setTitle(windowTitle);
		
		Dimension _windowDims = new Dimension(windowWidth, windowHeight);
		this.setPreferredSize(_windowDims);
		this.setMinimumSize(_windowDims);
		this.setDefaultCloseOperation(windowCloseOperation);
		this.setLocationRelativeTo(this.rootPane);
		this.setResizable(windowResizable);
		
		windowSurface = new WindowSurface();
		windowSurface.setMinimumSize(_windowDims);
		windowSurface.setPreferredSize(_windowDims);

		this.add(windowSurface);
		this.pack();
		this.setVisible(true);
		
		windowActive = true;
	}
}
