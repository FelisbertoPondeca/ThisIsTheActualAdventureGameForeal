public class room{
    int roomNumber;
    String roomName;
    String doorPath;
    String roomDescription;
    String puzzle;
    String answer;
    
    public room(int initRoomNumber, String initRoomName, String initDoorPath, String initRoomDescription, String initPuzzle, String initAnswer){
        roomNumber = initRoomNumber;
        roomName = initRoomName;
        doorPath = initDoorPath;
        roomDescription = initRoomDescription;
        puzzle = initPuzzle;
        answer = initAnswer;
    }

    //getters
    public int getRoomNumber() {
        return roomNumber;
    }
    public String getRoomName() {
        return roomName;
    }
    public String getDoorPath() {
        return doorPath;
    }
    public String getRoomDescription() {
        return roomDescription;
    }
    public String getPuzzle() {
        return puzzle;
    }
    public String getAnswer() {
        return answer;
    }
     
}