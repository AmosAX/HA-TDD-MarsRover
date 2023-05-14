import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarsRoverTests {

    @Test
    public void testMoveForwardOneTime() {

        //Arrange (see README for reference to Arrange-Act-Assert Pattern)
        MarsRover rover = new MarsRoverImpl(new Point2d(3, 3), Direction.SOUTH, 5, 5);

        //Act
        rover.move("f");

        //Assert
        Assertions.assertEquals(new Point2d(3, 2), rover.getCurrentPosition());
    }

    @Test
    public void testMoveBackOneTime() {

        //Arrange (see README for reference to Arrange-Act-Assert Pattern)
        MarsRover rover = new MarsRoverImpl(new Point2d(3, 3), Direction.SOUTH, 5, 5);

        //Act
        rover.move("b");

        //Assert
        Assertions.assertEquals(new Point2d(3, 4), rover.getCurrentPosition());
    }

    @Test
    public void testMoveForwardOneTimeLeftEdgeToRightEdge() {

        //Arrange (see README for reference to Arrange-Act-Assert Pattern)
        MarsRover rover = new MarsRoverImpl(new Point2d(0, 0), Direction.WEST, 5, 5);
        //Act
        rover.move("f");
        //Assert
        Assertions.assertEquals(new Point2d(4, 0), rover.getCurrentPosition());
    }

    @Test
    public void testWrappedMovement01() {
        MarsRover rover = new MarsRoverImpl(new Point2d(0, 0), Direction.NORTH, 5, 5);
        rover.move("fffffffff"); // Move forward 9 times (should wrap around to 0, 4)
        Assertions.assertEquals(new Point2d(0, 4), rover.getCurrentPosition());

    }
}
