public class player {
    String playerName;
    String[] inventory = new String[1];
    boolean isAlive =true;
    boolean coin = false;
    //int location = 1;

   /* boolean[] things = {false, false, false, false, false, false, true, false, false, false};

    ArrayList<Boolean> has = new ArrayList<Boolean>(Arrays.asList(things));
*/
    public player(){

    }
    public void setName(String x){

       playerName = x;
    }

    public void setLife(boolean x){

        isAlive = x;
     }
     public boolean getLife(){
        return isAlive;
     }
     public void setCoin(boolean x){
        coin = x;
     }
     public boolean getCoin(){
        return coin;
     }


    /*public int getLocation(){

        return location;
    }
    public void setLocation(int x){

        location = x;
    }

*/

}