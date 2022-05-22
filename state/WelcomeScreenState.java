package state;

public class WelcomeScreenState extends State {
  
  public WelcomeScreenState(Game game) {
    super(game);
    System.out.println("-- Game in WelcomeScreen state --");
  }

  @Override
  public void onWelcomeScreen() {
    System.out.println("Currently on welcome screen");
  }

  @Override
  public void onPlaying() {
    game.changeState(new PlayingState(game));
  }

  @Override
  public void onBreak() {
    System.out.println("Not allowed.");
  }

  @Override
  public void onEndGame() {
    System.out.println("Not allowed.");
  }
}
