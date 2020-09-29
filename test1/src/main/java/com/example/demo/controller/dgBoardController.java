package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dgBoard.mapper.dgBoardMapper;
import com.example.dgBoard.model.dgBoardVo;

@Controller
@EnableAutoConfiguration

public class dgBoardController {

    @Autowired
    dgBoardMapper dgBoardMapper;
    
    @RequestMapping(value = "/dgNoticeBoard")
      public String dgNoticeBoardList(Model model) {
       List<dgBoardVo> dgNoticeBoardList = dgBoardMapper.dgNoticeBoardList();
       model.addAttribute("dgNoticeBoardList",dgNoticeBoardList);
        System.out.println(dgNoticeBoardList.toString()); 
       return "dgNoticeBoard";
      }
   
   
   
}