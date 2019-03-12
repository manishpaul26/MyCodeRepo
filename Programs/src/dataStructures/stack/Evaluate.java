package dataStructures.stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Evaluate {

	public static void main(String[] args) {
		Stack<String> ops = new Stack<>();
		Stack<Double> vals = new Stack<>();
		//String expression = "(1+((2+3)*(4*5)))";
		String expression = "3+5*5";
		String[] expList = expression.split("");
		ArrayList<String> arr = new ArrayList<>();
		for (String s : expList) {
			arr.add(s);
		}
		arr.stream().forEach(System.out::println);
		int arrLength = arr.size();
		int i = 0;

		while (i<arrLength) {
			String s = arr.get(i);
			switch (s) {
			case "(": break;
			case "+":
				ops.push(s);
				break;
			case "-":
				ops.push(s);
				break;
			case "*":
				ops.push(s);
				break;
			case "/":
				ops.push(s);
				break;
			case "sqrt":
				ops.push(s);
				break;
			case ")":
				String op = ops.pop();
				double v = vals.pop();
				switch (op) {
				case "+":
					v = vals.pop() + v;
					vals.push((double) v);
					break;
				case "-":
					v = vals.pop() - v;
					vals.push((double) v);
					break;
				case "*":
					v = vals.pop() * v;
					vals.push((double) v);
					break;
				case "/":
					v = vals.pop() / v;
					vals.push((double) v);
					break;
				case "sqrt":
					v = Math.sqrt(v);
					vals.push((double) v);
					break;
				}
				break;
			default:
				vals.push(Double.parseDouble(s));
				break;
			}
			i++;
		}
		
		System.out.println(vals.pop());

	}

}
