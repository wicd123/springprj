package java24.board.infc;

import java.util.HashMap;
import java.util.List;

import java.util.HashMap;
import java.util.List;

import org.apache.commons.collections.map.HashedMap;import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachfile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;
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
   
	//Article
	int getArticleTotalRecord(HashMap boardcd);
	
	List<ModelBoard> getArticleList(HashMap boardcd);
	
	ModelArticle getArticle(int articleNo);
	
	int insertArticle(ModelArticle boardcd);
	
	int updateArticle(HashMap updateValue);
	
	int deleteArticle(ModelArticle boardcd);
	int increaseHit(int articleNo);
	
	ModelArticle getNextArticle(HashMap boardcd);
	
	ModelArticle getPrevArticle(HashMap boardcd);
	
	ModelAttachfile getAttachFile(int attachFileNo);
	
	List<ModelBoard> getAttachFileList(int articleNo);
	
	int insertAttachFile(ModelAttachfile filename);
	
	int deleteAttachFile(ModelAttachfile attachfileno);
	
	int getComment(ModelComments commentNO);
	
	List <ModelBoard>  getCommentList(ModelComments articleNo);
	
	int insertComment(ModelComments articleno);
	
	int updateComment();
	
	int deleteComment(ModelComments commentno);
	
	
	
	
	
	
	
	
	
/*	
	//"resultType" getBoardName("paremetertype " "#분은애로boardcd);";
	//"resultType" getBoardName("paremetertype " "#분은애로boardcd);";
	//String getBoardName(String boardcd);
	//"resultType" getBoardOne("paremetertype " #boardcd )
	//ModelBoard getBoardOne(String  boardcd);
	//"tesultType"  getBoardList ( 파라미터타입없으면 안쓴다 );
	//List <ModelBoard> getBoardList();
*/
	
}
