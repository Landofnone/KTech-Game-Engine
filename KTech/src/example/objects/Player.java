package example.objects;

import java.awt.event.KeyEvent;

import KTech.components.Entity;
import KTech.core.KTech;
import KTech.core.Renderer;
import KTech.graphics.Image;



public class Player extends Entity {

	int x, y; //Players x and y coordinates
	
	int mousex = 0, mousey = 0;
	
	Image guy = new Image("/enemy.png");
	
	public Player(int x, int y) { // Constructor takes in values of coordinates to spawn at
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void update(KTech kt, float time) { 
		
	}

	@Override
	public void render(KTech kt, Renderer r) {
		r.drawImage(guy, x, y); // rendering image at x and y coordinates
	}

	@Override
	public void componentEvent(String name, Entity object) {
		
	}

	@Override
	public void dispose() {
		
	}
}
