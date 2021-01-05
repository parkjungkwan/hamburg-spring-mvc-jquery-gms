package com.example.demo.cmm.utl;

import java.util.function.BiFunction;
import static com.example.demo.cmm.utl.Util.*;

public class DummyGenerator {
	
	/**
	 * 1970 ~ 2000 사이의 랜덤한 연도수 뽑기 
	 * 
	 * 윤년은 해당 연도를 4로 나눈 값이 0인 것을 의미한다. 
	 * && 그중 100으로 나눈 값이 0인 것은 윤년에서 제외하나, 
	 * || 400으로 나눈 값이 0인 것은 윤년으로 포함된다. 
	 * 그 외의 나머지 연도는 평년이다.
	 * */
	public String makeBirthday() {
		int year = rangeRandom.apply(1970, 2000);
		int month = rangeRandom.apply(1, 13);
		int date = 0;
		switch(month) {
		case 2: date = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 29 : 28;
		case 1: case  3:case  5:case  7:case  8:case  10:case  12: date = 31;
		case 4: case  6:case  9:case  11:date = 31;		
		}
		return year+"-"+month+"-"+date;
	}
}
