interface EventListener{
void performEvent();
}

interface MouseListener extends EventListener{
	void mouseClicked();
     void mousePressed();
	void mouseReleased();
	void mouseMoved();
	void mouseDragged();
}

interface KeyListener extends EventListener{
void keyPressed();
void keyReleased();
}


class EventDemo implements MouseListener,KeyListener{
public void performEvent(){
	System.out.println("Event going");
}

public void mouseClicked(){
	System.out.println("MouseClicked");
}

public void mousePressed(){
	System.out.println("Mouse Pressed");
}
public void mouseReleased(){
	System.out.println("Mouse Released");
}

public void mouseMoved(){
	System.out.println("Mouse Moved");
}

public void mouseDragged(){
	System.out.println("Mouse Dragged");
}

public void keyPressed(){
	System.out.println("Key Pressed");
}
public void keyReleased(){
	System.out.println("Key Released");
}
public static void main(String[]args){
EventDemo e=new EventDemo();
e. performEvent();
}
}


