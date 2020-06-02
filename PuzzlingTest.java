import java.util.Arrays;

class PuzzlingTest{
    public static void main(String[] args){
        Puzzling p = new Puzzling();
        System.out.println(Arrays.toString(p.sumNumbers()));
        System.out.println(Arrays.toString(p.shufflePrint()));
        p.shuffleAlpha();
        System.out.println(Arrays.toString(p.getRandom()));
        p.sortedRandom();
        System.out.println(p.randomString());
        System.out.println(Arrays.toString(p.tenRandomString()));
    }
}