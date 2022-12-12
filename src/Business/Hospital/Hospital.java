/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital;

/**
 *
 * @author wadhwa
 */
public class Hospital {
    private String doc_name;
    private String doc_id;
    private static int count=1;
    
    //Hospital constructor to generate id automatically
    public Hospital() {
        
        
        doc_id="ORG"+(++count);
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Hospital.count = count;
    }
    
    
     
    public String getDoc_name() {
        return doc_name;
    }

    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }

    public String getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }

   

    @Override
    public String toString(){
    return doc_name;
    
    }

    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital;

/**
 *
 * @author wadhwa
 */
public class Hospital {
    private String doc_name;
    private String doc_id;
    private static int count=1;
    
    //Hospital constructor to generate id automatically
    public Hospital() {
        
        
        doc_id="ORG"+(++count);
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Hospital.count = count;
    }
    
    
     
    public String getDoc_name() {
        return doc_name;
    }

    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }

    public String getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }

   

    @Override
    public String toString(){
    return doc_name;
    
    }

    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital;

/**
 *
 * @author wadhwa
 */
public class Hospital {
    private String doc_name;
    private String doc_id;
    private static int count=1;
    
    //Hospital constructor to generate id automatically
    public Hospital() {
        
        
        doc_id="ORG"+(++count);
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Hospital.count = count;
    }
    
    
     
    public String getDoc_name() {
        return doc_name;
    }

    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }

    public String getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }

   

    @Override
    public String toString(){
    return doc_name;
    
    }

    
}
