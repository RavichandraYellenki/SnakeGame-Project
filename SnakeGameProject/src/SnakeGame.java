import javax.swing.*;

public class SnakeGame extends JFrame {
    Board board;
    SnakeGame()
    {
      board = new Board();

      add(board);
      pack();
      setResizable(false);
      setTitle("SNAKE GAME");
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }



    public static void main(String[] args) {
       SnakeGame snakeGame = new SnakeGame();
        }
    }
