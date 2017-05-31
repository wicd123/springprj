package java24.board.dao;

import java.util.HashMap;
import java.util.List;

import java24.board.infc.IDaoBoard;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachfile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

public class DaoBoard implements IDaoBoard {
    
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
    public List<HashMap<String, ModelBoard>> getBoardCustomMap()
            throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int insertBoard(ModelBoard board) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int updateBoard(ModelBoard searchValue, ModelBoard updateValue)
            throws Exception {
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
    public ModelBoard getBoardPaging(ModelBoard board, int start, int end)
            throws Exception {
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
    public int updateComment(ModelComments searchValue,
            ModelComments updateValue) throws Exception {
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
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public List<ModelBoard> getArticleList(HashMap boardcd) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ModelArticle getArticle(int articleNo) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int insertArticle(ModelArticle boardcd) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int updateArticle(HashMap updateValue) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int deleteArticle(ModelArticle boardcd) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int increaseHit(int articleNo) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public ModelArticle getNextArticle(HashMap boardcd) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ModelArticle getPrevArticle(HashMap boardcd) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ModelAttachfile getAttachFile(int attachFileNo) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public List<ModelBoard> getAttachFileList(int articleNo) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int insertAttachFile(ModelAttachfile filename) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int deleteAttachFile(ModelAttachfile attachfileno) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
