package java24.board.service;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import Java23.mybatis.service.ServiceBook;
import java24.board.infc.IDaoBoard;
import java24.board.infc.IServiceBoard;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachfile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

@Repository("serviceboard")
public class ServiceBoard implements IServiceBoard {
    private static Logger log = LoggerFactory.getLogger(ServiceBook.class);
    
    @Autowired
    @Qualifier("daoboard")
    private IDaoBoard     dao;
    
    @Override
    public List<String> getBoardName(String boardcd) throws Exception {
        List<String> result = null;
        try {
            result = dao.getBoardName(boardcd);
        } catch (Exception e) {
            log.error("getBoardName " + e.getMessage());
        }
        return result;
    }
    
    @Override
    public List<ModelBoard> getBoardOne(String boardcd) throws Exception {
        List<ModelBoard> result = null;
        try {
            result = dao.getBoardOne(boardcd);
        } catch (Exception e) {
            log.error("getBoardOne " + e.getMessage());
        }
        return result;
    }
    
    @Override
    public List<ModelBoard> getBoardList() throws Exception {
        List<ModelBoard> result = null;
        try {
            result = dao.getBoardList();
        } catch (Exception e) {
            log.error("getBoardList " + e.getMessage());
        }
        return result;
    }
    
    @Override
    public List<ModelBoard> getBoardListResultMap() throws Exception {
        List<ModelBoard> result = null;
        try {
            result = dao.getBoardListResultMap();
        } catch (Exception e) {
            log.error("getBoardListResultMap " + e.getMessage());
        }
        return result;
    }
    
    @Override
    public List<HashMap<String, Object>> getBoardCustomMap() throws Exception {
        List<HashMap<String, Object>> result = null;
        try {
            result = dao.getBoardCustomMap();
        } catch (Exception e) {
            log.error("getBoardCustomMap " + e.getMessage());
        }
        return result;
    }
    
    @Override
    public int insertBoard(ModelBoard board) throws Exception {
        int result = -1;
        try {
            result = dao.insertBoard(board);
        } catch (Exception e) {
            log.error("insertBoard " + e.getMessage());
        }
        return result;
    }
    
    @Override
    public int updateBoard(ModelBoard searchValue, ModelBoard updateValue)
            throws Exception {
        // TODO Auto-generated method stub
        int result = -1;
        try {
            result = dao.updateBoard(searchValue, updateValue);
        } catch (Exception e) {
            log.error("updateBoard " + e.getMessage());
        }
        return result;
    }
    
    @Override
    public int deleteBoard(ModelBoard board) throws Exception {
        // TODO Auto-generated method stub
        int result = -1;
        try {
            result = dao.deleteBoard(board);
        } catch (Exception e) {
            log.error("deleteBoard " + e.getMessage());
        }
        return result;
    }
    
    @Override
    public List<ModelBoard> getBoardSearch(ModelBoard board) throws Exception {
        List<ModelBoard> result = null;
        try {
            result = dao.getBoardSearch(board);
        } catch (Exception e) {
            log.error("getBoardSearch " + e.getMessage());
        }
        return result;
    }
    
    @Override
    public List<ModelBoard> getBoardPaging(String boardcd, String searchWord,
            int start, int end) throws Exception {
        List<ModelBoard> result = null;
        try {
            result = dao.getBoardPaging(boardcd, searchWord, start, end);
        } catch (Exception e) {
            log.error("getBoardPaging " + e.getMessage());
        }
        return result;
    }
    
    @Override
    public int insertBoardList(List<ModelBoard> board) throws Exception {
        int result = -1;
        try {
            result = dao.insertBoardList(board);
        } catch (Exception e) {
            log.error("insertBoardList " + e.getMessage());
        }
        return result;
    }
    
    @Override
    public List<ModelComments> getComment(int commentNo) throws Exception {
        List<ModelComments> result = null;
        try {
            result = dao.getComment(commentNo);
        } catch (Exception e) {
            log.error("getComment " + e.getMessage());
        }
        return result;
    }
    
    @Override
    public List<ModelComments> getCommentList(int articleNo) throws Exception {
        List<ModelComments> result = null;
        try {
            result = dao.getCommentList(articleNo);
        } catch (Exception e) {
            log.error("getCommentList " + e.getMessage());
        }
        return result;
    }
    
    @Override
    public int insertComment(ModelComments comment) throws Exception {
        int result = -1;
        try {
            result = dao.insertComment(comment);
        } catch (Exception e) {
            log.error("insertComment " + e.getMessage());
        }
        return result;
    }
    
    @Override
    public int updateComment(ModelComments searchValue,
            ModelComments updateValue) throws Exception {
        int result = -1;
        try {
            result = dao.updateComment(searchValue, updateValue);
        } catch (Exception e) {
            log.error("updateComment " + e.getMessage());
        }
        return result;
    }
    
    @Override
    public int deleteComment(ModelComments comment) throws Exception {
        // TODO Auto-generated method stub
        int result = -1;
        try {
            result = dao.deleteComment(comment);
        } catch (Exception e) {
            log.error("deleteComment " + e.getMessage());
        }
        return result;
    }
    
    @Override
    public int getArticleTotalRecord(HashMap boardcd) throws Exception {
        int result = -1;
        try {
            result = dao.getArticleTotalRecord(boardcd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int getArticleList(HashMap boardcd, HashMap searchWord,
            HashMap start, HashMap end) throws Exception {
        int result = -1;
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
        try {
            result = dao.getArticle(articleNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int insertArticle(ModelArticle boardcd) throws Exception {
        int result = -1;
        try {
            result = dao.insertArticle(boardcd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public int updateArticle(ModelArticle wherearticle, ModelArticle setarticle)
            throws Exception {
        int result = -1;
        try {
            result = dao.updateArticle(wherearticle, setarticle);
        } catch (Exception e) {
            e.printStackTrace();
            // logger.error( " insert " + e.getMessage() );
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
            // logger.error( " update " + e.getMessage() );
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
            // logger.error( " insert " + e.getMessage() );
        }
        return result;
    }
    
    @Override
    public List<ModelArticle> getNextArticle(ModelArticle boardcd)
            throws Exception {
        List<ModelArticle> result = null;
        try {
            result = dao.getNextArticle(boardcd);
        } catch (Exception e) {
            e.printStackTrace();
            // logger.error( " selectEqual " + e.getMessage() );
        }
        return result;
    }
    
    @Override
    public List<ModelArticle> getPrevArticle(ModelArticle boardcd)
            throws Exception {
        List<ModelArticle> result = null;
        try {
            result = dao.getPrevArticle(boardcd);
        } catch (Exception e) {
            e.printStackTrace();
            // logger.error( " selectEqual " + e.getMessage() );
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
            // logger.error( " insert " + e.getMessage() );
        }
        return result;
    }
    
    @Override
    public List<ModelAttachfile> getAttachFileList(int articleNo)
            throws Exception {
        List<ModelAttachfile> result = null;
        try {
            result = dao.getAttachFileList(articleNo);
        } catch (Exception e) {
            e.printStackTrace();
            // logger.error( " selectEqual " + e.getMessage() );
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
            // logger.error( " insert " + e.getMessage() );
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
            // logger.error( " insert " + e.getMessage() );
        }
        return result;
    }
    
}
