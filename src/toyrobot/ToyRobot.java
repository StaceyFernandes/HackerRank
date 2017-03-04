package toyrobot;

public class ToyRobot {
	
	private int x;
	private int y;
	private String face;
	
	//no argument constructor
	public ToyRobot(){
		this.x = 0;
		this.y= 0;
		this.face= "north";
	}
	
	//constructor
	public ToyRobot(int x_coord, int y_coord, String face){
		this.x = x_coord;
		this.y = y_coord;
		this.face = face;
	}
	
	public int get_x(){
		return x;
	}
	
	public int get_y(){
		return y;
	}
	
	public String get_face(){
		return face;
	}
	
	public void set_x(int x){
		this.x = x;
	}
	
	public void set_y(int y){
		this.y = y;
	}
	
	public void set_face(String face){
		this.face = face;
	}

	
	public void move(){
		if (face == "south"){
			set_
		}
	}
}
