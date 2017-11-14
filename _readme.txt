1. 새로운 프로젝트 생성
	new > Spring Legacy Project > Templates : Spring MVC Project
	[next]
	package 3 depth로 지정
	[Finish]
2. pom.xml
	버전정보들 확인
	dependency 라이브러리 추가
3. web.xml
	<!-- character filter 설정 -->
	<filter>
		<filter-name>character encoding</filter-name>
		<filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
		<init-param>
			<param-name>encoding</param-name>
			<param-value>UTF-8</param-value>
		</init-param>
	</filter>
	<filter-mapping>
		<filter-name>character encoding</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>


Robert C. Martin의 단위 테스트 작성 지침(FIRST 규칙)

1. Fast : 테스트는 완전히 자동화 되어야 하고 [빠르게] 결과 확인이 가능해야 한다.
2. Independent : 테스트는 다른 테스트에 의존하지 않고 [독립적으로] 테스트 가능해야 한다.
3. Repeatable : 운영환경외의 환경에서도 실행 가능해야 하고 [반복 실행]이 가능해야 한다.
4. Self-validation : 테스트는 true, false중 하나의 값을 결과로 [자가 검증] 한다. 
   두 가지 외에 직접 실행해야 확인이 되는 주관적인 결과를 배제하기 위해서이다.
5. Timely : 단위테스트는 제품 코드를 구현하기 전에 작성하는 것이 좋다.
   (논쟁의 여지가 있음)

