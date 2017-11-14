package visual_recognition;

import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.ClassifyImagesOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.VisualClassification;

public class VisualRecognitionTest {

	public static void main(String[] args) {
		VisualRecognition service = new VisualRecognition(VisualRecognition.VERSION_DATE_2016_05_20);
		service.setApiKey("edb0599fa85ac908d9800adebefa47d57b6668e3");

		System.out.println("Classify an image");
		ClassifyImagesOptions options = new ClassifyImagesOptions.Builder()
				.url("http://image.hankookilbo.com/i.aspx?Guid=2017\\07\\06\\26f38c47b05149c4b753220e30aa14f8&Month=Entertainment&size=640")
				.build();
		
/*		ClassifyImagesOptions options = new ClassifyImagesOptions.Builder()
				.imagesFile(new File("C:/dev/image/a.jpg"))
				.build();*/
		
		VisualClassification result = service.classify(options).execute();
		System.out.println(result);
	}
}
