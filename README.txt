Supported language: Simplified Chinese, English

ZH-CN

ϵͳ����
Windows XP������
�Ͱ汾��ϵͳ���ܻ��������������

���л�������
Java 8(JRE 1.8)

������
������Ϸ��һ���������Ϸ��������һ����ά�������磬��������е�ÿ�������ס��һ�����ŵĻ����˵�ϸ����һ��ϸ������һ��ʱ������ȡ�������ڰ˸������л��ŵĻ����˵�ϸ����������������ڷ�����ŵ�ϸ���������࣬���ϸ������Ϊ��Դ�ѷ�������һ��ʱ����ȥ���෴�������Χ��ϸ�����٣����ϸ������̫�µ�����ȥ��ʵ���У���ҿ����趨��Χ��ϸ������Ŀ����ʱ�����˸�ϸ�������档
      ����ά���ٿ�

�ڱ���Ϸ���㽫�۲�һ���Զ����С��ά����������ϸ������������ֳ��ÿһ���ַ�����һ��ϸ������-��������������O�������
����ͼ��

----
-O-O
O-O-
OOOO

��Ϸ������
������Ϸ���ʼ����Ϸ����������
Map width������Ϸ��ͼ���
Map height������Ϸ��ͼ�߶�
Rule������һ��ϸ����Χ�˸�ϸ���ж���Ϊ���ʱ����ϸ������ʽΪ��<����>[����][����]�������磬���������Ϊ2~4����������234
Delay between frames��ms������ÿһ֮֡��ļ������λΪ���룬1s=1000ms

��ʼ����ɺ�ʼ��Ϸ������ָ���Ը�����һ���裺
run <����>��������<����>��
set <X������>,<Y������>,<״̬>��������ĳһϸ����״̬��1Ϊ��0Ϊ����
clear������������ϸ��Ϊ�����������¿�ʼ��Ϸ
reset�������³�ʼ����������
end����������Ϸ

������Ϸ���ѡ���Ƿ����¿�ʼ��Ϸ��YΪ���ǡ���NΪ����

�����߽��飺
�Ƽ����Ϊ140���߶�Ϊ40����������Ϊ2~3����Ȼ������Լ��������������Ը���Ŀ����ԡ�
�߼���ҿ������б༭Դ�����������Լ��Ĺ���Ŀǰ�Ĺ�����򵥣�����������Χϸ���Ĵ�������жϸ�ϸ����״̬��

ע��
Դ������ѿ��ţ��ɹ�������ѧϰ����ʹ�á�
�������߲����ǿ���������Ϸ�ķ����ߣ�ԭ������ΪԼ�����ζ١�������
�����˶����Ը��ơ��༭�����������򣬵�����ʱ��ע��������Ŀ����ߣ�FishBone000���ͷ����ߣ�Լ�����ζ١���������

EN:

System Requirements:
Windows XP or later
Low version systems may cause compatibility issues

Runtime Environment Requirements:
Java 8(JRE 1.8)

Summary:
See https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life

How to play��
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