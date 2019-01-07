###课程回顾
1. 三种引入方式：
- 在元素标签的事件中添加js代码  事件：点击事件
- 在head标签中添加script标签 
- 在单独的js文件中写js代码  通过script标签的src属性，引入
2. 数据类型
- 数值类型 number
- 字符串类型 string
- 布尔值类型 boolean 
- 未定义类型 undefined
- 对象类型 object
3. 变量声明和赋值
- js属于弱类型语言   var x=10;
4. 数据类型间的隐式转换
- 字符串       转数值：能转直接转不能则转NaN 转布尔值：""->false 其他true
- 数值类型    转字符串：直接转    转布尔值 0和NaN转false 其它true
- 布尔值      转字符串：直接转    转数值 true->1 false->0
- 未定义类型   转字符串：直接转   转数值 NaN  转布尔值 false
- null  转字符串：直接转  转数值 0    转布尔值 false

5. 运算符  和java大体相同
- ==和===  ==先统一类型再比较值   ，===先比较类型再比较值
- typeof  获取变量的类型
- 除法自动转换整数和小数 
6. 语句  和java大体相同
- if和while括号里面的内容如果不是布尔值类型会自动隐式转换
- for   int i 改成 var i    不支持增强for循环
7. 函数声明
- 第一种格式：  function 方法名（参数列表）{ return xxx;}
- 第二种格式： var 方法名 = function(参数列表){return xxx;}
8. 页面相关的方法
- 通过id获取页面元素  var x = document.getElementById("id");
- 获取和设置文本框的内容    x.value 
- 给元素设置文本内容  x.innerText+="abc";
- 给元素添加html内容  x.innerHTML += "<h1>xxx</h1>";

###String相关内容
1. 创建字符串的两种方式
	var str = "abc";  支持单引号或双引号
	var str = new String("abc");
2. 把字符串转数值
	parseInt() 把字符串或小数转成整数
	parseFloat() 把字符串转成小数或整数
	Number() 等效parseFloat()
3. 字符串转大小写 
	str.toUpperCase();//转大写
	str.toLowerCase();//转小写
4. 获取字符串出现的位置  从0开始
	var str = "abcdefg";
	str.indexOf("e"); //找第一个出现的位置
	str.lastIndexOf("e");//找最后一个出现的位置
5. 截取字符串
	str.substring(start,[end]);
	str.substring(3);//从3截取到最后
	str.substring(3,5);//从3截取到5
6. 替换字符串
	str.replace();
	color
	var str ="<div class='[c]'></div>"
	str = str.replace("[c]",color);
7. 拆分字符串
	str.split(",");//将一个字符串拆分成多个字符串，返回值为数组 数组里面装着多个字符串
###数值相关 四舍五入	
	18.34567.toFixed(3);

###数组相关
1. 创建数组 数组中可以保存任意类型的数据
	var arr1 = ["刘备",18,true];
	var arr2 = new Array();
	var arr3 = str.split(","); //数组声明时没有[]

2. 向数组里面添加内容
	arr.push("张学友");
	arr.push(18);
	arr.push(false);
3. 修改数组的长度  （Java数组的长度不能改）
	var arr = ["张三","李四","王五","赵六","田七"];
	arr.length=3;

4. 数组的遍历
	var arr = ["张三","李四","王五","赵六","田七"];
	for(var i=0;i<arr.length;i++){
		alert(arr[i]);
	}
5. 数组反转  "a","b","c"   c b a
	arr.reverse();



上午内容回顾：
1. 字符串相关
- 创建字符串  var str = "abc";   str = new String();
- 字符串转数值   parseInt  parseFloat   Number
- 转大小写   toUpperCase()    toLowerCase();
- 获取字符串出现的位置   str.indexOf()   str.lastIndexOf();
- 截取字符串  str.substring(start,?end)
- 替换字符串  str.replace(old,new);
- 拆分字符串 var arr = str.split(",");
2. 四舍五入  number.toFixed(n) n代表保留几位小数
3. 数组相关
- 创建数组  var arr1 = ["abc",18,true];  var arr2 = new Array();
- 数组中添加元素  arr.push("abc");
- 修改数组的长度  arr.length=3;
- 遍历数组 
- 数组内容反转  arr.reverse();   a b c  c b a



6. 数组排序
- 默认的排序规则是以字符串的形式进行排序，排序规则是通过Unicode字符编码进行排序，比完第一位再比第二位以此类推。
	var arr = [25,1,8,15,22,35,40];
	arr.sort();
- 自定义排序：
	
		//声明一个自定义排序的方法
		function sortfn(a,b){
			//return a-b;//升序
			return b-a;//降序
		}
		//如果方法是作为参数传递的话不写括号
		//方法调用时才需要写括号
		arr.sort(sortfn); */
		//给排序方法传递一个匿名函数
		/* arr.sort(function(a,b){
			return a-b;
		});

- 第三种声明函数的方式
	/* var myfn = new Function("x","alert(x);");
	 myfn(18); */
	 
	//传递匿名函数
	arr.sort(new Function("a","b","return a-b;"));


###日期相关内容
- 服务器时间和客户端时间
1. 获取当前时间(客户端时间)
	var d1 = new Date();
2. 把从服务器端请求到的时间字符串转成Date对象
	var d2 = new Date("2018/10/11 14:33:22");
3. 从时间对象中获取和设置时间戳（距离1970年1月1日 00：00：00）
	d1.getTime();
	d1.setTime(1000); 1970/1/1 08:00:01
4. 从时间对象中获取时间分量（单独的年月日时分秒 星期几）
- d1.getFullYear(); //年
- d1.getMonth();//月 从0开始
- d1.getDate();//日
- d1.getDay();//星期几
- d1.getHours();//时
- d1.getMinutes();//分
- d1.getSeconds();//秒
5. 获取年月日 和 获取时分秒
- 年月日  d1.toLocaleDateString();
- 时分秒  d1.toLocaleTimeString();

