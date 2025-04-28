package snakegame;

import javax.swing.*;

public class SnakeGame extends JFrame {
// FRAME is Parent Div and panels are child Divs
    public SnakeGame() { //show frame
        super("Snake Game");//it must be on first
        add(new Board()); // it is a panel now like part of the frame or div in css
        pack(); // to refresh frame to reflect changes 
        
        setSize(300,300);
        setLocationRelativeTo(null); //to set default opening location
        setVisible(true); //frame is by default present but not visible 
    }
    
    public static void main(String[] args) {
        new SnakeGame(); //anonymous objectt only to call the constrctor
    }
    
}
