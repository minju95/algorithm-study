package this_is_java;

public class DongWon {

	public static void main(String[] args) {
		String join_date ="2020/02/02 TUE";
		String resign_date = "2030/08/04";
		
		//연도만 추출
		String join_year_str = join_date.substring(0, 4);
		int join_years = Integer.parseInt(join_year_str);
		
		//입사월만 추출
		String join_month_str = join_date.substring(5, 7);
		int join_month = Integer.parseInt(join_month_str);
		System.out.println(join_month);
		
		//입사일만 추출
		String join_date_str = join_date.substring(8, 10);
		int join_date_only = Integer.parseInt(join_date_str);
		
		
		int lastDays = 0;
		
		switch(join_month) {
			case 1: case 3: case 5: case 7: case 8:
			case 10: case 12:
				lastDays=31;
				break;
			case 4: case 6: case 9: case 11:
				lastDays=30;
				break;
			case 2:
				//윤년인 경우
				if((join_years%4 == 0 && join_years%100 != 0) || join_years%400 == 0) {
					lastDays=29;
				//윤년이 아닌 경우
				} else lastDays=28;
				break;
		}
		
		int firstJoinDays = lastDays - join_date_only +1;
		System.out.println(firstJoinDays);
		
		//입사일 다음 달 1일부터 입사연도의 12월 31일까지의 일 수 구하기
		int join_nextMonth = join_month+1;
		System.out.println(join_nextMonth);
		
		//3월부터 12월까지의 월 수 (10)
		int restOfMonths = 12 - join_nextMonth;
		
		
	}

}
