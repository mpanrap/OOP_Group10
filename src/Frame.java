import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class Windowcal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frame
{
    public static void main(String[] args){
        Grid myGrid = new Grid();   
        JFrame frame = new JFrame("Spreading of Fire");
        frame.setSize(400,400);
        frame.add(myGrid);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}