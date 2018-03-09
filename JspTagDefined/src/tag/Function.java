package tag;
/** 
 * @author: 07
 * @date: 2017年9月12日 下午2:25:39 
 * @version 1.0
 * @parameter test
 * @return  
 */
public class Function {
	/** 判断字符串是否为空 */
	public static boolean isNull(String str){
		if(str ==null || "".equals(str)){
			return true;
		}else{
			return false;
		}
	}
	public static String change(String string){
		String str=null;
		switch (string) {
		case "R":
			str="无卡快捷";
			break;
		case "Q":
			str="QQ钱包";
			break;
		case "Z":
			str="支付宝支付";
			break;
		default:
			break;
		}
		return str;
		
	}
}
