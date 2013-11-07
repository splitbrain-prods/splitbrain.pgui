/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libTest;

import processing.core.*;
import processing.data.*;
import processing.opengl.*;

import splitbrain.pgui.*;

//Test for my processing library



/**
 *
 * @author Neon
 */
public class testSketch extends PApplet{
    guiStyle myStyle;
    guiButton myButton;
    guiButton anotherButton;
    
    @Override
    public void setup(){
        this.size(800, 600, processing.core.PApplet.P2D);
        //guiStyle(float m_strokeWeight, float m_Round, int m_fillColor, int m_strokeColor, int m_textColor, int m_altFiColor, int m_altStColor,int m_altTeColor, PFont m_font)
        myStyle = new guiStyle(10f, 7f, color(255,255,255), color(0,0,0), color(0,0,0), color(200,200,200), color(100,100,100), color(100,100,100), createFont("CourierNewPSMT", 16));
        myButton = new guiButton("btn1", "TEST", 100f, 10f, 250f, 100f, myStyle);
        anotherButton = new guiButton("btn2", "Another One!", 100f, 60f, 250f, 50f, myStyle);        
    }
    
    @Override
    public void draw(){
        this.background(0x6495ED); //Clear Screen
        myButton.drawControl(this);
        //anotherButton.drawControl(this);
    }
}
