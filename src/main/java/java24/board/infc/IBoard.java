package java24.board.infc;



import org.apache.commons.collections.map.HashedMap;

import java24.board.model.ModelArticle;

public interface IBoard {
	
	//Article
	int getArticleTotalRecord(HashedMap boardcd);
	ModelArticle getArticleList(hashmap boardcd);
	ModelArticle getArticle(int articleNo);
	int insertArticle(ModelArticle boardcd);
	
	
	
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
