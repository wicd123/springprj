package java24.mybatis;

import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.board.infc.IServiceBoard;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachfile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

public class ServiceBoardTest {
	
	private static IServiceBoard service = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

        try {
			// classpath 를 이용한 설정 파일 로딩
			ApplicationContext context = new
					ClassPathXmlApplicationContext("classpath:java24/board/ApplicationContext.xml");
			//java.io.File log4jfile = new java.io.File("src/main/resources/ApplicationContext.xml");
			 //ApplicationContext context = new
			        //ClassPathXmlApplicationContext(log4jfile.getAbsolutePath());

			service = context.getBean("serviceboard", IServiceBoard.class);
		} catch (Exception e) {
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

/*	@Test
	public void testGetArticleTotalRecord()  throws Exception {
		HashMap boardcd = new HashMap();
		boardcd.set("testbook,1");
        int result = service.insert(boardcd);
        assertSame(result, 1);
    }*/

/*	@Test
	public void testGetArticleList()  throws Exception{
		
	}*/

/*	@Test
	public void testGetArticle()  throws Exception {
		int articleNo = 0;
		ModelArticle result = service.getArticle(articleNo);
	}*/

	@Test
	public void testInsertArticle()  throws Exception {
		ModelArticle boardcd = new ModelArticle();
		boardcd.setArticleno(1);
        int result = service.insertArticle(boardcd);
        assertSame(result, 1);
	}

	@Test
	public void testUpdateArticle()   throws Exception{
		ModelArticle wherearticle = new ModelArticle();
		wherearticle.setArticleno(1);
	        
	       ModelArticle setarticle = new ModelArticle();
	       setarticle.setArticleno(1);
	        
	        int result = service.updateArticle(wherearticle, setarticle);
	        assertSame(result, 5);
	}

	@Test
	public void DeleteArticle()  throws Exception {
		ModelArticle articleNo = new ModelArticle();
		articleNo.setArticleno(1);
		
        int result = service.deleteArticle(articleNo);
        assertSame(result, 13);
	}
	


	@Test
	public void testIncreaseHit()  throws Exception {
		int articleNo = 0;
        int result = service.increaseHit(articleNo);
       // assertSame(result.size(), 4);
	}

	@Test
	public void testGetNextArticle()  throws Exception {
		ModelArticle boardcd = new ModelArticle();
		boardcd.setArticleno(1);
		
		 List<ModelArticle> result = service.getNextArticle(boardcd);
	     assertSame(result.size(), 1);
	}

	@Test
	public void testGetPrevArticle()  throws Exception{
		ModelArticle boardcd = new ModelArticle();
		boardcd.setArticleno(1);
		
		 List<ModelArticle> result = service.getPrevArticle(boardcd);
	     assertSame(result.size(), 1);
	}

	/*@Test
	public void testGetAttachFile()  throws Exception {
		int articleNo = 2;
		ModelAttachfile result = service.getAttachFileList(articleNo);
        assertSame(result.size(), 4);
	}*/

	@Test
	public void testGetAttachFileList()  throws Exception {
		ModelAttachfile filename = new ModelAttachfile();
		filename.setAttachfileno(2);
		
        int result = service.insertAttachFile(filename);
        assertSame(result, 1);
	}

	@Test
	public void testInsertAttachFile() throws Exception {
		ModelAttachfile filename = new ModelAttachfile();
		filename.setAttachfileno(2);
		
        int result = service.insertAttachFile(filename);
        assertSame(result, 1);
	}

	@Test
	public void testDeleteAttachFile()  throws Exception{
		ModelAttachfile attachfileno = new ModelAttachfile();
		attachfileno.setAttachfileno(2);
        int result = service.deleteAttachFile(attachfileno);
        assertSame(result, 1);
    }
}
