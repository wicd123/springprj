package Java24.board.infc;

import java.util.HashMap;
import java.util.List;

import Java24.board.model.ModelBoard;
import Java24.board.model.ModelComments;

public interface IBoard {
    String getBoardName(String boardcd);
    ModelBoard getBoardOne(String boardcd);
    List<ModelBoard> getBoardList();
    List<ModelBoard> getBoardListResultMap();
    
    //??
    List<HashMap<String,ModelBoard>> getBoardCustomMap();
    
    int insertBoard(ModelBoard board);
    int updateBoard(ModelBoard searchValue, ModelBoard updateValue);
    int deleteBoard(ModelBoard board);
    
    ModelBoard getBoardSearch(ModelBoard board);
    ModelBoard getBoardPaging(ModelBoard board, int start, int end);
    
    int insertBoardList(List<ModelBoard> board);
    
    ModelComments getComment(int commentNo);
    ModelComments getCommentList(int articleNo);
    int insertComment(ModelComments comment);
    int updateComment(ModelComments searchValue, ModelComments updateValue);
    int deleteComment(ModelComments comment);
   
}
