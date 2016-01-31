import GUI.MainJFrame;

import javax.swing.*;

/***************************************************************
 * file: ProjectDriver.java
 * author: Cary Anderson and Richard Jung
 * class: CS 245 – GUI Programming
 *
 * assignment: Quarter Project
 * date last modified: 01/29/2016
 *
 * purpose: Obvi this is the Driver of the program. Basically
 * only serves as an entry point..
 *
 ****************************************************************/
public class ProjectDriver {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainJFrame mainJFrame = new MainJFrame();
                mainJFrame.setVisible(true); // Show the Window
            }
        });
    }
}
