package StringBuilder;

public class Main {

  public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        String str = "{\n";
        StringBuilder st = new StringBuilder();
        st.append("{\n");
        st.append(" ");
        
        for (int i = 0; i < t.length; i++) {
            str += t[i];
            if (i != t.length - 1) {
                str += ", ";   
            }
            if(i==t.length-7){
            str += "\n";
            }
            if(i==t.length-3){
            str += "\n";
            }
        }
        return str + "\n}";
    }
}
