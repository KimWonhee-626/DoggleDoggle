package com.example.dgBoard.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.dgBoard.model.dgBoardVo;

@Mapper

public interface dgBoardMapper {

	List<dgBoardVo> dgNoticeBoardList();
	
}
