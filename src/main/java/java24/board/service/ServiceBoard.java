package java24.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java23.mybatis.infc.IDaoBook;
import java23.mybatis.model.ModelBook;
import java23.mybatis.service.ServiceBook;
import java24.board.infc.IBoard;
import java24.board.infc.IDaoBoard;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachfile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;


@Service("serviceboard")
public class ServiceBoard implements IBoard {
	
	 private static Logger log = LoggerFactory.getLogger(ServiceBoard.class);
	
	  @Autowired
	  @Qualifier("daoboard")
	  private IDaoBoard dao;
	  
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
		try{
			result = dao.getArticleTotalRecord(boardcd);
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int getArticleList(HashMap boardcd, HashMap searchWord, HashMap start, HashMap end) throws Exception {
		int result =-1;
        try {
            result = dao.getArticleList(boardcd, searchWord, start, end);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

	@Override
	public ModelArticle getArticle(int articleNo) throws Exception {
		ModelArticle result = null;
		try{
			result = dao.getArticle(articleNo);
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int insertArticle(ModelArticle boardcd) throws Exception {
		int result = -1;
		try{
			result = dao.insertArticle(boardcd);
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int updateArticle(ModelArticle wherearticle, ModelArticle setarticle) throws Exception {
		int result = -1;
        try {
            result = dao.updateArticle(wherearticle, setarticle);
        } catch (Exception e) {
        	e.printStackTrace();
           //logger.error( " insert " + e.getMessage() );
        }
        return result;
    }

	@Override
	public int deleteArticle(ModelArticle articleNo) throws Exception {
		int result = -1;
        try {
            result = dao.deleteArticle(articleNo);
        } catch (Exception e) {
        	e.printStackTrace();
           //logger.error( " update " + e.getMessage() );
        }
        return result;
    }

	@Override
	public int increaseHit(int articleNo) throws Exception {
		int result = -1;
        try {
            result = dao.increaseHit(articleNo);
        } catch (Exception e) {
        	e.printStackTrace();
           //logger.error( " insert " + e.getMessage() );
        }
        return result;
    }

	@Override
	public	List<ModelArticle> getNextArticle(ModelArticle boardcd) throws Exception {
		List<ModelArticle> result = null;
        try {
            result = dao.getNextArticle(boardcd);
        } catch (Exception e) {
        	e.printStackTrace();
        	 //logger.error( " selectEqual " + e.getMessage() );
        }
        return result;
    }

	@Override
	public List<ModelArticle> getPrevArticle(ModelArticle boardcd) throws Exception {
		List<ModelArticle> result = null;
        try {
            result = dao.getPrevArticle(boardcd);
        } catch (Exception e) {
        	e.printStackTrace();
        	 //logger.error( " selectEqual " + e.getMessage() );
        }
        return result;
	}

	@Override
	public ModelAttachfile getAttachFile(int attachFileNo) throws Exception {
		ModelAttachfile result = null;
        try {
            result = dao.getAttachFile(attachFileNo);
        } catch (Exception e) {
        	e.printStackTrace();
           //logger.error( " insert " + e.getMessage() );
        }
        return result;
    }

	@Override
	public List<ModelAttachfile> getAttachFileList(int articleNo) throws Exception {
		List<ModelAttachfile> result = null;
        try {
            result = dao.getAttachFileList(articleNo);
        } catch (Exception e) {
        	e.printStackTrace();
        	 //logger.error( " selectEqual " + e.getMessage() );
        }
        return result;
	}

	@Override
	public int insertAttachFile(ModelAttachfile filename) throws Exception {
		int result = -1;
        try {
            result = dao.insertAttachFile(filename);
        } catch (Exception e) {
        	e.printStackTrace();
           //logger.error( " insert " + e.getMessage() );
        }
        return result;
    }

	@Override
	public int deleteAttachFile(ModelAttachfile attachfileno) throws Exception {
		int result = -1;
        try {
            result = dao.deleteAttachFile(attachfileno);
        } catch (Exception e) {
        	e.printStackTrace();
           //logger.error( " insert " + e.getMessage() );
        }
        return result;
    }

}