###正则表达式
- 应用场景： 1. 查找内容  2. 校验文本

. : 匹配任意字符 除了换行
\w : 匹配任意数字、字母、下划线
\d : 匹配任意数字
\s : 匹配任意空白
^ : 开头
$ : 结尾
- 创建正则对象的两种方式： 
1. var reg = /规则/模式;  （模式：g代表全局查找， i忽略大小写 ）
2. var reg = new RegExp(规则,?模式); 这种方式创建正则对象时如果有反斜杠需要转译

	//第一种创建正则对象的方式
	//创建一个以a开头的正则，i代表忽略大小写
	var reg1 = /^a/i;
	//创建一个以m结尾的正则
	reg1 = /m$/;
	//创建一个包含两位数字的正则
	reg1 = /\d{2}/;  
	//创建一个以三位数字开头的正则
	reg1 = /^\d{3}/;
	//创建一个以y开头以m结尾中间有5位数字
	reg1 = /^y\d{5}m$/;
	//创建一个由3-5位数字组成的正则
	reg1 = /^\d{3,5}$/;
	//创建一个6-10位数字字母下划线的正则
	reg1 = /^\w{6,10}$/;
	//第二种创建正则对象的方式 new RegExp(规则,？模式); 
	var reg2 = new RegExp("^\\w{6,10}$");

- 和正则相关的几个方法：
1. reg.exec(str)  查找内容 

		//1. 查找内容
		var str = "you can you up no can no b b ";
		//全局查找no
		var reg = /no/g;
		//exec执行(execute)
		//alert(reg.exec(str)); //找到第一个no
		//alert(reg.exec(str)); //找到第二个no
		//alert(reg.exec(str)); //null 代表没有了
2. reg.test(str) 校验文本

		reg = /^You/i;
		if(reg.test(str)){
			alert("格式正确");
		}else{
			alert("格式错误");
		}
3. 字符串中和正则相关的方法：1. 查找内容
	var str = "you can you up no can no b b ";
	var reg = /no/g;
	//此方法一次性查询到所有出现的内容 装在一个数组中返回
	var arr = str.match(reg);
4. 字符串中和正则相关的方法：2. 查找替换
	var str = "you can you up no can no b b ";
	var reg = /no/g;
	//查找到正则匹配的所有内容并全部替换掉
	str.replace(reg,"不");


###课程回顾：
1. js 用于给页面添加动态效果和动态内容
2. 三种引入方式:
- 标签内的事件属性中添加
- 在head标签内部添加 script标签
- 在单独的js文件中写js代码 通过 script标签的src属性引入
3. 数据类型
- 数值类型 number
- 字符串  string
- 布尔值 boolean
- 未定义  undefined
- 对象   object
4. 变量声明和赋值   弱类型语言   var x = 10;
5. 隐式转换 
6. 运算符 和Java大体相同  
- ==和===  ==先统一类型 再比较值  ===先比较类型再比较值
- typeof  获取变量的类型
- 除法 会自动转换整数和小数
7. 语句  if和while括号里面的内容如果不是布尔值会自动隐式转换成布尔值，for 把int i改成var i 不支持增强for
8. 方法声明：
- function 方法名(参数列表){return xxx;}
- var 方法名 =  function(参数列表){return xxx;}
- var 方法名 = new Function("参数","参数","方法体代码");
9. 和页面相关
- 通过id获取页面中的元素对象  var x = document.getElementById("id");
- 给文本框获取和设置文本内容input.value = "xxx" var x = input.value
- 给元素添加文本内容 div.innerText+="xxx";
- 给元素添加html内容 div.innerHTML+="<h1>xxx</h1>";
- 修改元素的class  div.className="xxx";
10. 字符串相关
- 创建   var str = "abc"; var str = new String("abc");
- 转数值  parseInt() parseFloat()  Number()
- 获取字符串出现的位置 str.indexOf("a")  str.lastIndexOf("b")
- 大小写  str.toUpperCase()  str.toLowerCase();
- 截取 str.substring(start,?end);
- 替换  str.replace(old,new);
- 拆分  var arr = atr.split(",");
11. 四舍五入  num.toFixed(n); n代表保留几位小数
12. 数组
- 创建数组 var arr = [18,20]; var arr = new Array();
- 添加元素 arr.push();
- 修改长度 arr.length = 3;
- 遍历  和Java一样
- 反转 arr.reverse()   a,b,c   c,b,a
- 排序   arr.sort()     自定义排序   arr.sort(mysort)
	
		function mysort(a,b){
		return a-b;//升序  b-a降序
	}
13. 日期相关
- 获取客户端时间 var d = new Date();
- 把字符串时间转成时间对象  var d = new Date("2018/10/22 18:33:22");
- 获取和设置时间戳  d.getTime()   d.setTime(1000)
- 获取时间分量 d.getFullYear/Month/Date/Day/Hours/Minutes/Seconds()
- 获取年月日  toLocaleDateString()   时分秒 toLocalTimeString()
14. 正则   
- .任意字符 除了换行
- \d 任意数字
- \w 任意数字字母下划线
- \s 任意空白
- ^ 开头
- $ 结尾
1. 创建正则的两种格式
- var reg = /规则/模式(g全局查找和i忽略大小写)
- var reg = new RegExp(规则,模式); 如果有\需要转译
2. 相关方法
- 查找 reg.exec(str);
- 校验 reg.test(str);
- 查找 str.match(reg) 返回值为查找到的所有内容 保存在一个数组里面
- 查找替换  str.replace(reg,new) 替换正则匹配到的所有内容



