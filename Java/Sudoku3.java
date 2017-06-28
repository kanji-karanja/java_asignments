import javafx.scene.control.Cell;
public class Sudoku3{
    static int N=9;
    static int grid[][]={{0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0}};
    static class cell{
        int row,col;
        public cell(int row, int col){
            super();
            this.row=row;
            this.col=col;
        }
    @Override
    public String toString(){
        return "Cell[row="+row+", col="+col+"]";
    }
    }
    static boolean isValid(Cell cell,int value){
        if(0!=grid[cell.row][cell.col]){
            throw new RuntimeException("cannot call for cell which already has a value");
        }
         for (int r=0; r<9;r++){
            if(grid[r][Cell.row]==value){
                return false;
            }
        }
        for (int c=0; c<9;c++){
            if (grid[c][cell.row]==value){
                return false;
            }
        }
        int x1= 3*(cell.row/3);
        int y1=3*(cell.row/3);
        int x2 = x1+2;
        int y2= y1+2;

        for(int x=x1;x<x2;x++){
            for(int y=y1;y<y2;y++){
                if(grid[x][y]==value){
                    return false;
                }
                else{
                    return true;
                }
            }
        }
    }
    public static void main(String args[]){
       
    }
}