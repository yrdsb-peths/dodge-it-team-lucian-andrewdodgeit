import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class defeat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Defeated extends Actor
{
    /**
     * Act - do whatever the defeat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Defeated() {
        GreenfootImage defeatedImage = new GreenfootImage("defeated.jpg");
        defeatedImage.scale(200, 200);
        setImage(defeatedImage);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
