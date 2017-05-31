package java24.board.service;

import java.util.HashMap;
import java.util.List;

import java24.board.infc.IServiceBoard;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachfile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

public class ServiceBoard implements IServiceBoard {
    
    @Override
    public String getBoardName(String boardcd) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ModelBoard getBoardOne(String boardcd) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public List<ModelBoard> getBoardList() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public List<ModelBoard> getBoardListResultMap() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public List<HashMap<String, ModelBoard>> getBoardCustomMap() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int insertBoard(ModelBoard board) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int updateBoard(ModelBoard searchValue, ModelBoard updateValue) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int deleteBoard(ModelBoard board) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public ModelBoard getBoardSearch(ModelBoard board) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ModelBoard getBoardPaging(ModelBoard board, int start, int end) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int insertBoardList(List<ModelBoard> board) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public ModelComments getComment(int commentNo) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ModelComments getCommentList(int articleNo) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int insertComment(ModelComments comment) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int updateComment(ModelComments searchValue,
            ModelComments updateValue) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int deleteComment(ModelComments comment) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int getArticleTotalRecord(HashMap boardcd) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public List<ModelBoard> getArticleList(HashMap boardcd) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ModelArticle getArticle(int articleNo) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int insertArticle(ModelArticle boardcd) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int updateArticle(HashMap updateValue) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int deleteArticle(ModelArticle boardcd) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int increaseHit(int articleNo) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public ModelArticle getNextArticle(HashMap boardcd) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ModelArticle getPrevArticle(HashMap boardcd) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public ModelAttachfile getAttachFile(int attachFileNo) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public List<ModelBoard> getAttachFileList(int articleNo) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int insertAttachFile(ModelAttachfile filename) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int deleteAttachFile(ModelAttachfile attachfileno) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
