package tag;
/** 
 * @author: 07
 * @date: 2017��9��12�� ����2:25:39 
 * @version 1.0
 * @parameter test
 * @return  
 */
public class Function {
	/** �ж��ַ����Ƿ�Ϊ�� */
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
			str="�޿����";
			break;
		case "Q":
			str="QQǮ��";
			break;
		case "Z":
			str="֧����֧��";
			break;
		default:
			break;
		}
		return str;
		
	}
}
