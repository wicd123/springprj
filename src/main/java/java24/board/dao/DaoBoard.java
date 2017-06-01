package java24.board.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java24.board.infc.IDaoBoard;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachfile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

@Repository("daoboard")
public class DaoBoard implements IDaoBoard {
    
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;
    
    @Override
    public List<String> getBoardName(String boardcd) throws Exception {
        List<String> result = null;
        result = session.selectList("mapper.mysql.mapperBoard.getBoardName", boardcd);
        return result;
    }
    
    @Override
    public List<ModelBoard> getBoardOne(String boardcd) throws Exception {
        List<ModelBoard> result = null;
        result = session.selectList("mapper.mysql.mapperBoard.getBoardOne", boardcd);
        return result;
    }
    
    @Override
    public List<ModelBoard> getBoardList() throws Exception {
        List<ModelBoard> result = null;
        result = session.selectList("mapper.mysql.mapperBoard.getBoardList");
        return result;
    }
    
    @Override
    public List<ModelBoard> getBoardListResultMap() throws Exception {
        List<ModelBoard> result = null;
        result = session.selectList("mapper.mysql.mapperBoard.getBoardListResultMap");
        return result;
    }
    
    @Override
    public List<HashMap<String, Object>> getBoardCustomMap()
            throws Exception {
        List<HashMap<String, Object>> result = null;
        result = session.selectList("mapper.mysql.mapperBoard.getBoardListResultMap");
        return result;
    }
    
    @Override
    public int insertBoard(ModelBoard board) throws Exception {
        int result = session.insert("mapper.mysql.mapperBoard.insertBoard", board);
        return result;
    }
    
    @Override
    public int updateBoard(ModelBoard searchValue, ModelBoard updateValue)
            throws Exception {
        HashMap<String, ModelBoard> hashmap =  new HashMap();
        hashmap.put("searchValue", searchValue);
        hashmap.put("updateValue", updateValue);
        int result = session.update("mapper.mysql.mapperBoard.updateBoard", hashmap);
        return result;
    }
    
    @Override
    public int deleteBoard(ModelBoard board) throws Exception {
        int result = session.delete("mapper.mysql.mapperBoard.deleteBoard", board);
        return result;
    }
    
    @Override
    public List<ModelBoard> getBoardSearch(ModelBoard board) throws Exception {
        List<ModelBoard> result = null;
        result = session.selectList("mapper.mysql.mapperBoard.getBoardSearch", board);
        return result;
    }
    
    @Override
    public List<ModelBoard> getBoardPaging(String boardcd, String searchWord, int start, int end)
            throws Exception {
        List<ModelBoard> result = null;
        HashMap<String, Object> map = new HashMap();
        map.put("boardcd", boardcd);
        map.put("searchWord", searchWord);
        map.put("start", start);
        map.put("end", end);
        result = session.selectList("mapper.mysql.mapperBoard.getBoardPaging", map);
        return result;
    }
    
    @Override
    public int insertBoardList(List<ModelBoard> board) throws Exception {
        int result = -1;
        result = session.insert("mapper.mysql.mapperBoard.insertBoardList", board);
        return result;
    }
    
    @Override
    public List<ModelComments> getComment(int commentNo) throws Exception {
        List<ModelComments> result = null;
        result = session.selectList("mapper.mysql.mapperBoard.getComment", commentNo);
        return result;
    }
    
    @Override
    public List<ModelComments> getCommentList(int articleNo) throws Exception {
        List<ModelComments> result = null;
        result = session.selectList("mapper.mysql.mapperBoard.getCommentList", articleNo);
        return result;
    }
    
    @Override
    public int insertComment(ModelComments comment) throws Exception {
        int result = -1;
        result = session.insert("mapper.mysql.mapperBoard.insertComment", comment);
        return result;
    }
    
    @Override
    public int updateComment(ModelComments searchValue,
            ModelComments updateValue) throws Exception {
        int result = -1;
        HashMap<String, ModelComments> map = new HashMap();
        map.put("searchValue", searchValue);
        map.put("updateValue", updateValue);
        result = session.update("mapper.mysql.mapperBoard.updateComment", map);
        return result;
    }
    
    @Override
    public int deleteComment(ModelComments comment) throws Exception {
        int result = -1;
        result = session.delete("mapper.mysql.mapperBoard.deleteComment",comment);
        return result;
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
