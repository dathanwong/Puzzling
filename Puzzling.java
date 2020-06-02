import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Puzzling {

    public Integer[] sumNumbers() {
        int[] input = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        int sum = 0;
        ArrayList<Integer> output = new ArrayList<Integer>();
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
            if (input[i] > 10) {
                output.add(input[i]);
            }
        }
        System.out.println("Sum: " + sum);
        return output.toArray(new Integer[output.size()]);
    }

    public String[] shufflePrint() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        Collections.shuffle(names);
        System.out.println(names);
        ArrayList<String> output = new ArrayList<String>();
        for (String name : names) {
            if (name.length() > 5)
                output.add(name);
        }
        return output.toArray(new String[output.size()]);
    }

    public void shuffleAlpha() {
        ArrayList<Character> alpha = new ArrayList<Character>();
        for (int i = 0; i < 26; i++) {
            alpha.add((char) (97 + i));
        }
        Collections.shuffle(alpha);
        System.out.println("Last: " + alpha.get(alpha.size() - 1) + " First: " + alpha.get(0));
        ArrayList<Character> vowels = new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        if (vowels.contains(alpha.get(0)))
            System.out.println("First character is a vowel");
        return;
    }

    public int[] getRandom() {
        int[] output = new int[10];
        Random r = new Random();
        for (int i = 0; i < output.length; i++) {
            output[i] = r.nextInt(45) + 55;
        }
        return output;
    }

    public Integer[] sortedRandom() {
        int[] array = getRandom();
        int min = array[0];
        int max = array[0];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++){
            list.add(array[i]);
            if(array[i] < min) min = array[i];
            if(array[i] > max) max = array[i];
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Max: " + max + " Min: " + min);
        return list.toArray(new Integer[list.size()]);
    }

    public String randomString(){
        Random rand = new Random();
        char[] output = {'1', '1', '1', '1', '1'};
        for(int i = 0; i < 5; i++){
            output[i] = (char) (rand.nextInt(26)+97);
        }
        return new String(output);
    }

    public String[] tenRandomString(){
        ArrayList<String> output = new ArrayList<String>();
        for(int i =0; i <10; i++){
            output.add(randomString());
        }
        return output.toArray(new String[output.size()]);
    }
}