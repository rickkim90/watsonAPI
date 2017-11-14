package com.n1books.pilot.nlu;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.NaturalLanguageUnderstanding;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalyzeOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.ConceptsOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Features;

public class NLUExample2 {
	private static String username = "f2e6fa89-7132-4bbb-a01e-4444acade02b";
	private static String password = "EzU5tHFOORxb";
	private static String text = 
		"백악관 트럼프, 내달 7일 문대통령과 정상회담·국회연설(워싱턴 AP=연합뉴스) 도널드 트럼프 미국 대통령이 지난 16일(현지시간) 워싱턴DC 인근 앤드루스 공군기지에서 전용기 에어포스원에 오르며 손을 흔들고 있다.";
	
	public static void main(String[] args) {
		NaturalLanguageUnderstanding service =
			new NaturalLanguageUnderstanding(NaturalLanguageUnderstanding.VERSION_DATE_2017_02_27);
		service.setUsernameAndPassword(username, password);
		
		ConceptsOptions concepts = new ConceptsOptions.Builder().limit(20).build();
		Features features = new Features.Builder().concepts(concepts).build();
		AnalyzeOptions parameters = 
				new AnalyzeOptions.Builder().text(text).features(features).build();
		AnalysisResults response = service.analyze(parameters).execute();
		System.out.println(response);
	}
}
