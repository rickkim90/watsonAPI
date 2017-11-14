package com.n1books.pilot.nlu;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface NLUDAO {

	void insertEmotion(EmotionVO vo) throws Exception;

	@Select("select no, statement, anger, disgust, fear, joy, sadness from tbl_nlu order by no desc ")
	List<EmotionVO> getList() throws Exception;

}
