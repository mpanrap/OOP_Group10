
/**
 * Write a description of class Cell here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cell
{
    public static final int EMPTY = 0;
    public static final int TREE = 1;
    public static final int BURNING = 2;
    private int state;

    public Cell(){
        this.state = TREE;
    }
    
    public int getState(){
        return this.state;
    }
    
    public void setState(int state){
       this.state = state;
    }

}
