/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 * 
 * @new author: James Patti
 * 
 * @version 2016.02.29 (presume same)
 * 
 * description: me with my chickens with there coop on a
 * nice day.
 * 
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Square grass;
    private Square coop;
    private Square coopDoor; //set as black
    private Circle sun;
    private Person james;
    private Triangle chickenBod1;
    private Triangle chickenBod2;
    private Triangle chickenBod3;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        grass = new Square();
        coop = new Square();
        coopDoor = new Square();
        sun = new Circle();
        james = new Person();
        chickenBod1 = new Triangle();
        chickenBod2 = new Triangle();
        chickenBod3 = new Triangle();
        drawn = false;
    }
     

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            grass.changeColor("green");
            grass.moveHorizontal(-320);
            grass.changeSize(520);
            grass.makeVisible();
            
            coop.changeColor("red");
            coop.moveHorizontal(-200);
            coop.moveVertical(-95);
            coop.changeSize(100);
            coop.makeVisible();
            
            coopDoor.changeColor("black");
            coopDoor.moveHorizontal(-200);
            coopDoor.moveVertical(-18);
            coopDoor.changeSize(20);
            coopDoor.makeVisible();
            
            chickenBod1.changeColor("brown");
            chickenBod1.moveHorizontal(100);
            chickenBod1.moveVertical(60);
            chickenBod1.changeSize(20,25);
            chickenBod1.makeVisible();
            
            chickenBod2.changeColor("brown");
            chickenBod2.moveHorizontal(200);
            chickenBod2.moveVertical(60);
            chickenBod2.changeSize(20,25);
            chickenBod2.makeVisible();
            
            chickenBod3.changeColor("brown");
            chickenBod3.moveHorizontal(-120);
            chickenBod3.moveVertical(40);
            chickenBod3.changeSize(20,25);
            chickenBod3.makeVisible();
            
            james.changeColor("white");
            james.moveHorizontal(-150);
            james.moveVertical(50);
            james.changeSize(100,50);  
            james.makeVisible();
            
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-65);
            sun.changeSize(45);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        
        sun.changeColor("black");
        chickenBod1.changeColor("white");
        chickenBod2.changeColor("white");
        chickenBod3.changeColor("white");
        grass.changeColor("black");
        coop.changeColor("black");
        coopDoor.changeColor("white");
        james.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        
        sun.changeColor("yellow");
        chickenBod1.changeColor("brown");
        chickenBod2.changeColor("brown");
        chickenBod3.changeColor("brown");
        grass.changeColor("green");
        coop.changeColor("red");
        coopDoor.changeColor("black");
        james.changeColor("white");
    }
}
