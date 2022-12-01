package dao;

import java.sql.Connection;

import dto.Board;

public class BoardDao {

	public void insert(Board board, Connection conn) {
		System.out.println("DB에 board 정보를 저장했습니다.");
	}

}
