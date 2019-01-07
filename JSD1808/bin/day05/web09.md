###课程回顾
1. JavaScript 给页面添加动态效果 动态内容
2. 三种引入方式：
- 在标签内的事件属性中添加js代码
- 在head标签内部添加 script标签 
- 在单独的js文件中写js代码 通过script标签的src属性引入
3. 数据类型
- 数值类型 number
- 字符串 string
- 布尔值 boolean
- 未定义 undefined
- 对象类型 object
4. 变量声明和定义
- js属于弱类型语言
- var x = 10;
5. 隐式转换
- 字符串： 转数值能转直接转不能转NaN, ""转false 其它true
- 数值：转字符串直接转 0和NaN转false 其它true
- 布尔值：转字符串直接转 true转1 false转0
- undefined：转字符串直接转 转数值NaN 转布尔值false
- null：转字符串直接转 专数值 0  转布尔值 false
6. 运算符 和Java大体相同
- ==和=== == 先统一类型 再比较值  ===先比较类型再比较值
- typeof 获取变量的类型
- 除法自动转换整数和小数
7. 语句 和Java大体相同
- if和while括号里的内容 如果不是布尔值会自动转成布尔值
- for循环把int 改为var  不支持增强for循环
8. 方法声明
- function 方法名(参数列表){ return xxx;}
- var 方法名  = function(参数列表){return xxx;};
- var 方法名 = new Function("参数1","参数2","return xxx;");
9. 和页面相关的方法
- 通过id获取页面元素对象 var x = document.getElementById("id");
- 获取和设置文本框的内容 x.value
- 给元素添加文本内容 x.innerText+="aaa";
- 给元素添加html内容 x.innerHTML+="标签内容";
- 获取和设置元素的class  x.className="xxx"; 
10. 字符串相关
- 创建字符串 var str = "abc"; var str2 = new String("abc");
- 转数值 parseInt(3.8) parseFloat("3") Number()
- 获取字符串位置 str.indexOf("a") str.lastIndexOf("a");
- 转大小写  str.toUpperCase()   str.toLowerCase();
- 截取字符串 str.substring(start,?end);
- 替换  str.replace(old,new);
- 拆分 var arr = str.split(",");
11. 四舍五入   num.toFixed(保留小数长度);
12. 数组
- 创建数组  var arr = [18,20]; var arr = new Array(18,20);
- 添加元素 arr.push(33);
- 获取和修改长度 arr.length=3;
- 数组反转  arr.reverse();  
- 数组排序  arr.sort();   arr.sort();
13. 日期
- 获取客户端时间   var d = new Date();
- 把字符串时间转时间对象 var d = new Date("2018/10/11 20:33:22");
- 获取和设置时间戳 d.getTime()   d.setTime(24*60*60*1000);
- 获取时间分量  d.getFullYear/Month/Date/Day/Hours/Munites/Seconds
- 获取年月日 d.toLocaleDateString()  d.toLocaleTimeString();
14. 正则 
- . 匹配任意字符 除换行
- \d 匹配任意数字
- \w 匹配任意数字字母下划线
- \s 匹配任意空白
- 开始^   结束$
- 创建正则对象： var reg = /规则/模式;  var reg = new RegExp(规则,模式);模式可以省略，如果规则出现\ 需要转译\\
- reg.exec(str); 查找内容 一次只能找到一个 找不到的话返回null
- reg.test(str); 校验文本
-  var arr = str.match(reg); 查找所有
-  str.replace(reg,new); 替换所有

###事件取消
- 终止当前的事件  
- 在事件调用的地方写上 return false;

###自定义对象
- 声明函数/方法的形式创建对象

		function Person(name,age){
			//声明属性并且给属性赋值
			this.name=name;
			this.age=age;
			//声明方法
			this.run = function(){
				alert("name:"+this.name+" age:"+this.age);
			}
		}
		//创建对象
		var p = new Person("李白",28);
		p.run();
- 声明变量的形式创建对象

		/* 第二种创建对象的方式 */
		var p = {
				"name":"曹操",
				"age":18,
				"run":function(){
					alert("name:"+this.name+" age:"+this.age);
				}
		}
		p.run();

###DHTML
- 简介：Dynamic(动态)HTML，并不是一门新的技术，把html+css+js一起做出的页面称为DHTML 
- DHTML包括： BOM 和 DOM
- BOM：Browser浏览器 Object对象 Model模型，里面包含和浏览器相关的内容
- DOM：Document文档 Object对象 Model模型，里面包含所有和页面元素相关的内容 

###BOM 浏览器对象模型
####window 
	window中的所有属性称为全局属性，所有方法称为全局方法，调用时可以省略掉window 
- window里面包含以下对象：
- location:位置
	可以得到浏览器当前的访问地址，也可以修改
	location.href 得到当前浏览器访问的地址
	location.href="http://doc.tedu.cn"; 修改浏览器访问的地址
- history：历史
	当前窗口浏览的历史
	history.length 当前窗口的历史页面数量
	history.back(); 返回上一个页面
	history.forward(); 前进到下一个页面
	history.go(num) 前往第几个页面 正值是前进 负值是后退，0是刷新
- screen：屏幕
	screen.width/height 获取屏幕宽高   分辨率
	screen.availWidth/Height 获取屏幕可用宽高 减掉了开始菜单栏的高度
- navigator：导航/帮助
	navigator.userAgent //得到浏览器的版本信息  

###和window相关的事件
- 窗口点击事件
	onclick = function(){}
- 页面加载完成事件 只会执行一次
	onload = function(){}
- 页面获取焦点事件 会执行多次 每次页面激活时执行
	onfocus = function(){}
- 页面失去焦点事件 会执行多次 每次页面失去激活状态时执行
	onblur = function(){}
###eval()
- 可以将字符串以js代码的形式执行
####计算器练习： 代码参见demo06.html

###弹出窗 
- 提示框：alert("弹出的内容");
- 确认框：confirm("")
- 弹出文本框： prompt("请输入您的大名！");

###通过js对元素添加样式
	x.style.样式名="值";

###定时器
	setInterval(方法,时间间隔);

###创建元素的方式
	var img = document.createElement();
###往页面body中添加元素
	document.body.appendChild(img);
###获取随机数
- Math.random()  0-1随机数
- Math.floor() 向下取整






 