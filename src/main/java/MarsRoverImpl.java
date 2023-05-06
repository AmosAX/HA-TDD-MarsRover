public class MarsRoverImpl implements MarsRover {

    int CurrentXPos;
    int CurrentYPos;
    Direction currentDirection;


    public MarsRoverImpl(Point2d startingPoint, Direction startingDirection){

        this.CurrentXPos= startingPoint.x();
        this.CurrentYPos= startingPoint.y();

        this.currentDirection = startingDirection;
        //TODO implement
    }

    @Override
    public void move(String commands){

        //TODO implement
    }

    @Override
    public Point2d getCurrentPosition() {
        //TODO implement
        return null;
    }
}
