package state;

public class EndGameState extends State {

  public EndGameState(Game game) {
    super(game);
    System.out.println("-- Game in EndGame state --");
  }

  @Override
  public void onWelcomeScreen() {
    game.changeState(new WelcomeScreenState(game));
  }

  @Override
  public void onPlaying() {
    System.out.println("Not allowed.");
  }

  @Override
  public void onBreak() {
    System.out.println("Not allowed.");
  }

  @Override
  public void onEndGame() {
    System.out.println("Currently on end game state.");
  }
  
  
}
