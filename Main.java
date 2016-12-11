/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

/**
 *
 * @author mathieu
 */
public class Main {
    
    
    
    public static void main(String[] args) {
        try {
            new Thread(new RunData()).start();
            GlobalScreen.registerNativeHook();
            GlobalScreen.addNativeKeyListener(new JavaApplication2());
        } catch (NativeHookException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
