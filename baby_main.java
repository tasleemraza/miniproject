*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.swing.SwingUtilities;

/**
 *
 * @sony
 */
public class baby_main {
		//private static void  createAndShowGUI(){
		//Eve mainframe = new Eve();
		//mainframe.setVisible(true);
		//}
              public static void main(String[] args) {
              SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
		babynamesUI mainframe = new babynamesUI();
		mainframe.setVisible(true);
            }
        });
        
    }

   // private void setVisible(boolean b) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
}
