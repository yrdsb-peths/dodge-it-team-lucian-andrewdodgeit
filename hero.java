import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Hero(){
        GreenfootImage heroImage = new GreenfootImage("spiderman.jpg");
        heroImage.scale(50, 50);
        setImage(heroImage);
    }
    
    boolean isAtTop = true;
    
    public void act()
    {
        if(Greenfoot.mouseClicked(null)){
            if(isAtTop == false) {
                setLocation(100, 100);
                isAtTop = true;
            }
            else{
                setLocation(100, 300);
                isAtTop = false;
            }
        }
    }
}
