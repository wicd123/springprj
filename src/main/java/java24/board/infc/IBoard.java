package java24.board.infc;

import java.util.HashMap;
import java.util.List;



import org.apache.commons.collections.map.HashedMap;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachfile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;
public interface IBoard {
	
	String getBoardName(String boardcd) throws Exception;
    ModelBoard getBoardOne(String boardcd) throws Exception;
    List<ModelBoard> getBoardList() throws Exception;
    List<ModelBoard> getBoardListResultMap() throws Exception;
    
    //??
    List<HashMap<String,ModelBoard>> getBoardCustomMap() throws Exception;
    
    int insertBoard(ModelBoard board) throws Exception;
    int updateBoard(ModelBoard searchValue, ModelBoard updateValue) throws Exception ;
    int deleteBoard(ModelBoard board) throws Exception;
    
    ModelBoard getBoardSearch(ModelBoard board) throws Exception;
    ModelBoard getBoardPaging(ModelBoard board, int start, int end) throws Exception;
    
    int insertBoardList(List<ModelBoard> board) throws Exception;
    
    ModelComments getComment(int commentNo) throws Exception;
    ModelComments getCommentList(int articleNo) throws Exception;
    int insertComment(ModelComments comment) throws Exception;
    int updateComment(ModelComments searchValue, ModelComments updateValue) throws Exception;
    int deleteComment(ModelComments comment) throws Exception;
   
	//Article
	int getArticleTotalRecord(HashMap boardcd) throws Exception;
	
	int getArticleList(HashMap boardcd, HashMap searchWord, HashMap start, HashMap end ) throws Exception;
	
	ModelArticle getArticle(int articleNo) throws Exception;
	
	int insertArticle(ModelArticle boardcd) throws Exception;
	
	int updateArticle(ModelArticle wherearticle, ModelArticle setarticle) throws Exception;
	
	int deleteArticle(ModelArticle articleNo) throws Exception;
	
	int increaseHit(int articleNo) throws Exception;
	
	List<ModelArticle> getNextArticle(ModelArticle boardcd) throws Exception;
	
	List<ModelArticle> getPrevArticle(ModelArticle boardcd) throws Exception;
	
	ModelAttachfile getAttachFile(int attachFileNo) throws Exception;
	
	List<ModelAttachfile> getAttachFileList(int articleNo) throws Exception;
	
	int insertAttachFile(ModelAttachfile filename) throws Exception;
	
	int deleteAttachFile(ModelAttachfile attachfileno) throws Exception;
	
	

	

	
	
	
	
	
	
	
	
	
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
