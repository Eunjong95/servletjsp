package service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.servlet.ServletContext;
import javax.sql.DataSource;

import dao.BoardDao;
import dto.Board;

public class BoardService {
	private ServletContext application;
	private DataSource ds;
	
	public BoardService(ServletContext application) {
		this.application = application;

		try {
			InitialContext ic =new InitialContext();
			ds = (DataSource) ic.lookup("java:comp/env/jdbc/java");					
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void write(Board board) {
		System.out.println("게시물을 저장합니다.");

		BoardDao boardDao = (BoardDao) application.getAttribute("boardDao");
		boardDao.insert(board, null);
	}

	public void write2(Board board) {
		BoardDao boardDao = (BoardDao) application.getAttribute("boardDao");

		Connection conn = null;
		try {
			conn=ds.getConnection();
			boardDao.insert2(board, conn);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}
	}
}