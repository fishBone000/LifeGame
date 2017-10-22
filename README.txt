Supported language: Simplified Chinese, English

ZH-CN

系统需求：
Windows XP及以上
低版本的系统可能会带来兼容性问题

运行环境需求：
Java 8(JRE 1.8)

概述：
生命游戏是一个零玩家游戏。它包括一个二维矩形世界，这个世界中的每个方格居住着一个活着的或死了的细胞。一个细胞在下一个时刻生死取决于相邻八个方格中活着的或死了的细胞的数量。如果相邻方格活着的细胞数量过多，这个细胞会因为资源匮乏而在下一个时刻死去；相反，如果周围活细胞过少，这个细胞会因太孤单而死去。实际中，玩家可以设定周围活细胞的数目怎样时才适宜该细胞的生存。
      ——维基百科

在本游戏中你将观察一个自定义大小二维矩形世界中细胞的死亡及繁殖，每一个字符代表一个细胞，“-”代表死亡，“O”代表存活。
如下图：

----
-O-O
O-O-
OOOO

游戏方法：
进入游戏后初始化游戏基本变量。
Map width——游戏地图宽度
Map height——游戏地图高度
Rule——当一个细胞周围八个细胞有多少为存活时，该细胞存活。格式为：<整数>[整数][整数]……例如，当存活条件为2~4个，则输入234
Delay between frames（ms）——每一帧之间的间隔，单位为毫秒，1s=1000ms

初始化完成后开始游戏，输入指令以给出下一步骤：
run <整数>——运行<整数>次
set <X轴坐标>,<Y轴坐标>,<状态>——设置某一细胞的状态，1为存活，0为死亡
clear——设置所有细胞为死亡，即重新开始游戏
reset——重新初始化基本变量
end——结束游戏

结束游戏后可选择是否重新开始游戏，Y为“是”，N为“否”

开发者建议：
推荐宽度为140，高度为40，生存条件为2~3，当然你可以自己调整条件来测试更多的可能性。
高级玩家可以自行编辑源代码来创造自己的规则，目前的规则极其简单，仅仅根据周围细胞的存活数来判断该细胞的状态。

注：
源代码免费开放，可供所有人学习交流使用。
本开发者并不是康威生命游戏的发明者，原发明者为约翰·何顿·康威。
所有人都可以复制、编辑、传播本程序，但传播时请注明本程序的开发者（FishBone000）和发明者（约翰·何顿·康威）。

EN:

System Requirements:
Windows XP or later
Low version systems may cause compatibility issues

Runtime Environment Requirements:
Java 8(JRE 1.8)

Summary:
See https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life

How to play：
Initializate the basic variables after starting the game. 
Map width----the width of the game map
Map height----the height of the game map
Rule----When how many nearby cells are alive, this cell at the moment will be alive. Format: <Integer>[Integer][Integer]...For example, when the condition is from 2 to 4, then enter 234
Delay between frames(ms)----The unit is milliesecond, 1s=1000ms

The game will be started after initialization, enter command for the next step:
run <Integer>----Run for <Integer> times
set <X>,<Y>,<status>----Set the status of a cell, 1 for alive, 0 for dead
clear----Set all cells to dead, that is the game will restart
reset----Re-initializate basic variables
end----End game

Restart game after the game is over, Y for "Yes", N for "No"

Developer's suggestions:
Recommoned width is 140, 40 for height, survive condition is 2~3, certainly you can modify it yourself to try more possibilities.
Advanced players may edit source code to create own rules, current rules are simple, it just decides the status by considering nearby alive cells.

Notice:
The source code is for free, everyone may use it for studying. 
Oneself isn't the inventor of Conway's Game of Life, the origin inventor is John Horton Conway.
Every one may copy, modify, spread this program, but please note the developer(FishBone000) of the program and the inventor(John Horton Conway).