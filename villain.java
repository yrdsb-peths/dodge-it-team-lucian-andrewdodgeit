import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class villain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Villain extends Actor
{
    /**
     * Act - do whatever the villain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Villain(){   
        GreenfootImage villainImage = new GreenfootImage("kingpin.jpg");
        villainImage.scale(50, 50);
        setImage(villainImage);
    }
    
    public void act()
    {
        move(-5);
        if (getX() <= 50) {
            resetVillain();
        }
        
        if (isTouching(Hero.class)) {
            Actor hero = getOneIntersectingObject(Hero.class);
            
            getWorld().addObject(new Defeated(), 300, 200);
            getWorld().removeObject(this);
            getWorld().removeObject(hero);
        }
    }
    
    public void resetVillain() {
        int random = Greenfoot.getRandomNumber(2);
        if (random == 0) {
            setLocation(600, 100);
        }
        else {
            setLocation(600, 300);
        }
    }
}
