package com.naver.s1.board;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*@Getter	//getter메서드
@Setter //setter메서드
@ToString //toString 오버라이딩
@NoArgsConstructor //default 생성자
@AllArgsConstructor //매개변수 생성자
@RequiredArgsConstructor //필수 매개변수만 있는 생성자 생성
@EqualsAndHashCode //hash, equals 메서드
*/
@Data //위 다섯개 포함된 어노테이션
public class BoardVO {
	private Long num;
	private String title;
	private String writer;
	private String contents;
	private Date regDate;
	private Long hit;
	

}
