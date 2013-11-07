/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package splitbrain.pgui;

import processing.core.*;
import processing.event.MouseEvent;

/**
 * This is a button class! It extends the guiControl Class
 * 
 * @author Neon
 */
public class guiButton extends guiControl {
    private int[] m_curColors;
    private boolean m_isClicked;

    
    /**
    * Constructor for the guiButtom class.
    * You must set the Name, Content, Location, size and style of the object.
    * @param  m_name    Contains name of this control. Must be unique!
    * @param  m_content Contains the text that is displayed in the button.
    * @param  m_x       Contains the X axis coordinates for the top left hand corner of the button.
    * @param  m_y       Contains the Y axis coordinates for the top left hand corner of the button.
    * @param  m_width   Contains the Width of the button.
    * @param  m_height  Height of the button.
    * @param  m_style   Style for the button to conform to.
    * @see              guiStyle
    * @see              guiControl
    */
    public guiButton(String m_name, String m_content, float m_x, float m_y, float m_width, float m_height, guiStyle m_style) {
        super(m_name, m_content, m_x, m_y, m_width, m_height, m_style);
        
        m_curColors = new int[3]; //Fill[0], Stroke[1], Text[2]
        m_curColors[0] = this.m_style.getM_fillColor();
        m_curColors[1] = this.m_style.getM_strokeColor();
        m_curColors[2] = this.m_style.getM_textColor();
        
    }

    @Override
    public void mouseDown(MouseEvent e) {
        //Mouse is clicked!
        this.m_value = 1; //let everybody know
        //get alternate colors from style
        m_curColors[0] = this.m_style.getM_altFiColor();
        m_curColors[1] = this.m_style.getM_altStColor();
        m_curColors[2] = this.m_style.getM_altTeColor();
    }
    
    @Override
    public void mouseUp(MouseEvent e){
        //Mouse is not clicked!
        this.m_value = 0; //let everybody know
        //get alternate colors from style
        m_curColors[0] = this.m_style.getM_fillColor();
        m_curColors[1] = this.m_style.getM_strokeColor();
        m_curColors[2] = this.m_style.getM_textColor();
    }
    
    @Override
    public void drawControl(PApplet parent) {
        /*FIXME: 11.2.2013 Not Drawing top of Rect
         * For some reason i am missing top border of my rect. the shape is not
         * clipping as there are 'caps' on the stroke.
         */   
        
        
        // Draws the control;
        parent.strokeWeight(this.m_style.getM_strokeWeight()); //get stroke weight from style
        //get ready to create an object with the current colors
        parent.fill(this.m_curColors[0]); 
        parent.stroke(this.m_curColors[1]);
        
        //TODO: put join type into guiStyle.
        parent.strokeJoin(PApplet.ROUND);
        
        //get ready to draw the text
        //TODO: Set up font size in guiStyle
        parent.textFont(this.m_style.getM_font(), 18); 
        
        //draw the button box
        //TRYME: Try using PApplet.shape() rather than PApplet.rect().
        parent.beginShape();
        parent.vertex(this.m_x, this.m_y); //TL
        parent.vertex(this.m_x + this.m_width, this.m_y); //TR
        parent.vertex(this.m_x + this.m_width, this.m_y + this.m_height); //BR
        parent.vertex(this.m_x, this.m_y + this.m_height); //BL
        parent.endShape(PApplet.CLOSE);
        //XXX: parent.rect(this.m_x, this.m_y, this.m_width, this.m_height, this.m_style.getM_Round());
        
        //draw the text
        //FIXME: Text can overflow outside of the text box. Fix This.
        //TODO: Set up text padding in guiStyle
                
        //Temp for debug
        float padding = 10f;
        
        //parent.noStroke();
        parent.fill(this.m_curColors[2]); //Set the text color;
        //Draw the text. Add some padding!
        parent.text(this.m_content, this.m_x + padding, this.m_y + this.m_height - padding);
    }

    public String getM_content() {
        return m_content;
    }

    public void setM_content(String m_content) {
        this.m_content = m_content;
    }    
}
