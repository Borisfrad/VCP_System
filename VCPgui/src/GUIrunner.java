import gui.VcpMainFrame;

import javax.swing.JFrame;


public class GUIrunner {

		
	public static void main( String args[] )
	   {	  		
		  VcpMainFrame vcpFrame = new VcpMainFrame(); // create StudentFrame
		  
		  vcpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  vcpFrame.setSize( 300,230 ); // set frame size
		  vcpFrame.setVisible( true ); // display frame
	  } // end main
	
}