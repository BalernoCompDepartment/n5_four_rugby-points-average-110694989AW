class Main {
  public static void main(String[] args) {
    String name = Keyboard.getText("what is your name?");
    String team = Keyboard.getText("what is your team?");
    int total = 0;
    
    for(int games = 0; games < 5; games++) {
      total = total + Keyboard.getInt("what did you get in game " + (games + 1) + "?");
    }
    
    double average = total/5;
    
    String output = name + " for " + team + " scored an average of " + average + " per game";
    
    Screen.display(output, "player average");
  }
}