//注意：同一级目录下不用import Students类，本例所用的Students类在t1.java文件中。
public class t2{
	public static void main(String[] args){
		// 定义一个数组，保存多个student对象作为通讯录数据
		Students[] st= new Students[3];
		st[0] = new Students(1,"name1","male","1233211","address1","email1");
		st[1] = new Students(2,"name2","male","1233212","address2","email2");
		st[2] = new Students(3,"name3","female","1233213","address3","email3");
		String str = args[0];
		// 是不否需要友好提示标志位
		int flagFind = 0;
		for(int i=0;i<st.length;i++){
			// 可以通过name,email,address查询
			if(str.equals(st[i].getName()) || str.equals(st[i].getEmail()) || str.equals(st[i].getAddress())){
				// 查询到
				System.out.println("you find one student: "+st[i].getName());
				flagFind++;
			}
		}
		// 提示
		if(0==flagFind){
			System.out.println("the student didn't exist!");
		}
	}
}
