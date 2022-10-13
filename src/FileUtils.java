import java.io.IOError;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileUtils {
    //19대 대통령 취임사
    // 전체 문자열의 길이는 String length() 함수 이용
    // 문자열에서 특정 자리의 문자를 가져오는 String charAt(index) 함수 이용
    // 대소문자는 구분치 않는다.
    // 출력 형식을 이미지 결과에 맞추기 ( 포맷은 일치해야한다.
    // 내용은 텍스트파일에서 읽어오며 파일에서 텍스트를 읽어오는 소스는 추가 클래스 참조

    public String getLoadText(String filePath) {
        StringBuilder sb = new StringBuilder();
        try {
            Path path = Paths.get(filePath);
            List<String> lines = Files.readAllLines(path);
            for (int i = 0; i < lines.size(); i++) {
                if (i > 0) {
                    sb.append("\n");
                }
                sb.append(lines.get(i));

            }

        } catch (IOException e) {
            e.printStackTrace();

        }
        return sb.toString();
    }


}
