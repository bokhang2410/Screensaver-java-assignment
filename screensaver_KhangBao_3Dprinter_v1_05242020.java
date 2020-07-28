
/* Screensaver: cantilever 3D printer
 * Khang Bao 
 * 3D "benchy" boat
 * Screensaver
 * java2 2020
 * 05242020
 * 
 * 3D printer printing a 3D "benchy" boat 
 * Script: 
 * move to print position 
 * print layers 
 * homing 
 * disable 3D printer 
 * 
 * Design consideration: 
 * + Draw from scratch (without using images)
 * + Resemble the cantilever 3D printer design 
 * + Moving hotend carriage smoothly and gradually 
 * + Vectorized look and feel. 
 * 
 * Software usage:
 * + Use fusion 360 to design in 2D sketch and acquire relative dimension of 3D printer components
 *  
 * */

import java.awt.Color;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;


public class printer extends GraphicsProgram
{
	/**	Draw shapes using graphical classes */
	public void run()
	{	
		/*formula for GRect(x,y,L_x, L_y) GRect((600-L_x)/2 - ox,(600-L_x),L_x,L_y)*/
		//Resize Applet
		setSize(600, 600);

		//z axis extrusion
		GRect ZExtrusion = new GRect(100, 110, 40, 450 );
		add(ZExtrusion);
		ZExtrusion.setFilled(true);
		ZExtrusion.setFillColor(Color.GRAY);
		
		//base extrusion
		GRect BaseExtrusion = new GRect(100, 560, 250, 40);
		add(BaseExtrusion);
		BaseExtrusion.setFilled(true);
		BaseExtrusion.setFillColor(Color.GRAY);
		
		//z guide rail
		GRect ZRail = new GRect(65, 120, 10, 420);
		add(ZRail);
		ZRail.setFilled(true);
		ZRail.setFillColor(Color.ORANGE);
		
		//z screw
		GRect ZScrew = new GRect(115, 110, 10, 450);
		add(ZScrew);
		ZScrew.setFilled(true);
		ZScrew.setFillColor(Color.ORANGE);
		
		//y extrusion
		GRect YExtrusion = new GRect(350, 560, 80,40);
		add(YExtrusion);
		YExtrusion.setFilled(true);
		YExtrusion.setFillColor(Color.GRAY);
		
		//y rail
		GRect YRail = new GRect(370, 560, 40,20);
		add(YRail);
		YRail.setFilled(true);
		YRail.setFillColor(Color.ORANGE);
	
		//z motor
		GRect ZMotor = new GRect(40, 540, 60,60);
		add(ZMotor);
		ZMotor.setFilled(true);
		ZMotor.setFillColor(Color.DARK_GRAY);
		
		//z motor brace1
		GRect ZMotorBrace1 = new GRect(40, 540, 60, 5);
		add(ZMotorBrace1);
		ZMotorBrace1.setFilled(true);
		ZMotorBrace1.setFillColor(Color.BLACK);
	
		//z motor brace2
		GRect ZMotorBrace2 = new GRect(40, 595, 60, 5);
		add(ZMotorBrace2);
		ZMotorBrace2.setFilled(true);
		ZMotorBrace2.setFillColor(Color.BLACK);
		
		//z motor brace2
		GRect ZCoupler = new GRect(60, 500, 20, 30);
		add(ZCoupler);
		ZCoupler.setFilled(true);
		ZCoupler.setFillColor(Color.DARK_GRAY);
		
		//CornerBracket
		GPolygon CornerBracket = new GPolygon();
		add(CornerBracket);
		CornerBracket.addVertex(140, 530);
		CornerBracket.addVertex(150, 530);
		CornerBracket.addVertex(170, 550);
		CornerBracket.addVertex(170, 560);
		CornerBracket.addVertex(140, 560);
		CornerBracket.setFilled(true);
		CornerBracket.setColor(Color.DARK_GRAY);
		
		//z gantry
		GRect ZGantry = new GRect(30, 225, 150, 80);
		add(ZGantry);
		ZGantry.setFilled(true);
		ZGantry.setFillColor(Color.RED);
		
		//x extrusion
		GRect XExtrusion = new GRect(10, 250, 560, 20);
		add(XExtrusion);
		XExtrusion.setFilled(true);
		XExtrusion.setFillColor(Color.GRAY);
		
		//y gantry
		GRect YGantry = new GRect(300, 530, 150, 25);
		add(YGantry);
		YGantry.setFilled(true);
		YGantry.setFillColor(Color.DARK_GRAY);
		
		//y rod
		GOval YRod1 = new GOval(345, 555, 10, 10);
		add(YRod1);
		YRod1.setFilled(true);
		YRod1.setFillColor(Color.DARK_GRAY);
		
		//y rod2
		GOval YRod2 = new GOval(425, 555, 10, 10);
		add(YRod2);
		YRod2.setFilled(true);
		YRod2.setFillColor(Color.DARK_GRAY);
		
		//HeatedBed
		GRect HeatedBed = new GRect(200, 520, 350, 10);
		add(HeatedBed);
		HeatedBed.setFilled(true);
		HeatedBed.setFillColor(Color.GRAY);
		
		//GlassBed
		GRect GlassBed = new GRect(200, 520, 350, 3);
		add(GlassBed);
		GlassBed.setFilled(true);
		GlassBed.setFillColor(Color.cyan);
		
		//Hotend
		GRect Hotend = new GRect(300, 220, 30,70);
		add(Hotend);
		Hotend.setFilled(true);
		Hotend.setFillColor(Color.GREEN);
		
		//Nozzle
		GRect Nozzle = new GRect(310, 290, 10, 20);
		add(Nozzle);
		Nozzle.setFilled(true);
		Nozzle.setFillColor(Color.ORANGE);
		
		//z mount 
		GRect ZMount = new GRect(65, 110, 90, 20);
		add(ZMount);
		ZMount.setFilled(true);
		ZMount.setFillColor(Color.DARK_GRAY);
		
		
		//3D benchy boat
		//layer 1
		GRect Layer1 = new GRect(340, 510, 120, 10);
		//add(Layer1);
		Layer1.setFilled(true);
		Layer1.setFillColor(Color.YELLOW);

		//layer 2
		GRect Layer2 = new GRect(325, 500, 150, 10);
		//add(Layer2);
		Layer2.setFilled(true);
		Layer2.setFillColor(Color.YELLOW);
		
		//layer 3
		GRect Layer3 = new GRect(320, 490, 170, 10);
		//add(Layer3);
		Layer3.setFilled(true);
		Layer3.setFillColor(Color.YELLOW);
		
		//layer 4
		GRect Layer4 = new GRect(310, 480, 200, 10);
		//add(Layer4);
		Layer4.setFilled(true);
		Layer4.setFillColor(Color.YELLOW);
		
		//layer 5
		GRect Layer5 = new GRect(310, 470, 200, 10);
		//add(Layer5);
		Layer5.setFilled(true);
		Layer5.setFillColor(Color.YELLOW);
		
		//layer 6 box
		GRect Layer6 = new GRect(390, 400, 50, 70);
		//add(Layer6);
		Layer6.setFilled(true);
		Layer6.setFillColor(Color.YELLOW);
		
		//layer 7
		GRect Layer7 = new GRect(370, 390, 80, 10);
		//add(Layer7);
		Layer7.setFilled(true);
		Layer7.setFillColor(Color.YELLOW);
		
		//layer 8 
		GRect Layer8 = new GRect(415, 360, 15, 30);
		//add(Layer8);
		Layer8.setFilled(true);
		Layer8.setFillColor(Color.YELLOW);
		
		//layer 9 
		GRect Layer9 = new GRect(405, 410, 20, 30);
		//add(Layer9);
		Layer9.setFilled(true);
		Layer9.setFillColor(Color.WHITE);
		
		//motion 
		/*move as a whole: XExtrusion, ZGantry, Hotend, Nozzle*/
		//variable layer#: l# Ex: l1, l2, l3
		int i = 0;
		int j = 0;
		int k = 0;
		int l1 = 0;
		int l2 = 0;
		int l3 = 0;
		int l4 = 0;
		int l5 = 0;
		int l6 = 0;
		int l7 = 0;
		int l8 = 0;
		int h1 = 10;
		int h2 = 70;
		int h3 = 40;
		int homing = 50;
		
		while(true) {	
			while(i < 200) {
			XExtrusion.move(0,1);
			ZGantry.move(0,1);
			Hotend.move(1, 1);
			Nozzle.move(1, 1);
			pause(30);
			i++;
			}
			while(j < 1) {
				while(l1<100) {
					Hotend.move(-1, 0);
					Nozzle.move(-1, 0);
					pause(30);
					l1++;
				}
				add(Layer1);
				while(l2<h1) {
					XExtrusion.move(0,-1);
					ZGantry.move(0,-1);
					Hotend.move(0, -1);
					Nozzle.move(0, -1);
					pause(30);
					l2++;
				}
				pause(500);
				add(Layer2);
				while(l3<h1) {
					XExtrusion.move(0,-1);
					ZGantry.move(0,-1);
					Hotend.move(0, -1);
					Nozzle.move(0, -1);
					pause(30);
					l3++;
				}
				pause(500);
				add(Layer3);
				while(l4<h1) {
					XExtrusion.move(0,-1);
					ZGantry.move(0,-1);
					Hotend.move(0, -1);
					Nozzle.move(0, -1);
					pause(30);
					l4++;
				}
				pause(500);
				add(Layer4);
				while(l5<h1) {
					XExtrusion.move(0,-1);
					ZGantry.move(0,-1);
					Hotend.move(0, -1);
					Nozzle.move(0, -1);
					pause(30);
					l5++;
				}
				pause(500);
				add(Layer5);
				while(l6<h2) {
					XExtrusion.move(0,-1);
					ZGantry.move(0,-1);
					Hotend.move(0, -1);
					Nozzle.move(0, -1);
					pause(30);
					l6++;
				}
				pause(500);
				add(Layer6);
				add(Layer9);
				while(l7<h1) {
					XExtrusion.move(0,-1);
					ZGantry.move(0,-1);
					Hotend.move(0, -1);
					Nozzle.move(0, -1);
					pause(30);
					l7++;
				}
				pause(500);
				add(Layer7);
				while(l8<h3) {
					XExtrusion.move(0,-1);
					ZGantry.move(0,-1);
					Hotend.move(0, -1);
					Nozzle.move(0, -1);
					pause(30);
					l8++;
				}
				pause(500);
				add(Layer8);
				j++;
				}
			while(k < homing) {
				XExtrusion.move(0,-1);
				ZGantry.move(0,-1);
				Hotend.move(2, -1);
				Nozzle.move(2, -1);
				pause(30);
				k++;
			}
		}
	}
}
