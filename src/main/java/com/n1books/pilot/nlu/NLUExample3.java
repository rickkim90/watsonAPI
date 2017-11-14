package com.n1books.pilot.nlu;

import java.util.ArrayList;
import java.util.List;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.NaturalLanguageUnderstanding;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalysisResults;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.AnalyzeOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.EmotionOptions;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.Features;

public class NLUExample3 {
	private static String username = "f2e6fa89-7132-4bbb-a01e-4444acade02b";
	private static String password = "EzU5tHFOORxb";
	private static String text = 
				"Whether we have seen eye-to-eye or rarely agreed at all, my conversations with" +
				" you, the American people — in living rooms and in schools; at farms and on " +
				"factory floors; at diners and on distant military outposts — those conversations" +
				" are what have kept me honest, and kept me inspired, and kept me going. " +
				"And every day, I have learned from you. You made me a better president, " +
				"and you made me a better man.";
	
	public static void main(String[] args) {
		NaturalLanguageUnderstanding service =
			new NaturalLanguageUnderstanding(NaturalLanguageUnderstanding.VERSION_DATE_2017_02_27);
		service.setUsernameAndPassword(username, password);

		List<String> targets = new ArrayList<String>();
		targets.add("better man");
		
		EmotionOptions emotions = new EmotionOptions.Builder().targets(targets).build();
		
		Features features = new Features.Builder().emotion(emotions).build();
		AnalyzeOptions parameters = 
				new AnalyzeOptions.Builder().text(text).features(features).build();
		AnalysisResults response = service.analyze(parameters).execute();
		System.out.println(response);
	}
}
