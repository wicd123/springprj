package java24.board.dao;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java23.mybatis.model.ModelBook;
import java24.board.infc.IBoard;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachfile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

@Repository("daoboard")
public class DaoBoard implements IBoard {
	
	
	@Autowired
	@Qualifier("sqlSession")
	private SqlSession session;
	
	
	@Override
	public String getBoardName(String boardcd) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelBoard getBoardOne(String boardcd) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ModelBoard> getBoardList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ModelBoard> getBoardListResultMap() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HashMap<String, ModelBoard>> getBoardCustomMap() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertBoard(ModelBoard board) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBoard(ModelBoard searchValue, ModelBoard updateValue) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBoard(ModelBoard board) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ModelBoard getBoardSearch(ModelBoard board) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelBoard getBoardPaging(ModelBoard board, int start, int end) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertBoardList(List<ModelBoard> board) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ModelComments getComment(int commentNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelComments getCommentList(int articleNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertComment(ModelComments comment) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateComment(ModelComments searchValue, ModelComments updateValue) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteComment(ModelComments comment) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getArticleTotalRecord(HashMap boardcd) throws Exception {
		int result = -1;
		
		result = session.insert("mapper.mapperBoard.getArticleTotalRecord", boardcd);
		
		return result;
	}

	@Override
	public int getArticleList(HashMap boardcd, HashMap searchWord, HashMap start, HashMap end) throws Exception {
		int result = -1;
		 Map<String, Object> map = new HashMap<String, Object>();
		 map.put("boardcd", boardcd);
		 map.put("searchWord", searchWord);
		 map.put("start", start);
		 map.put("end", end);
		 result = session.insert("mapper.mapperBoard.getArticleList", map);

				 return result;
	}

	@Override
	public ModelArticle  getArticle(int articleNo) throws Exception {
		ModelArticle result = null;
		 
		 result = session.selectOne("mapper.mapperBoard.getArticle", articleNo);
		 
		 return result;
		 
	}

	@Override
	public int insertArticle(ModelArticle boardcd) throws Exception {
		int result = -1;
		 
		 result = session.insert("mapper.mapperBoard.insertArticle", boardcd);
		
		return result;
	}

	@Override
	public int updateArticle(ModelArticle wherearticle, ModelArticle setarticle) throws Exception {
		int result = -1;
		Map<String, ModelArticle> map = new HashMap<String, ModelArticle>();
		map.put("wherearticle", wherearticle);
		map.put("setarticle", setarticle);
        result = session.update("mapper.mapperBoard.updateArticle", map);

        return result;
	}

	@Override
	public int deleteArticle(ModelArticle articleNo) throws Exception {
		int result = -1;

        result = session.delete("mapper.mapperBoard.deleteArticle", articleNo);

        return result;
	}

	@Override
	public int increaseHit(int articleNo) throws Exception {
		int result = -1;
		 
		 result = session.update("mapper.mapperBoard.increaseHit", articleNo);
		 
		 return result;
	}

	@Override
	public	List<ModelArticle> getNextArticle(ModelArticle boardcd) throws Exception {
		List<ModelArticle> result = null;
		 
		 result = session.selectList("mapper.mapperBoard.getNextArticle", boardcd);

	        return result;
	}

	@Override
	public List<ModelArticle> getPrevArticle(ModelArticle boardcd) throws Exception {
		List<ModelArticle> result = null;
		 
		 result = session.selectList("mapper.mapperBoard.getPrevArticle", boardcd);

	        return result;
	}

	@Override
	public ModelAttachfile getAttachFile(int attachFileNo) throws Exception {
		ModelAttachfile result = null;
		 
		 result = session.selectOne("mapper.mapperBoard.getAttachFile", attachFileNo);
		 
		 return result;
	}

	@Override
	public List<ModelAttachfile> getAttachFileList(int articleNo) throws Exception {
		List<ModelAttachfile> result = null;
		 
		 result = session.selectList("mapper.mapperBoard.getAttachFileList", articleNo);

	        return result;
	}

	@Override
	public int insertAttachFile(ModelAttachfile filename) throws Exception {
		int result = -1;
		 
		 result = session.insert("mapper.mapperBoard.ModelAttachfile", filename);
		
		return result;
	}

	@Override
	public int deleteAttachFile(ModelAttachfile attachfileno) throws Exception {
    	int result = -1;

        result = session.delete("mapper.mapperBoard.deleteAttachFile", attachfileno);

        return result;
	}

}
