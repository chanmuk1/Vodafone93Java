package stream;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPipeline {

	public static void main(String[] args) {
		
		List<String> allDirNames =
			    Arrays.stream(new File("C:\\Users\\Administrator\\Desktop\\Voda")
			          .listFiles())
			          //.filter(File::isDirectory)
			          .map(File::getName)
			          .collect(Collectors.toList());
			
		System.out.println(allDirNames);

	}

}
