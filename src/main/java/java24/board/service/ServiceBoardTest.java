package java24.board.service;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.board.infc.IServiceBoard;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

public class ServiceBoardTest {
    public static IServiceBoard service = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("classpath:Java24/board/ApplicationContext.xml");

//        ApplicationContext context = new ClassPathXmlApplicationContext(log4jfile.getAbsolutePath());
            service = context.getBean("serviceboard", IServiceBoard.class);
        } catch (Exception e) {
            // TODO Auto-generated catch block
             e.printStackTrace();
        }
    }
    
    @Test
    public void testGetBoardName() throws Exception {
        List<String> result = service.getBoardName("data");
        assertSame(result.size(), 1);
    }
    
    @Test
    public void testGetBoardOne() throws Exception {
        List<ModelBoard> result;
        result = service.getBoardOne("data");
        assertSame(result.size(), 1);
    }
    
    @Test
    public void testGetBoardList() throws Exception {
        List<ModelBoard> result;
        result = service.getBoardList();
        assertSame(result.size(), 3);
    }
    
    @Test
    public void testGetBoardListResultMap() throws Exception {
        List<ModelBoard> result;
        result = service.getBoardListResultMap();
        assertSame(result.size(), 3);
    }
    
    @Test
    public void testGetBoardCustomMap() throws Exception {
        List<HashMap<String, Object>> result;
        result = service.getBoardCustomMap();
        assertSame(result.size(), 3);
    }
    
    @Test
    public void testInsertBoard() throws Exception {
        ModelBoard board = new ModelBoard();
        board.setBoardcd("AA");
        board.setBoardnm("aaa");
        board.setUseYN(true);
        int result = service.insertBoard(board);
        assertSame(result, 1);
    }
    
    @Test
    public void testUpdateBoard() throws Exception {
        ModelBoard searchValue = new ModelBoard();
        ModelBoard updateValue = new ModelBoard();
        searchValue.setBoardnm("aaa");
        updateValue.setBoardcd("aa");
        updateValue.setBoardnm("AAA");
        updateValue.setUseYN(false);
        
        int result = service.updateBoard(searchValue, updateValue);
        assertSame(result, 1);
    }
    
    @Test
    public void testDeleteBoard() throws Exception {
        ModelBoard board = new ModelBoard();
        board.setBoardnm("AAA");
        int result = service.deleteBoard(board);
        assertSame(result, 1);
    }
    
    @Test
    public void testGetBoardSearch() throws Exception {
        ModelBoard board = new ModelBoard();
        board.setBoardnm("자료실");
        List<ModelBoard> result = service.getBoardSearch(board);
        assertSame(result.size(), 1);
    }
    
    @Test
    public void testGetBoardPaging() throws Exception {
        String boardnm = "자료실";
        List<ModelBoard> result = service.getBoardPaging("", boardnm, 1, 2);
        assertSame(result.size(), 1);
    }
    
    @Test
    public void testInsertBoardList() throws Exception {
        List<ModelBoard> board = new ArrayList();
        ModelBoard board1 = new ModelBoard();
        ModelBoard board2 = new ModelBoard();
        board1.setBoardcd("A");
        board1.setBoardnm("AA");
        board1.setUseYN(true);
        
        board2.setBoardcd("B");
        board2.setBoardnm("BB");
        board2.setUseYN(true);
        board.add(board1);
        board.add(board2);
        int result = service.insertBoardList(board);
        assertSame(result, 2);
           
    }
    
    @Test
    public void testGetComment() throws Exception {
        List<ModelComments> result = service.getComment(1);
        assertSame(result.size(), 1);
    }
    
    @Test
    public void testGetCommentList() throws Exception {
        List<ModelComments> result = service.getCommentList(1);
        assertSame(result.size(), 1);
    }
    
    @Test
    public void testInsertComment() throws Exception {
        ModelComments comment = new ModelComments();
        comment.setArticleno(2);
        int result = service.insertComment(comment);
        assertSame(result, 1);
    }
    
    @Test
    public void testUpdateComment() throws Exception {
        ModelComments searchValue = new ModelComments();
        ModelComments updateValue = new ModelComments();
        searchValue.setArticleno(2);
        updateValue.setMemo("updated");
        int result = service.updateComment(searchValue, updateValue);
        assertSame(result, 1);
    }
    
    @Test
    public void testDeleteComment() throws Exception {
        ModelComments comment = new ModelComments();
        comment.setArticleno(2);
        int result = service.deleteComment(comment);
        assertSame(result, 1);
    }
    
    @Test
    public void testGetArticleTotalRecord() throws Exception {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetArticleList() throws Exception {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetArticle() throws Exception {
        fail("Not yet implemented");
    }
    
    @Test
    public void testInsertArticle() throws Exception {
        fail("Not yet implemented");
    }
    
    @Test
    public void testUpdateArticle() throws Exception {
        fail("Not yet implemented");
    }
    
    @Test
    public void testDeleteArticle() throws Exception {
        fail("Not yet implemented");
    }
    
    @Test
    public void testIncreaseHit() throws Exception {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetNextArticle() throws Exception {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetPrevArticle() throws Exception {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetAttachFile() throws Exception  {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetAttachFileList() throws Exception {
        fail("Not yet implemented");
    }
    
    @Test
    public void testInsertAttachFile() throws Exception  {
        fail("Not yet implemented");
    }
    
    @Test
    public void testDeleteAttachFile() throws Exception {
        fail("Not yet implemented");
    }
    
}
