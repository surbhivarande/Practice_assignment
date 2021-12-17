package AssignmentDate17;

class Room {
private int roomNo;
private String roomType,roomArea;
private boolean acMachine;

Room() {
		// TODO Auto-generated constructor stub
	}

Room(int roomNo, String roomType, String roomArea, boolean acMachine) {
	this.roomNo = roomNo;
	this.roomType = roomType;
	this.roomArea = roomArea;
	this.acMachine = acMachine;
}

public int getRoomNo() {
	return roomNo;
}

public void setRoomNo(int roomNo) {
	this.roomNo = roomNo;
}

public String getRoomType() {
	return roomType;
}

public void setRoomType(String roomType) {
	this.roomType = roomType;
}

public String getRoomArea() {
	return roomArea;
}

public void setRoomArea(String roomArea) {
	this.roomArea = roomArea;
}

public void setAcMachine(boolean acMachine) {
	this.acMachine = acMachine;
}

public boolean isAcMachine() {
	return acMachine;
}
void displayData() {
	System.out.println("The room is:"+getRoomNo());
	System.out.println("The roomArea is:"+getRoomArea());
	System.out.println("The roomType is:"+getRoomType());
	
	String s=(acMachine)? "yes":"no";
	System.out.println("The acMachine is:"+s);
}

public static void main (String[]args) {
	Room r1=new Room();
	r1.setRoomNo(1);
	r1.setRoomArea("double type");
	r1.setRoomType("large");
	r1.setAcMachine(true);
	
	r1.displayData();
	
}
}
