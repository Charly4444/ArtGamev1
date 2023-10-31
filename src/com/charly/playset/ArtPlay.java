package com.charly.playset;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.charly.extras.DisplayPanelComp;

public class ArtPlay {


	public static void main(String[] args) throws IOException {
		
		int bw = 15;
		int bh = 40;
		int gap = 10;
		int objWidth = 32;	//**
		int objHeight = 32; //**
		
//		now we make the environment...
//		(rows, cols, 2 wolves, 1 rabbits, 16 grasses)
//		We need just One Rabbit as a decent player
		Environment myEnv = new Environment(10, 15, 2, 1, 16);
		
		
		SwingUtilities.invokeLater(() -> {
		    try {
		    	JFrame frameViewer = new JFrame("Artlife Viewer");
		    	
//		    	creating the component
		    	DisplayPanelComp displayPanelComponent = new DisplayPanelComp(myEnv);
		    	Thread t = new Thread(displayPanelComponent);
		    	
		    	
		        // Set the frame size to match the image dimensions
		        int frameWidth = 2*bw + (myEnv.sizeX)*objWidth + ((myEnv.sizeX)-1)*gap;
		        int frameHeight = 2*bh + (myEnv.sizeY)*objHeight + ((myEnv.sizeY)-1)*gap;
		        frameViewer.setSize(frameWidth, frameHeight);
		        
		    	
//		        added the component to the frame
		        frameViewer.add(displayPanelComponent);
		        frameViewer.setVisible(true);
		        frameViewer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    	frameViewer.setLocationRelativeTo(null);
		        
		    	t.start();
		    	
		    	
		    	
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		});
	}

	

}
