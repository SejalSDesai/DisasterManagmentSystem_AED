/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EventMaker;

import java.util.ArrayList;

/**
 *
 * @author sej
 */
public class EventMakerDirectory {
    private ArrayList<EventMaker> eventMakerDirectory;

    public EventMakerDirectory() {
        eventMakerDirectory= new ArrayList<>();
    }

    public ArrayList<EventMaker> getChangeMakerDirectory() {
        return eventMakerDirectory;
    }

    public void setChangeMakerDirectory(ArrayList<EventMaker> changeMakerDirectory) {
        this.eventMakerDirectory = changeMakerDirectory;
    }
    
    //add an event maker
    public EventMaker addChangeMaker(){
        EventMaker cm = new EventMaker();
        eventMakerDirectory.add(cm);
        return cm;
    }
    //remove an event maker
    public void removeChangeMaker(EventMaker cm){
        eventMakerDirectory.remove(cm);
    }
    
    
}
