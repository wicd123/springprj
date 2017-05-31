package java24.board.infc;

import java.util.HashMap;
import java.util.List;

import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachfile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

public interface IBoard {
	
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
