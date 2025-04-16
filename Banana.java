import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Banana extends Actor
{
    
    public void act()
    {
        // Add your action code here.
        move(-10);
        
        if(getX() <= 0){
            resetBanana();
        }
        
        if(isTouching(Hero.class)){
            //Add gameover symbol
            SadFace sadFace = new SadFace();
            getWorld().addObject(sadFace, 100, 100);
            getWorld().removeObject(this);
        }
    }
    
    public void resetBanana(){
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0){
            setLocation(600,100);

        }else{
            setLocation(600,300);
        }
    }
}
