import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
        /* rutina
        wait(60);
        sleep(5); 
        wait(60);
        eat();
        wait(60);
        walkLeft(1);
        wait(60);
        dance();
        wait(240);*/
        
        
        if(isSleepy())
        {
            sleep(10);
            shoutHooray();
        }
        else
        {
            shoutHooray();
            wait(8);
        }
        
        if(isBored())
        {
            dance();
            wait(800);
        }
        
        if(isHungry())
        {
            wait(400);
            eat();
        }
        
        if(isAlone())
        {
            sleep(5);
        }
        else
        {
            shoutHooray();
        }
    }    
}
