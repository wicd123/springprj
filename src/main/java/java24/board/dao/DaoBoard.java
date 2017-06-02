package java24.board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        result = session.selectList("mapper.mysql.mapperBoard.getBoardName",
                boardcd);
        return result;
    }
    
    @Override
    public List<ModelBoard> getBoardOne(String boardcd) throws Exception {
        List<ModelBoard> result = null;
        result = session.selectList("mapper.mysql.mapperBoard.getBoardOne",
                boardcd);
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
        result = session
                .selectList("mapper.mysql.mapperBoard.getBoardListResultMap");
        return result;
    }
    
    @Override
    public List<HashMap<String, Object>> getBoardCustomMap() throws Exception {
        List<HashMap<String, Object>> result = null;
        result = session
                .selectList("mapper.mysql.mapperBoard.getBoardListResultMap");
        return result;
    }
    
    @Override
    public int insertBoard(ModelBoard board) throws Exception {
        int result = session.insert("mapper.mysql.mapperBoard.insertBoard",
                board);
        return result;
    }
    
    @Override
    public int updateBoard(ModelBoard searchValue, ModelBoard updateValue)
            throws Exception {
        HashMap<String, ModelBoard> hashmap = new HashMap();
        hashmap.put("searchValue", searchValue);
        hashmap.put("updateValue", updateValue);
        int result = session.update("mapper.mysql.mapperBoard.updateBoard",
                hashmap);
        return result;
    }
    
    @Override
    public int deleteBoard(ModelBoard board) throws Exception {
        int result = session.delete("mapper.mysql.mapperBoard.deleteBoard",
                board);
        return result;
    }
    
    @Override
    public List<ModelBoard> getBoardSearch(ModelBoard board) throws Exception {
        List<ModelBoard> result = null;
        result = session.selectList("mapper.mysql.mapperBoard.getBoardSearch",
                board);
        return result;
    }
    
    @Override
    public List<ModelBoard> getBoardPaging(String boardcd, String searchWord,
            int start, int end) throws Exception {
        List<ModelBoard> result = null;
        HashMap<String, Object> map = new HashMap();
        map.put("boardcd", boardcd);
        map.put("searchWord", searchWord);
        map.put("start", start);
        map.put("end", end);
        result = session.selectList("mapper.mysql.mapperBoard.getBoardPaging",
                map);
        return result;
    }
    
    @Override
    public int insertBoardList(List<ModelBoard> board) throws Exception {
        int result = -1;
        result = session.insert("mapper.mysql.mapperBoard.insertBoardList",
                board);
        return result;
    }
    
    @Override
    public List<ModelComments> getComment(int commentNo) throws Exception {
        List<ModelComments> result = null;
        result = session.selectList("mapper.mysql.mapperBoard.getComment",
                commentNo);
        return result;
    }
    
    @Override
    public List<ModelComments> getCommentList(int articleNo) throws Exception {
        List<ModelComments> result = null;
        result = session.selectList("mapper.mysql.mapperBoard.getCommentList",
                articleNo);
        return result;
    }
    
    @Override
    public int insertComment(ModelComments comment) throws Exception {
        int result = -1;
        result = session.insert("mapper.mysql.mapperBoard.insertComment",
                comment);
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
        result = session.delete("mapper.mysql.mapperBoard.deleteComment",
                comment);
        return result;
    }
    
    @Override
    public int getArticleTotalRecord(HashMap boardcd) throws Exception {
        int result = -1;
        
        result = session.insert("mapper.mapperBoard.getArticleTotalRecord",
                boardcd);
        
        return result;
    }
    
    @Override
    public int getArticleList(HashMap boardcd, HashMap searchWord,
            HashMap start, HashMap end) throws Exception {
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
    public ModelArticle getArticle(int articleNo) throws Exception {
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
    public int updateArticle(ModelArticle wherearticle, ModelArticle setarticle)
            throws Exception {
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
    public List<ModelArticle> getNextArticle(ModelArticle boardcd)
            throws Exception {
        List<ModelArticle> result = null;
        
        result = session.selectList("mapper.mapperBoard.getNextArticle",
                boardcd);
        
        return result;
    }
    
    @Override
    public List<ModelArticle> getPrevArticle(ModelArticle boardcd)
            throws Exception {
        List<ModelArticle> result = null;
        
        result = session.selectList("mapper.mapperBoard.getPrevArticle",
                boardcd);
        
        return result;
    }
    
    @Override
    public ModelAttachfile getAttachFile(int attachFileNo) throws Exception {
        ModelAttachfile result = null;
        
        result = session.selectOne("mapper.mapperBoard.getAttachFile",
                attachFileNo);
        
        return result;
    }
    
    @Override
    public List<ModelAttachfile> getAttachFileList(int articleNo)
            throws Exception {
        List<ModelAttachfile> result = null;
        
        result = session.selectList("mapper.mapperBoard.getAttachFileList",
                articleNo);
        
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
        
        result = session.delete("mapper.mapperBoard.deleteAttachFile",
                attachfileno);
        
        return result;
    }
    
}
