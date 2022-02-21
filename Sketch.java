import processing.core.PApplet;

public class Sketch extends PApplet {
    
    
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // put your size call here
    size(400, 400);
  }

  public void setup() {
    background(51, 204, 255);
  }

  public void draw() {

    // yellow sun
    fill(255, 255, 0);
    ellipse(0, 0, 150, 150);

    // green rectangle
    fill(0,255,0);
    rect(0, 320, 400, 430);

    // tan rectangle  
    fill(210, 180, 140);
    rect(95, 150, 210, 180);

    // light red chimney
    fill(255, 127, 127);
    rect(250, 85, 30, 50);

    // red chimney crown
    fill(255, 51, 51);
    rect(245, 80, 40, 10);

    // red triangle roof
    fill(255, 51, 51);
    triangle(80, 150, 200, 70, 320, 150);

    // left rectangle window
    fill(51, 153, 255);
    rect(115, 180, 55, 55);

    // vertical left window line
    line(143, 180, 143, 235);

    // horizontal left window line
    line(115, 206, 170, 206);

    // right rectangle window
    fill(51, 153, 255);
    rect(230, 180, 55, 55);

    // vertical right window line
    line(259, 180, 259, 235);

    // horizontal right window line
    line(230, 205, 285, 205);

    // orange door 
    fill(255, 204, 0);
    rect(180, 260, 45, 70);

    // brown doorknob
    fill(101, 67, 33);
    ellipse(190, 295, 7, 7);

    // grey pathway
    fill(211,211,211);
    rect(180, 330, 45, 200);

  

  }

}
