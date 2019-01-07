###课程回顾
1. 事件取消  return false;
2. 自定义对象 
- function Person(name,age){
	this.name=name;
	this.age=age;
	this.run = function(){}
}
- var p = {
		"name":"程咬金",
		"age":18,
		"run":function(){}
}
3. DHTML = html+css+js
4. DHTML包括 BOM 浏览器对象模型和 DOM 文档对象模型
5. window里面的变量称为全局变量 调用时可以省略window.
- location.href 获取浏览器访问的地址  还可以修改
- history.length   history.back()/forward()/go(n)
- screen.width/height   screnn.availWidth/availHeight 可用宽高 
- navigator.userAgent  获取浏览器版本信息 
6. window相关事件   窗口点击事件  onclick= function(){}   页面加载完成事件 onload=function(){}   获取焦点事件 onfocus=function(){}  失去焦点事件 onblur=function(){}
7. eval() 可以将字符串以js代码的形式执行 
8. 弹出框： 1.alert()   2.confirm()  3. prompt() 弹出文本框
9. 添加样式  xx.style.样式名称="值";
10. 定时器  setInterval(方法,时间间隔)
11. 创建元素对象  var x = document.createElement("img");
12. 往body（页面）中添加元素对象  document.body.appendChild(x);
13. 随机数  Math.random()  0-1
14. 向下取整 Math.floor()   
	    Math.floor(Math.random()*3+3) 
	获取4-9的随机数  0-5   Math.floor(Math.random()*6+4)


###停止定时器
	var timeId = setInterval(方法名,时间间隔);
	clearInterval(timeId);

###setTimeout(方法名,时间间隔);

	setTimeout() 


###DOM 

	文档对象模型，学习DOM主要用于对页面中的元素进行增删改查操作
####查找元素
- 通过id查找
	var x = document.getElementById("id");
- 通过标签名查找
	var imgs = document.getElementsByTagName("img");
- 通过class查找元素
	var divs = document.getElementsByClassName("c1");
- 通过name属性值查找
	var arr = document.getElementsByName("gender");

####创建元素
	var div = document.createElement("div");
- 添加元素到最后 document.body.appendChild(div);
- 插入元素 父元素.insertBefore(新元素,弟弟元素);
- 删除元素  父元素.removeChild(被删除的元素对象);


###JS
1. 用于给页面添加动态效果和动态内容
2. 三种引入方式
- 标签属性事件中添加
- 在head标签里面添加script标签
- 在单独js文件中
3. 数据类型  数值类型number 字符串类型string  布尔值类型boolean 未定义类型undefined 对象类型object
4. 运算符  大体相同  ==和===   除法    typeof 66+6  number6
5. 语句 大体相同 if和while括号里面的内容会自动转成布尔值类型  for var
不支持增强for循环
6. 函数方法  
- function 方法名(参数列表){方法体};
- var 方法名 = function(参数列表){方法体};
- var 方法名 = new Function("参数1","参数2","方法体")
7. 字符串相关：
- 创建  var str = "" ;  str = new String();
- 转数值  parseInt()  parseFloat()  Number()
- 获取字符串出现的位置 str.indexOf("a");  str.lastIndexOf("a");
- 转大小写  toUpperCase()  toLowerCase();
- 截取  substring(start,end?)
- 替换字符串 replace（old,new）
- 拆分  var arr = str.split(",");
8. 四舍五入 num.toFixed(保留小数点位数)
9. 数组相关
-  创建 var arr = [20,18];  var arr = new Array("",18);
-  添加  arr.push();
-  长度  arr.length=3; 
-  反转  arr.reverse();
-  排序  arr.sort();     arr.sort(new Function("a","b","return a-b;"));
10. 日期
- 创建 var d = new Date();
- 通过字符串创建时间对象  var d = new Date("2018/10/11 20:18:22");
- d.setTime();  d.getTime();
- d.getFullYear/Month/Date/Day/Hours/Minutes/Seconds()
- d.toLocaleDateString()  d.toLocaleTimeString();
11. 正则：  .  \d  \w  \s  ^ $
- var reg = /规则/模式;   var reg = new RegExp(规则,模式?);
- reg.exec(str)     reg.test(str)   
- str.match(reg)     str.replace(reg,new)

