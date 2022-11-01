package section16.exam01_java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeCreateExample {

	public static void main(String[] args) {
		/*
		 * java.time 패키지
		 *  - java8부터 추가된 패키지
		 *  - 날짜와 시간을 나타내는 여러가지 API가 새롭게 추가됨
		 *  - 날짜와 시간을 조작하거나 비교하는 기능이 추가됨
		 *  	- Date와 Calender는 날짜와 시간을 조작하거나 비교하는 기능이 불충분
		 *  
		 *  
		 *  
		 *  패키지				설명
		 *  java.time			날짜와 시간을 나타내는 핵심 API인 LocalDate, LocalTime, LocalDateTime, ZonedDateTime을 포함하고 있다. 
		 *  					이들 클래스는 ISO-8601에 정의된 달력 시스템에 기초한다.
		 *  
		 *  java.time.chrono	ISO-8601 에 정의된 달력 시스템 이외의 다른 달력 시스템을 사용하고자 할때 
		 *  					사용할 수 있는 API들이 포함되어있다
		 *  
		 *  java.time.format	날짜와 시간을 parsing 하고 formating하는 API들이 포함되어 있다.
		 *  
		 *  java.time.temporal	날짜와 시간을 연산하기 위한 보조 API들이 포함되어 있다.
		 *  
		 *  java.time.zone		타임존을 지원하는 API들이 포함되어 있다.
		 *  
		 *  
		 *  
		 *  - 날짜와 시간 객체 생성
		 *  	-날짜와 시간을 표현하는 5개의 클래스
		 *  
		 *  클래스 명		설명
		 *  LocalDate		로컬 날짜 클래스
		 *  LocalTime		로컬 시간 클래스
		 *  LocalDateTime	로컬 날짜 및 시간 클래스(LocalDate + LocalTime)
		 *  ZonedDateTime	특정 타임존(TimeZone)의 날짜와 시간 클래스
		 *  Instant			특정 시점의 Time-Stamp 클래스
		 *  
		 *  LocalDate
		 * 	LocalDate currDate = LocalDate.now(); //시스템의 현재 날짜 객체 생성
		 * 	LocalDate targetDate = LocalDate.of(int year, int month, int dayOfMonth); //지정 날짜 객체 생성
		 * 	
		 *  LocalTime
		 *  LocalTime currTime = LocalTime.now();	//현재 시스템의 현재 시간 객체 생성
		 *  LocalTime targetTime = LocalTime.of(int hour, int minute, int second, int nanoOfSecond); //지정 시간 객체 생성
		 *  
		 *  LocalDateTime
		 *  LocalDateTime currDateTime = LocalDateTime.now();
		 *  LocalDateTime targetTime = LocalDateTime.of(int year, int month, int dayOfMonth,
		 *  											int hour, int minute, int second, int nanoOfSecond);
		 *  
		 *  ZonedDateTime
		 *  	- 저장 형태 : 2014-04-21T07:40:24.017 +09:00 [Asia/Seoul]
		 *  	
		 *  	- 존 오프셋(ZoneOffset) : 
		 *  		협정세계시(UTC: Universal Time Cooridnated)와 차이나는 시간(시차)을 말한다.
		 *  	- 존 아이디(ZoneId) :
		 *  		java.util.TimeZone의 getAvailableIDs() 메소드가 리턴하는 유효한 값 중 하나
		 *  	ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		 *  	ZonedDateTime londonDateTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
		 *  	ZondeDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		 * Instant
		 * 		- 날짜와 시간의 정보를 얻거나, 조작하는데 사용되지 않고
		 * 		- 특정 시점의 타임스탬프(Time-Stamp)로 사용
		 * 		- 주로 특정 두 시점간의 시간적 우선 순위를 따질 때 주로 사용
		 * 		- java.util.Date와 가장 유사한 클래스
		 * 			- Date:로컬 컴퓨터의 현재 날짜와 시간 정보를 기준
		 * 			- Instant : 협정 세계시(UTC)를 기준
		 * 		Instant instant1 = Instant.now();
		 * 		Instant instant2 = Instant.now();
		 * 		if(Instant1.isBefore(instant2)){System.out.println("instant1 이 빠릅니다.");}
		 * 		else if (instant1.isAfter(instant2)){System.out.println("instant1이 늦습니다.");}
		 * 		else {System.out.println("동일한 시간입니다.")};
		 * 		System.out.println("차이(nanos):"+ instant1.until(instant2, ChronoUnit.NANOS));
		 */
		//날짜얻기
		LocalDate currDate = LocalDate.now();
		System.out.println("현재 날짜 : "+currDate);
		
		LocalDate targetDate = LocalDate.of(2024, 5, 16);
		System.out.println("타겟 날짜 : "+targetDate);
		
		//시간 얻기
		
		LocalTime currTime = LocalTime.now();
		System.out.println("현재 시간 : "+currTime);
		
		LocalTime targetTime = LocalTime.of(6, 30,0,0);
		System.out.println("목표 시간 : "+targetTime);
		
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간 : "+ currDateTime);
		
		LocalDateTime targetDateTime = LocalDateTime.of(2024,5,10,6,30,0,0);
		System.out.println("목표 날짜와 시간 : "+targetDateTime);
	}

}
