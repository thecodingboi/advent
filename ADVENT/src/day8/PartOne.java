package day8;

import java.io.*;
import java.util.*;

public class PartOne {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("C:\\Users\\imaji\\Desktop\\z\\advent\\day 8.txt"));
        List<String> instructions = new ArrayList<>();
        List<Integer> done = new ArrayList<>();
        int accumulator = 0;
        while (s.hasNextLine())
        {
            instructions.add(s.nextLine());
        }

        for (int i = 0; !done.contains(i); i++)
        {
            done.add(i);
            String instr = instructions.get(i);
            int value = Integer.parseInt(instr.substring(4));
            if (instr.startsWith("acc"))
            {
                accumulator += value;
            }
            else if (instr.startsWith("jmp")) 
            {
                i += value;
                i--;
            }
        }
        System.out.println(accumulator);
    }

    public static void method(String a) throws FileNotFoundException {

    }
}
