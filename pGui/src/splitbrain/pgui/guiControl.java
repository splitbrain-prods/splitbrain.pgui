/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * Task List
 * TODO: Add JavaDOC comments to all classes and methods
 *
 * Controls to create
 * TODO: create an interface for events. http://www.javaworld.com/javatips/jw-javatip10.html
 * TODO: imgButton - a button containing an image no text.
 * TODO: txtLabel - Just text displayed on the screen.
 * TODO: imgLabel - A label for displaying images.
 * TODO: textField - a text input field.
 * TODO: fadeBar - a fader bar.
 * TODO: scrollBar - a scroll bar.
 * TODO: chkBox - a check box.
 * TODO: radioButton - a radio button.
 * TODO: meterBar - meter much like a progress bar.
 * TODO: ledIndicator - a boolean indicator.
 * TODO: panelBox - A blank panel to put things on.
 */

package splitbrain.pgui;

import processing.core.*;
import processing.event.*;

/**
 *
 * @author Neon
 */
public abstract class guiControl {
    
    protected boolean m_active = false;
    protected int m_value = 0;   
    protected float m_x;
    protected float m_y;
    protected float m_width;
    protected float m_height;
    protected guiStyle m_style;
    protected final String m_name;
    protected String m_content;
    protected guiSimpleEvent event; //TODO: Check for changes and return event

    public guiControl(String m_name, String m_content, float m_x, float m_y, float m_width, float m_height, guiStyle m_style) {
        this.m_x = m_x;
        this.m_y = m_y;
        this.m_width = m_width;
        this.m_height = m_height;
        this.m_style = m_style;
        this.m_name = m_name;
        this.m_content = m_content;
    }
    
    public abstract void mouseDown(MouseEvent e);
    public abstract void mouseUp(MouseEvent e);
    
    public abstract void drawControl(PApplet parent);
    

    public boolean isM_active() {
        return m_active;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_active(boolean m_active) {
        this.m_active = m_active;
    }

    public int getM_value() {
        return m_value;
    }

    public void setM_value(int m_value) {
        this.m_value = m_value;
    }

    public float getM_x() {
        return m_x;
    }

    public void setM_x(float m_x) {
        this.m_x = m_x;
    }

    public float getM_y() {
        return m_y;
    }

    public void setM_y(float m_y) {
        this.m_y = m_y;
    }

    public float getM_width() {
        return m_width;
    }

    public void setM_width(float m_width) {
        this.m_width = m_width;
    }

    public float getM_height() {
        return m_height;
    }

    public void setM_height(float m_height) {
        this.m_height = m_height;
    }

    public guiStyle getM_style() {
        return m_style;
    }

    public void setM_style(guiStyle m_style) {
        this.m_style = m_style;
    }
    
    
}
