/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Volunteer;

/**
 *
 * @author sej
 */
public class Volunteer {
    private String volName;
private String volId;
private static int c=1;
private WorkQueue workqueue;
//Volunteer class constructor to autogenerate volId
public Volunteer() {
    volId="Vol"+(++c);
    workqueue= new WorkQueue();
}

public String getvolName() {
    return volName;
}

public void setvolName(String volName) {
    this.volName = volName;
}

public WorkQueue getWorkqueue() {
    return workqueue;
}

public void setWorkqueue(WorkQueue workqueue) {
    this.workqueue = workqueue;
}

public String getvolId() {
    return volId;
}

public void setvolId(String volId) {
    this.volId = volId;
}

@Override
public String toString(){
return volName;

}
    
}
