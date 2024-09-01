package kadai_008;

public class Price_Chapter08 {
	public static void main(String[] args) {
	// 年代(年齢）
	int userAge = 33;
	
	// サービスの使用料金
	int serviceCost;
	
	String userAgeStr;

    if (userAge >= 10 && userAge <= 19) {
    	userAgeStr = "10代";
    } else if(userAge >= 20 && userAge <= 29){
    	userAgeStr = "20代";
    }else if(userAge >= 30 && userAge <= 49){
    	userAgeStr = "30代・40代";
    }else if(userAge >= 50 && userAge <= 79){
    	userAgeStr = "50代・60代・70代";
    }else if(userAge >= 80 && userAge <= 89){
    	userAgeStr = "80代";
    }else {
    	userAgeStr = "上記以外の年代";
    }
	
    serviceCost = switch (userAgeStr) {
    case "10代"->1000;
    case "20代"->2000;
    case "30代・40代"->3000;
    case "50代・60代・70代"->4000;
    case "80代"->5000;
    default->500;
    
};
	
	// 30代の料金を取得
	System.out.println(String.format("料金は%d円です",  serviceCost));

}
}
