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
            for (char command : commands.toCharArray()) {
                switch (command) {
                    case 'l':
                        turnLeft();
                        break;
                    case 'r':
                        turnRight();
                        break;
                    case 'f':
                        moveForward();
                        break;
                    case 'b':
                        moveBackward();
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid command: " + command);
                }
            }
        }

    private void moveBackward() {

    }

    //TODO implement
        private void turnLeft() {
            switch (currentDirection) {
                case NORTH:
                    currentDirection = Direction.WEST;
                    break;
                case SOUTH:
                    currentDirection = Direction.EAST ;
                    break;
                case EAST:
                    currentDirection = Direction.NORTH ;
                    break;
                case WEST:
                    currentDirection = Direction.SOUTH;
                    break;
            }
        }

    private void turnRight() {
        switch (currentDirection) {
            case NORTH:
                currentDirection = Direction.EAST;
                break;
            case SOUTH:
                currentDirection = Direction.WEST;
                break;
            case EAST:
                currentDirection = Direction.SOUTH;
                break;
            case WEST:
                currentDirection = Direction.NORTH;
                break;
        }
    }
    private void moveForward() {
        switch (currentDirection) {
            case NORTH:
                CurrentYPos++;
                break;
            case SOUTH:
                CurrentYPos--;
                break;
            case EAST:
                CurrentXPos++;
                break;
            case WEST:
                CurrentXPos--;
                break;
        }
    }


    @Override
    public Point2d getCurrentPosition() {

        //Will work for the time being
        return new Point2d(CurrentXPos,CurrentYPos);
    }
}
