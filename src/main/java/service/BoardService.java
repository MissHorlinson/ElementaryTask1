package service;

public class BoardService {

    public boolean symbolPrint(int row, int cell){
        if(((cell + row) % 2 ) == 0){
            return true;
        } else{
            return false;
        }
    }
}
