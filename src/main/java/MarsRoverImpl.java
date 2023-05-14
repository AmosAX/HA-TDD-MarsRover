public class MarsRoverImpl implements MarsRover {

    int CurrentXPos;
    int CurrentYPos;
    Direction currentDirection;

    int gridHeight;
    int gridWidth;


    public MarsRoverImpl(Point2d startingPoint, Direction startingDirection, int gridHeight,int gridWidth){

        this.CurrentXPos= startingPoint.x();
        this.CurrentYPos= startingPoint.y();

        this.gridHeight = gridHeight;
        this.gridWidth = gridWidth;

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
        switch (currentDirection) {
            case NORTH:
                CurrentYPos = (CurrentYPos - 1 + gridHeight) % gridHeight;
                break;
            case SOUTH:
                CurrentYPos = (CurrentYPos + 1) % gridHeight;
                break;
            case EAST:
                CurrentXPos = (CurrentXPos - 1 + gridWidth) % gridWidth;
                break;
            case WEST:
                CurrentXPos = (CurrentXPos + 1) % gridWidth;
                break;

        }
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
                CurrentYPos = (CurrentYPos + 1) % gridHeight;
                break;
            case SOUTH:
                CurrentYPos = (CurrentYPos - 1 + gridHeight) % gridHeight;
                break;
            case EAST:
                CurrentXPos = (CurrentXPos + 1) % gridWidth;
                break;
            case WEST:
                CurrentXPos = (CurrentXPos - 1 + gridWidth) % gridWidth;
                break;
        }
    }


    @Override
    public Point2d getCurrentPosition() {

        //Will work for the time being
        return new Point2d(CurrentXPos,CurrentYPos);
    }
}
