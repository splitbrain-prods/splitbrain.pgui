/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package splitbrain.pgui;

/**
 * A super simple event monitor... these are not real events.
 * @author Neon
 */
public class guiSimpleEvent {
    public enum guiEVENT{NOCHANGE, MOUSEDOWN, MOUSEUP, VALUECH, CONTENTCH};
    private final String ctlName; //name of control
    private guiEVENT ctlState; //state of control

    public guiSimpleEvent(String ctlName) {
        this.ctlName = ctlName;
    }

    public guiEVENT getCtlState() {
        return ctlState;
    }

    public void setCtlState(guiEVENT ctlState) {
        this.ctlState = ctlState;
    }
    
}
