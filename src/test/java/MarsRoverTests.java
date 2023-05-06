import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarsRoverTests {

    @Test
    public void testMoveForwardOneTime() {

        //Arrange (see README for reference to Arrange-Act-Assert Pattern)
        MarsRover rover = new MarsRoverImpl(new Point2d(3, 3), Direction.SOUTH);

        //Act
        rover.move("f");

        //Assert
        Assertions.assertEquals(new Point2d(3, 4), rover.getCurrentPosition());
    }

    @Test
    public void testMoveBackOneTime() {

        //Arrange (see README for reference to Arrange-Act-Assert Pattern)
        MarsRover rover = new MarsRoverImpl(new Point2d(3, 3), Direction.SOUTH);

        //Act
        rover.move("b");

        //Assert
        Assertions.assertEquals(new Point2d(3, 2 ), rover.getCurrentPosition());
    }

    @Test
    public void testMoveForwardOneTimeLeftEdgeToRightEdge() {

        //Arrange (see README for reference to Arrange-Act-Assert Pattern)
        MarsRover rover = new MarsRoverImpl(new Point2d(0, 3), Direction.WEST);

        //Act
        rover.move("f");

        //Assert
        Assertions.assertEquals(new Point2d(5, 3), rover.getCurrentPosition());
    }
}

    /*         N
       0   1   2   3   4
     +---+---+---+---+---+
    0|   |   |   |   |   |
     +---+---+---+---+---+
    1|   |   |   |   |   |
     +---+---+---+---+---+
  W 2|   |   |   |   |   | E
     +---+---+---+---+---+
    3|   |   |   |   |   |
     +---+---+---+---+---+
    4|   |   |   |   |   |
     +---+---+---+---+---+
               S

 */