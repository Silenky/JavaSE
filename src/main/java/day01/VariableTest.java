package day01;

/*
变量的概念：
内存中的一个存储区域
该区域的数据可以在同一类型范围内不断变化
变量是程序中最基本的存储单元。包含变量类型、变量名和存储的值
变量的作用：
用于在内存中保存数据
使用变量注意：
Java中每个变量必须先声明，后使用
使用变量名来访问这块区域的数据
变量的作用域：其定义所在的一对{ }内
变量只有在其作用域内才有效
同一个作用域内，不能定义重名的变量

变量的使用
1. java定义变量的格式：数据类型 变量名 = 变量值;

2. 说明：
   ① 变量必须先声明，后使用
   ② 变量都定义在其作用域内。在作用域内，它是有效的。换句话说，出了作用域，就失效了
   ③ 同一个作用域内，不可以声明两个同名的变量

*/
class VariableTest {
	public static void main(String[] args) {
		//变量的定义
		int myAge = 12;
		//变量的使用
		System.out.println(myAge);

		//编译错误：使用myNumber之前并未定义过myNumber
		//System.out.println(myNumber);

		//变量的声明
		int myNumber;

		//编译错误：使用myNumber之前并未赋值过myNumber
		//System.out.println(myNumber);

		//变量的赋值
		myNumber = 1001;
		//编译不通过
		//System.out.println(myClass);

		//不可以在同一个作用域内定义同名的变量
		//int myAge = 22;

	}

	public void method(){
		int myClass = 1;
	}
}

//class VariableTest {}//逆向思维，反证法