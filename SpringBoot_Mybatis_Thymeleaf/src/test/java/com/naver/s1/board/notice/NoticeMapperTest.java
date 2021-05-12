package com.naver.s1.board.notice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.naver.s1.board.BoardVO;
import com.naver.s1.util.Pager;

@SpringBootTest
class NoticeMapperTest {

	@Autowired
	private NoticeMapper noticeMapper;
	
	@Test
	void getListTest(Pager pager)throws Exception {
	
		List<BoardVO> ar = noticeMapper.getList(pager);
		
		for(BoardVO boardVO:ar) {
			System.out.println(boardVO.toString());
		}
		
		assertNotEquals(0, ar.size());
	}

}
