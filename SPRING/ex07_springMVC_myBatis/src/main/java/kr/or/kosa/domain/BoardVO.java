package kr.or.kosa.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

// VO(Value Object) == TO == DTO
@Getter
@Setter
public class BoardVO { // Model
	
	/*
	 * seq number, title varchar2(50), writer varchar2(30), content varchar2(2000),
	 * regdate date, readcount number, constraint board_seq_pk primary key (seq)
	 */
    
	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private int readCount;

}
