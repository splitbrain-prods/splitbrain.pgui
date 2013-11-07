/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package splitbrain.pgui;

import processing.core.PApplet;
import processing.event.MouseEvent;

/**
 *
 * @author Neon
 */
public class panelBox extends guiControl {

    public panelBox(String m_name, String m_content, float m_x, float m_y, float m_width, float m_height, guiStyle m_style) {
        super(m_name, m_content, m_x, m_y, m_width, m_height, m_style);
    }


    @Override
    public void mouseDown(MouseEvent e) {
        //Do Nothing
    }

    @Override
    public void mouseUp(MouseEvent e) {
        //Do Nothing
    }

    @Override
    public void drawControl(PApplet parent) {
        //Do Nothing
    }
    
}
