import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex02 {
	public static void main(String[] args) {
		Path filepath = Paths.get("d://2020java//20200525//b.txt");  // 해당 경로에 b.txt 생성
		BufferedWriter bw = null;
		
		try {
			bw = Files.newBufferedWriter(filepath);
			bw.write('A');  // b.txt에 A 입력
			bw.write('Z');  // b.txt에 Z 입력
			
			if(bw != null) {
				bw.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
