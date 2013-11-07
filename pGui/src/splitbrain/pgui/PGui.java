/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package splitbrain.pgui;

import processing.core.*;
import processing.event.*;
import java.util.ArrayList;
/**
 * GUI Management class
 * @author Neon
 */
public class PGui {
    PApplet parent;
    protected ArrayList<guiControl> controls; //TODO: Get this working!
    protected boolean guiOn;
    protected boolean bBox = false;
    
    
    
    public PGui(PApplet parent){
        //constructor
        this.parent = parent;
        parent.registerMethod("dispose", this);
        parent.registerMethod("draw", this);
    }
    
    //TODO: Method for getting keyboard input (hotkeys).
    //TODO: Method for adding GUI Elements.
    //TODO: Method for turning GUI on and off.
    //TODO: Events/Listners for control events.
    //TODO: Method to turn a Bounding Box on and off.
    //TODO: Method to load layout from text file.
    //TODO: Method to save layout to text file.
    
    public void draw(){
        //TODO: Cycle through GUI elements and draw them.
    }
    
    public void mouseEvent(MouseEvent e){
        //TODO: If the pointer is inside of an element, send a mouse event to it. Only if GUI or Object is active
    }
    
    public void dispose(){
        //TODO: PGui distructor
    }
}
