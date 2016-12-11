/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
/**
 *
 * @author mathieu
 */
public class JavaApplication2 implements NativeKeyListener {

    /**
     * @param args the command line arguments
     */
    
    private static String keyTyped;
    
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent nke) {
        keyTyped += NativeKeyEvent.getKeyText(nke.getKeyCode());
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent nke) {
    
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent nke) {

    }
    
        
    public String getKeyTyped() {
        return keyTyped;
    }
    public void clearKeyTyped() {
        keyTyped = "";
    }
    
}
