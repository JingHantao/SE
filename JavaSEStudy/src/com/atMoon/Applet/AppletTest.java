package com.atMoon.Applet;

import org.junit.Test;

import java.applet.Applet;
import java.awt.*;

public class AppletTest extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void paint (Graphics g)
	   {
	      g.drawString ("Hello World", 25, 50);
	   }

}
