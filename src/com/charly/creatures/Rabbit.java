package com.charly.creatures;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;

import com.charly.playset.Environment;

public class Rabbit extends Animal {

	private int rabbitYPos;
	private int rabbitXPos;
	private BufferedImage image;
	private String filePath = "src\\com\\charly\\assets\\Rabbit.png";
	private int rabbitPoints = 0;
	
	
	
	public Rabbit(Integer rabbitYPos, Integer rabbitXPos) throws IOException {
		super("R", rabbitYPos, rabbitXPos, 15);	//added name and liveTime
		this.rabbitYPos = rabbitYPos;
		this.rabbitXPos = rabbitXPos;
		
		
		loadImage(filePath);
		
	}
	
//	method to load the image first
	private void loadImage(String filePath) throws IOException {
        File imageFile = new File(filePath);
        image = ImageIO.read(imageFile);
    }
	
	
	
//	take decisions
	

//	=================================================================
//	move RABBIT up()
	public Environment moveUp(Environment environment) throws IOException {
//		moveUp logic
		int xBounds = environment.sizeX;
		int yBounds = environment.sizeY;
		Object[][] newenvMap = environment.getEnvMap();
		if((rabbitYPos-1)>=0 && (rabbitYPos-1)<yBounds && (newenvMap[rabbitYPos-1][rabbitXPos]==null || newenvMap[rabbitYPos-1][rabbitXPos].getClass().equals(Grass.class)) ){
			int oldRabbitYPos = rabbitYPos;
			this.setRabbitYPos(oldRabbitYPos-1);		//change to new coordinates
			
			environment.setCurrentYPos(rabbitYPos);
//			environment.setCurrentXPos(rabbitXPos);
			
			if (newenvMap[rabbitYPos][rabbitXPos]==null) {
				newenvMap[rabbitYPos][rabbitXPos] = this;		//move rabbit to there
				newenvMap[oldRabbitYPos][rabbitXPos] = null;
				environment.setEnvMap(newenvMap);
			}else if (newenvMap[rabbitYPos][rabbitXPos].getClass().equals(Grass.class)) {
//				you can increment lifeCount or something ...
				this.setRabbitPoints(rabbitPoints+1);
				
				newenvMap[rabbitYPos][rabbitXPos] = this;		//move rabbit to there
				newenvMap[oldRabbitYPos][rabbitXPos] = null;
				environment.setEnvMap(newenvMap);
			}
			return environment;
		}
		
//		...
//		..
//		.
		return environment;
			
	}
		
		
//	STOP Move Up
	public Environment stopMoveUp(Environment environment) throws IOException {
//		STOP MoveUp logic
		
		Object[][] newenvMap = environment.getEnvMap();
		newenvMap[rabbitYPos][rabbitXPos] = this;		//move rabbit to there
		return environment;
		
	}
//	=============================================================
//	=================================================================
//	move RABBIT down()
	public Environment moveDown(Environment environment) throws IOException {
//		moveDown logic
		int xBounds = environment.sizeX;
		int yBounds = environment.sizeY;
		Object[][] newenvMap = environment.getEnvMap();
		if((rabbitYPos+1)>=0 && (rabbitYPos+1)<yBounds && (newenvMap[rabbitYPos+1][rabbitXPos]==null || newenvMap[rabbitYPos+1][rabbitXPos].getClass().equals(Grass.class)) ){
			int oldRabbitYPos = rabbitYPos;
			this.setRabbitYPos(oldRabbitYPos+1);		//change to new coordinates
			
			environment.setCurrentYPos(rabbitYPos);
//			environment.setCurrentXPos(rabbitXPos);
			
			if (newenvMap[rabbitYPos][rabbitXPos]==null) {
				newenvMap[rabbitYPos][rabbitXPos] = this;		//move rabbit to there
				newenvMap[oldRabbitYPos][rabbitXPos] = null;
				environment.setEnvMap(newenvMap);
			}else if (newenvMap[rabbitYPos][rabbitXPos].getClass().equals(Grass.class)) {
//				you can increment lifeCount or something ...
				this.setRabbitPoints(rabbitPoints+1);
				
				newenvMap[rabbitYPos][rabbitXPos] = this;		//move rabbit to there
				newenvMap[oldRabbitYPos][rabbitXPos] = null;
				environment.setEnvMap(newenvMap);
			}
			return environment;
		}
		
//		...
//		..
//		.
		return environment;
			
	}
		
		
//	STOP Move Down
	public Environment stopMoveDown(Environment environment) throws IOException {
//		STOP MoveDown logic
		
		Object[][] newenvMap = environment.getEnvMap();
		newenvMap[rabbitYPos][rabbitXPos] = this;		//move rabbit to there
		return environment;
		
	}
//	=============================================================
//	=================================================================
//	move RABBIT right()
	public Environment moveRight(Environment environment) throws IOException {
//		moveRight logic
		int xBounds = environment.sizeX;
		int yBounds = environment.sizeY;
		Object[][] newenvMap = environment.getEnvMap();
		if((rabbitXPos+1)>=0 && (rabbitXPos+1)<xBounds && (newenvMap[rabbitYPos][rabbitXPos+1]==null || newenvMap[rabbitYPos][rabbitXPos+1].getClass().equals(Grass.class)) ){
			int oldRabbitXPos = rabbitXPos;
			this.setRabbitXPos(oldRabbitXPos+1);		//change to new coordinates
			
//			environment.setCurrentYPos(rabbitYPos);
			environment.setCurrentXPos(rabbitXPos);
			
			if (newenvMap[rabbitYPos][rabbitXPos]==null) {
				newenvMap[rabbitYPos][rabbitXPos] = this;		//move rabbit to there
				newenvMap[rabbitYPos][oldRabbitXPos] = null;
				environment.setEnvMap(newenvMap);
			}else if (newenvMap[rabbitYPos][rabbitXPos].getClass().equals(Grass.class)) {
//				you can increment lifeCount or something ...
				this.setRabbitPoints(rabbitPoints+1);
				
				newenvMap[rabbitYPos][rabbitXPos] = this;		//move rabbit to there
				newenvMap[rabbitYPos][oldRabbitXPos] = null;
				environment.setEnvMap(newenvMap);
			}
			return environment;
		}
		
//		...
//		..
//		.
		return environment;
			
	}
		
		
//	STOP Move Right
	public Environment stopMoveRight(Environment environment) throws IOException {
//		STOP MoveRight logic
		
		Object[][] newenvMap = environment.getEnvMap();
		newenvMap[rabbitYPos][rabbitXPos] = this;		//move rabbit to there
		return environment;
		
	}
//	=============================================================
//	=================================================================
//	move RABBIT left()
	public Environment moveLeft(Environment environment) throws IOException {
//		to do
//		moveLeft logic
		int xBounds = environment.sizeX;
		int yBounds = environment.sizeY;
		Object[][] newenvMap = environment.getEnvMap();
		if((rabbitXPos-1)>=0 && (rabbitXPos-1)<xBounds && (newenvMap[rabbitYPos][rabbitXPos-1]==null || newenvMap[rabbitYPos][rabbitXPos-1].getClass().equals(Grass.class)) ){
			int oldRabbitXPos = rabbitXPos;
			this.setRabbitXPos(oldRabbitXPos-1);		//change to new coordinates
			
//			environment.setCurrentYPos(rabbitYPos);
			environment.setCurrentXPos(rabbitXPos);
			
			if (newenvMap[rabbitYPos][rabbitXPos]==null) {
				newenvMap[rabbitYPos][rabbitXPos] = this;		//move rabbit to there
				newenvMap[rabbitYPos][oldRabbitXPos] = null;
				environment.setEnvMap(newenvMap);
			}else if (newenvMap[rabbitYPos][rabbitXPos].getClass().equals(Grass.class)) {
//				you can increment lifeCount or something ...
				this.setRabbitPoints(rabbitPoints+1);
				
				newenvMap[rabbitYPos][rabbitXPos] = this;		//move rabbit to there
				newenvMap[rabbitYPos][oldRabbitXPos] = null;
				environment.setEnvMap(newenvMap);
			}
			return environment;
		}
		
//		...
//		..
//		.
		return environment;
			
	}
		
		
//	STOP Move Left
	public Environment stopMoveLeft(Environment environment) throws IOException {
//		STOP MoveLeft logic
		
		Object[][] newenvMap = environment.getEnvMap();
		newenvMap[rabbitYPos][rabbitXPos] = this;		//move rabbit to there
		return environment;
		
	}
//	=============================================================
	
	
	

	
//	for image
	public BufferedImage getImage() {
		return image;
	}
	public void setImage(BufferedImage image) {
		this.image = image;
	}

	
	
	
//	for RabbitPOs
	public int getRabbitYPos() {
		return rabbitYPos;
	}
	public void setRabbitYPos(int rabbitYPos) {
		this.rabbitYPos = rabbitYPos;
	}
	public int getRabbitXPos() {
		return rabbitXPos;
	}
	public void setRabbitXPos(int rabbitXPos) {
		this.rabbitXPos = rabbitXPos;
	}

//	gamePoints
	public int getRabbitPoints() {
		return rabbitPoints;
	}
	public void setRabbitPoints(int rabbitPoints) {
		this.rabbitPoints = rabbitPoints;
	}
	
	
}
