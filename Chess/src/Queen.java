

import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class Queen extends Piece {

    public Queen(String color, Position position) {
        super(color,"queen",position);
        this.position.setImage("queen",color);
        this.firstTime = 0;

    }

    @Override
    public ArrayList<Position> possibleMoves() {
        ArrayList<Position> possibleMoves = new ArrayList<>();

        int row = position.getX();
        int column = position.getY();

        Position[][] positions = position.getBoard().getPositions();

        System.out.println("UP");
        //Up
        for(int r=row-1, c=column; r>=0 ; r--){
            if(!positions[r][c].getIsOccupied() ){
                possibleMoves.add(positions[r][c]);
            }
            else{
                if(!positions[r][c].getOccupyingPiece().color.equals(this.color)) {
                    possibleMoves.add(positions[r][c]);
                    break;
                }
                else
                    break;
            }
            System.out.println("___________________\n");
        }

        System.out.println("Down");
        //Down
        for(int r=row+1, c=column; r<=7 ; r++){
            System.out.println("Position"+c+""+r);
            System.out.println("Occupied "+positions[r][c].getIsOccupied());
            if(!positions[r][c].getIsOccupied()){
                possibleMoves.add(positions[r][c]);
                System.out.println("Added");
            }
            else{
                System.out.println("Else condition Initated");
                System.out.println("Occupying piece and color "+positions[r][c].getOccupyingPiece().getName()+" "+positions[r][c].getOccupyingPiece().getColor());
                System.out.println("Occupied by same color "+positions[r][c].getOccupyingPiece().color.equals(this.color));
                if(!positions[r][c].getOccupyingPiece().color.equals(this.color)) {
                    possibleMoves.add(positions[r][c]);
                    System.out.println("Added");
                    break;
                }
                else
                    break;
            }
            System.out.println("___________________\n");
        }

        System.out.println("Left");
        //Left
        for(int r=row, c=column-1; c>=0 ; c--){
            System.out.println("Position"+c+""+r);
            System.out.println("Occupied "+positions[r][c].getIsOccupied());
            if(!positions[r][c].getIsOccupied() ){
                possibleMoves.add(positions[r][c]);
                System.out.println("Added");
            }
            else{
                System.out.println("Else condition Initated");
                System.out.println("Occupying piece and color "+positions[r][c].getOccupyingPiece().getName()+" "+positions[r][c].getOccupyingPiece().getColor());
                System.out.println("Occupied by same color "+positions[r][c].getOccupyingPiece().color.equals(this.color));
                if(!positions[r][c].getOccupyingPiece().color.equals(this.color)) {
                    possibleMoves.add(positions[r][c]);
                    System.out.println("Added");
                    break;
                }
                else
                    break;
            }
            System.out.println("___________________\n");
        }

        System.out.println("Right");
        //Right
        for(int r=row, c=column+1; c<=7; c++){
            System.out.println("Position"+c+""+r);
            System.out.println("Occupied "+positions[r][c].getIsOccupied());
            if(!positions[r][c].getIsOccupied() ){
                possibleMoves.add(positions[r][c]);
                System.out.println("Added");
            }
            else {
                System.out.println("Else condition Initated");
                System.out.println("Occupying piece and color "+positions[r][c].getOccupyingPiece().getName()+" "+positions[r][c].getOccupyingPiece().getColor());
                System.out.println("Occupied by same color "+positions[r][c].getOccupyingPiece().color.equals(this.color));
                if(!positions[r][c].getOccupyingPiece().color.equals(this.color)) {
                    possibleMoves.add(positions[r][c]);
                    System.out.println("Added");
                    break;
                }
                else
                    break;
            }
            System.out.println("___________________\n");
        }

        System.out.println("Right Up");
        //Right Up
        for(int r=row-1, c=column+1; r>=0 && c<=7 ; r--, c++){
            System.out.println("Position"+c+""+r);
            System.out.println("Occupied "+positions[r][c].getIsOccupied());
            if(!positions[r][c].getIsOccupied()){
                possibleMoves.add(positions[r][c]);
                System.out.println("Added");
            }
            else{
                System.out.println("Else condition Initated");
                System.out.println("Occupying piece and color "+positions[r][c].getOccupyingPiece().getName()+" "+positions[r][c].getOccupyingPiece().getColor());
                System.out.println("Occupied by same color "+positions[r][c].getOccupyingPiece().color.equals(this.color));
                if(!positions[r][c].getOccupyingPiece().getColor().equals(this.color)) {
                    possibleMoves.add(positions[r][c]);
                    System.out.println("Added");
                    break;
                }
                else
                    break;
            }
            System.out.println("___________________\n");
        }

        System.out.println("Right Down");
        //Right Down
        for(int r=row+1, c=column+1; r<=7 && c<=7 ; r++, c++){
            System.out.println("Position"+c+""+r);
            System.out.println("Occupied "+positions[r][c].getIsOccupied());
            if(!positions[r][c].getIsOccupied()){
                possibleMoves.add(positions[r][c]);
                System.out.println("Added");
            }
            else {
                System.out.println("Else condition Initated");
                System.out.println("Occupying piece and color "+positions[r][c].getOccupyingPiece().getName()+" "+positions[r][c].getOccupyingPiece().getColor());
                System.out.println("Occupied by same color "+positions[r][c].getOccupyingPiece().color.equals(this.color));
                if(!positions[r][c].getOccupyingPiece().getColor().equals(this.color)) {
                    possibleMoves.add(positions[r][c]);
                    System.out.println("Added");
                    break;
                }
                else
                    break;
            }
            System.out.println("___________________\n");
        }

        System.out.println("Left Up");
        //Left Up
        for(int r=row-1, c=column-1; r>=0 && c>=0 ; r--, c--){
            System.out.println("Position"+c+""+r);
            System.out.println("Occupied "+positions[r][c].getIsOccupied());
            if(!positions[r][c].getIsOccupied()){
                possibleMoves.add(positions[r][c]);
                System.out.println("Added");
            }
            else{
                System.out.println("Else condition Initated");
                System.out.println("Occupying piece and color "+positions[r][c].getOccupyingPiece().getName()+" "+positions[r][c].getOccupyingPiece().getColor());
                System.out.println("Occupied by same color "+positions[r][c].getOccupyingPiece().color.equals(this.color));
                if(!positions[r][c].getOccupyingPiece().getColor().equals(this.color)) {
                    possibleMoves.add(positions[r][c]);
                    System.out.println("Added");
                    break;
                }
                else
                    break;
            }
            System.out.println("___________________\n");
        }

        System.out.println("Left Down");
        //Left Down
        for(int r=row+1, c=column-1; r<=7 && c>=0 ; r++, c--){
            System.out.println("Position"+c+""+r);
            System.out.println("Occupied "+positions[r][c].getIsOccupied());
            if(!positions[r][c].getIsOccupied() ){
                possibleMoves.add(positions[r][c]);
                System.out.println("Added");
            }
            else{
                System.out.println("Else condition Initated");
                System.out.println("Occupying piece and color "+positions[r][c].getOccupyingPiece().getName()+" "+positions[r][c].getOccupyingPiece().getColor());
                System.out.println("Occupied by same color "+positions[r][c].getOccupyingPiece().color.equals(this.color));
                if(!positions[r][c].getOccupyingPiece().getColor().equals(this.color)) {
                    possibleMoves.add(positions[r][c]);
                    System.out.println("Added");
                    break;
                }
                else
                    break;
            }
            System.out.println("___________________\n");
        }



        System.out.println("Possible Moves :");
        for(Position c:possibleMoves){
            System.out.print((c.getY()+1)+""+(c.getX()+1)+" ");
        }
        return possibleMoves;
    }
    public void changeFirstTime(){
        this.firstTime = 1;
    }
}
