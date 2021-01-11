package com.example.demo.cmm.utl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import com.example.demo.cmm.service.CommonMapper;
import lombok.Data;
import static com.example.demo.cmm.utl.Util.*;

import java.util.function.Function;

@Component("page") @Data @Lazy
public class Pagination {
	@Autowired CommonMapper mapper;
	private int totalCount, startRow, endRow,
				pageCount, pageSize,  startPage, endPage, pageNum,
				blockCount, prevBlock, nextBlock, blockNum;
	
	public final int BLOCK_SIZE = 5;
	private String tname;
	
	public void execute() {
		totalCount = mapper.count(tname);
		pageCount = (totalCount % pageSize != 0) ? totalCount / pageSize + 1: totalCount / pageSize;
		blockCount = (pageCount % BLOCK_SIZE != 0) ? pageCount / BLOCK_SIZE + 1: pageCount / BLOCK_SIZE;
		startRow = (pageNum - 1) * pageSize;
		// endRow = () ? : ;
		startPage = 0;
		endPage = 0;
		
		
		
	}
	
	
}
