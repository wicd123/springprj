package java24.mybatis;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.board.infc.IServiceBoard;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachfile;

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
	public void testGetBoardName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBoardOne() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBoardList() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBoardListResultMap() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBoardCustomMap() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertBoard() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateBoard() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteBoard() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBoardSearch() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBoardPaging() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertBoardList() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetComment() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCommentList() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertComment() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateComment() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteComment() {
		fail("Not yet implemented");
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
