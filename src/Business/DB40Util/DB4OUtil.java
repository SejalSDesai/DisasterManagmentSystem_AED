/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DB40Util;

import Business.ConfigureASystem;
import Business.Ecosystem;
import java.nio.file.Paths;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;

/**
 *
 * @author ruchi
 */
public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        try{
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        System.out.println("DB4 instance");
        
        return dB4OUtil;
        }
        catch(Exception e)
        {
            System.out.println("error");
            return dB4OUtil;
        }
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }
    // connection
    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            config.common().activationDepth(Integer.MAX_VALUE);
            config.common().updateDepth(Integer.MAX_VALUE);

            config.common().objectClass(Ecosystem.class).cascadeOnUpdate(true);

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(Ecosystem system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public Ecosystem retrieveSystem(){
        ObjectContainer conn = createConnection();
        
        ObjectSet<Ecosystem> systems = conn.query(Ecosystem.class);
        System.out.println("Connection Successfull");
        Ecosystem system;
        if (systems.size() == 0){
            system = ConfigureASystem.configure(); 
        }
        else{
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
    }
}
