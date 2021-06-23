
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(-500);
        window.moveVertical(-100);
        window.changeSize(3000);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(100);
        window.moveVertical(40);
        window.changeSize(75);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(100);
        window.moveVertical(115);
        window.changeSize(75);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(175);
        window.moveVertical(40);
        window.changeSize(75);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(175);
        window.moveVertical(115);
        window.changeSize(75);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(100);
        window.moveVertical(190);
        window.changeSize(75);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(175);
        window.moveVertical(190);
        window.changeSize(75);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(100);
        window.moveVertical(265);
        window.changeSize(75);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(175);
        window.moveVertical(265);
        window.changeSize(75);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(700);
        window.moveVertical(40);
        window.changeSize(75);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(700);
        window.moveVertical(115);
        window.changeSize(75);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(625);
        window.moveVertical(40);
        window.changeSize(75);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(625);
        window.moveVertical(115);
        window.changeSize(75);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(700);
        window.moveVertical(190);
        window.changeSize(75);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(625);
        window.moveVertical(190);
        window.changeSize(75);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(700);
        window.moveVertical(265);
        window.changeSize(75);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(625);
        window.moveVertical(265);
        window.changeSize(75);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(440);
        window.moveVertical(130);
        window.changeSize(75);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(365);
        window.moveVertical(130);
        window.changeSize(75);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(100);
        window.moveVertical(200);
        window.changeSize(675);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("magenta");
        window.moveHorizontal(400);
        window.moveVertical(575);
        window.changeSize(75);
        window.makeVisible();
        
        sun = new Circle();
        sun.changeColor("magenta");
        sun.moveHorizontal(440);
        sun.moveVertical(530);
        sun.changeSize(75);
        sun.makeVisible();
        
        roof = new Triangle();
        roof.changeSize(100, 200);
        roof.changeColor("magenta");
        roof.moveHorizontal(185);
        roof.moveVertical(-10);
        roof.makeVisible();
        
        roof = new Triangle();
        roof.changeSize(100, 200);
        roof.changeColor("magenta");
        roof.moveHorizontal(450);
        roof.moveVertical(70);
        roof.makeVisible();
        
        roof = new Triangle();
        roof.changeSize(100, 200);
        roof.changeColor("magenta");
        roof.moveHorizontal(710);
        roof.moveVertical(-10);
        roof.makeVisible();
        
        roof = new Triangle();
        roof.changeSize(200, 70);
        roof.changeColor("green");
        roof.moveHorizontal(840);
        roof.moveVertical(450);
        roof.makeVisible();
        
        roof = new Triangle();
        roof.changeSize(200, 70);
        roof.changeColor("green");
        roof.moveHorizontal(880);
        roof.moveVertical(400);
        roof.makeVisible();
        
        roof = new Triangle();
        roof.changeSize(200, 70);
        roof.changeColor("green");
        roof.moveHorizontal(0);
        roof.moveVertical(350);
        roof.makeVisible();
        
        roof = new Triangle();
        roof.changeSize(200, 70);
        roof.changeColor("green");
        roof.moveHorizontal(70);
        roof.moveVertical(300);
        roof.makeVisible();

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(200);
        window.moveVertical(240);
        window.changeSize(40);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(200);
        window.moveVertical(280);
        window.changeSize(40);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(200);
        window.moveVertical(320);
        window.changeSize(40);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(425);
        window.moveVertical(240);
        window.changeSize(40);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(425);
        window.moveVertical(280);
        window.changeSize(40);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(425);
        window.moveVertical(320);
        window.changeSize(40);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(650);
        window.moveVertical(240);
        window.changeSize(40);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(650);
        window.moveVertical(280);
        window.changeSize(40);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(650);
        window.moveVertical(320);
        window.changeSize(40);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(310);
        window.moveVertical(360);
        window.changeSize(40);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(310);
        window.moveVertical(400);
        window.changeSize(40);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(310);
        window.moveVertical(440);
        window.changeSize(40);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(540);
        window.moveVertical(360);
        window.changeSize(40);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(540);
        window.moveVertical(400);
        window.changeSize(40);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(540);
        window.moveVertical(440);
        window.changeSize(40);
        window.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
