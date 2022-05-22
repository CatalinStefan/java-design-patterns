package state;

public class PlayingState extends State {

  public PlayingState(Game game) {
    super(game);
    System.out.println("-- Game in Playing state. --");
  }

  @Override
  public void onWelcomeScreen() {
    System.out.println("Not allowed.");
  }

  @Override
  public void onPlaying() {
    System.out.println("Currently playing.");
  }

  @Override
  public void onBreak() {
    game.changeState(new BreakState(game));
  }

  @Override
  public void onEndGame() {
    game.changeState(new EndGameState(game));
  }
  
}
