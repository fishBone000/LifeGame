/*
 * Important!
 * Please read README.txt before editing this file.
*/
import java.util.Scanner;
public class LifeGame {
	static int MaxX, MaxY;
	static Scanner Sca = new Scanner(System.in);
	static int [][][] cell;
	static String command, conditionS;
	static int delay;
	static int [] condition;
	static int toInt(String str, int start, int end) {
		int result = 0;
		String string = str.substring(start, end);
		for(int sc = string.length() - 1; sc != -1; sc --) {
			result += ((int)string.charAt(sc) - 48) * Math.pow(10, string.length() - 1 - sc);
		}
		return result;
	}
	static int BesideCells(int X, int Y) {
		int result = 0;
		if(X == 0) {
			if(Y == 0)
				result += cell[X][Y + 1][0] + cell[X + 1][Y + 1][0] + cell[X + 1][Y][0];
			else if(Y == MaxY - 1)
				result += cell[X + 1][Y][0] + cell[X + 1][Y - 1][0] + cell[X][Y - 1][0];
			else 
				result += cell[X][Y + 1][0] + cell[X + 1][Y + 1][0] + cell[X + 1][Y][0] + cell[X + 1][Y][0] + cell[X + 1][Y - 1][0] + cell[X][Y-1][0];
		}else if(X == MaxX - 1) {
			if(Y == 0)
				result += cell[X][Y + 1][0] + cell[X - 1][Y + 1][0] + cell[X - 1][Y][0];
			else if(Y == MaxY - 1)
				result += cell[X - 1][Y][0] + cell[X - 1][Y - 1][0] + cell[X][Y - 1][0];
			else
				result += cell[X][Y + 1][0] + cell[X - 1][Y + 1][0] + cell[X - 1][Y][0] + cell[X - 1][Y - 1][0] + cell[X][Y - 1][0];
		}else if(Y == 0)
			result += cell[X - 1][Y][0] + cell[X - 1][Y + 1][0] + cell[X][Y + 1][0] + cell[X + 1][Y + 1][0] + cell[X + 1][Y][0];
		else if(Y == MaxY - 1)
			result += cell[X - 1][Y][0] + cell[X - 1][Y - 1][0] + cell[X][Y - 1][0] + cell[X + 1][Y - 1][0] + cell[X + 1][Y][0];
		else
			result += cell[X - 1][Y][0] + cell[X - 1][Y + 1][0] + cell[X][Y + 1][0] + cell[X + 1][Y + 1][0] + cell[X + 1][Y][0] + cell[X - 1][Y - 1][0] + cell[X][Y - 1][0] + cell[X + 1][Y - 1][0];
		return result;
	}
	static void setup() {
		System.out.print("Map width: ");
		MaxX = Sca.nextInt();
		System.out.print("\nMap height: ");
		MaxY = Sca.nextInt();
		command = Sca.nextLine();
		System.out.print("\nRule: ");
		conditionS = Sca.nextLine();
		condition = new int[conditionS.length()];
		for(int i = 0; i < condition.length; i ++) {
			condition[i] = toInt(conditionS.substring(i, i + 1), 0, 1);
		}
		System.out.print("\nDelay between frames(ms): ");
		delay = Sca.nextInt();
		command = Sca.nextLine();
	}
	public static void main(String [] args) {
		System.out.println("Welcome to Conway's Game of Life");
		System.out.println("Invented by John Horton Conway\nMade by FishBone000\nVersion V1.1");
		setup();
		cell = new int[MaxX][MaxY][2];
		for(int i = 0; i < MaxX; i ++) {
			for(int count = 0; count < MaxY; count ++) {
				cell[i][count][0] = 0;
				cell[i][count][1] = 0;
			}
		}
		System.out.println("Enter command: ");
		while(true) {
			command = Sca.nextLine();
			if(command.substring(0, 3).equals("run")) {
				// Start drawing
				for(int i = 0; i < toInt(command, 4, command.length()); i ++) {
					for(int countY = MaxY; countY > 0; countY --) {
						for(int countX = 0; countX < MaxX; countX ++) {
							switch(cell[countX][countY - 1][0]) {
							case 0:
								System.out.print("-");
								break;
							case 1:
								System.out.print("O");
								break;
							}
						}
						System.out.print("\n");
					}
				// End of drawing
				// Start calculating
					for(int countY = MaxY - 1; countY >= 0; countY --) {
						for(int countX = 0; countX < MaxX; countX ++) {
							int BesideCells = BesideCells(countX, countY);
							cell[countX][countY][1] = 0;
							for(int count = 0; count < condition.length; count ++) {
								if(BesideCells == condition[count]) {
									cell[countX][countY][1] = 1;
									break;
								}
							}
						}
					}
					// End of caculating
					for(int countY = MaxY - 1; countY > 0; countY --) {
						for(int countX = 0; countX < MaxX; countX ++) {
							cell[countX][countY][0] = cell[countX][countY][1];
						}
					}
					System.out.print("\n");
					try {
						Thread.sleep(delay);
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}else if(command.substring(0, 3).equals("set")) {
				int setX, setY, status;
				setX = toInt(command.substring(4, command.indexOf(",")), 0, command.substring(4, command.indexOf(",")).length()) - 1;
				setY = toInt(command.substring(command.indexOf(",") + 1, command.lastIndexOf(",")), 0, command.substring(command.indexOf(",") + 1, command.lastIndexOf(",")).length()) - 1;
				status = toInt(command.substring(command.lastIndexOf(",") + 1), 0, command.substring(command.lastIndexOf(",") + 1).length());
				cell[setX][setY][0] = status;
			}else if(command.substring(0, 3).equals("end")) {
				break;
			}else if(command.substring(0, 5).equals("clear")) {
				for(int i = 0; i < MaxX; i ++) {
					for(int count = 0; count < MaxY; count ++) {
						cell[i][count][0] = 0;
						cell[i][count][1] = 0;
					}
				}
			}else if(command.substring(0).equals("reset")) {
				setup();
				System.out.println("Reset finished.");
			}else {
				System.out.println("Error, unknown command: " + command);
			}
		}
		System.out.println("Game over");
	}
}
