/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splitbrain.pgui;

import processing.core.*;


/**
 *
 * @author Neon
 */
public class guiStyle {
    
    //stroke
    private float m_strokeWeight;
    private float m_Round;
    private PFont m_font;
    
    //colors for active state
    private int m_fillColor;
    private int m_strokeColor;
    private int m_textColor;
    
    //colors for inactive state
    private int m_altFiColor;
    private int m_altStColor;
    private int m_altTeColor;

    public guiStyle(float m_strokeWeight, float m_Round, int m_fillColor, int m_strokeColor, int m_textColor, int m_altFiColor, int m_altStColor,int m_altTeColor, PFont m_font) {
        this.m_strokeWeight = m_strokeWeight;
        this.m_Round = m_Round;
        this.m_fillColor = m_fillColor;
        this.m_strokeColor = m_strokeColor;
        this.m_textColor = m_textColor;
        this.m_altFiColor = m_altFiColor;
        this.m_altStColor = m_altStColor;
        this.m_font = m_font;
    }

    public float getM_strokeWeight() {
        return m_strokeWeight;
    }

    public void setM_strokeWeight(float m_strokeWeight) {
        this.m_strokeWeight = m_strokeWeight;
    }

    public float getM_Round() {
        return m_Round;
    }

    public void setM_Round(float m_Round) {
        this.m_Round = m_Round;
    }

    public int getM_fillColor() {
        return m_fillColor;
    }

    public void setM_fillColor(int m_fillColor) {
        this.m_fillColor = m_fillColor;
    }

    public int getM_strokeColor() {
        return m_strokeColor;
    }

    public void setM_strokeColor(int m_strokeColor) {
        this.m_strokeColor = m_strokeColor;
    }

    public int getM_textColor() {
        return m_textColor;
    }

    public void setM_textColor(int m_textColor) {
        this.m_textColor = m_textColor;
    }

    public int getM_altFiColor() {
        return m_altFiColor;
    }

    public void setM_altFiColor(int m_altFiColor) {
        this.m_altFiColor = m_altFiColor;
    }

    public int getM_altStColor() {
        return m_altStColor;
    }

    public void setM_altStColor(int m_altStColor) {
        this.m_altStColor = m_altStColor;
    }

    public int getM_altTeColor() {
        return m_altTeColor;
    }

    public void setM_altTeColor(int m_altTeColor) {
        this.m_altTeColor = m_altTeColor;
    }

    public PFont getM_font() {
        return m_font;
    }

    public void setM_font(PFont m_font) {
        this.m_font = m_font;
    }



    
    
    
    
}
