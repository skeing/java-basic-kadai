package syntaxbase;

public class HelloWorld {

	public static void main(String[] args) {
		String[] alphabets = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

		int[] results = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		int sum = 0;
		
		// まず合計を計算
        for (int i = 0; i < results.length; i++) {
            sum += results[i];
        }
        
        // 平均点を計算
        double average = (double) sum / results.length;
        
        // 結果を出力
        for (int i = 0; i < alphabets.length; i++) {
            System.out.println(String.format("%sさんの点数は%d点", alphabets[i], results[i]));            
        }
        
        System.out.println(String.format("テストの平均点は%.0f点", average));

	}

}
