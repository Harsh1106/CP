public class ConvertDateToBinary {
    public static String convertDateToBinary(String date) {
        String y = date.substring(0,4);
        String m = date.substring(5,7);
        String d = date.substring(8,10);
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toBinaryString(Integer.parseInt(y)));
        sb.append("-");
        sb.append(Integer.toBinaryString(Integer.parseInt(m)));
        sb.append("-");
        sb.append(Integer.toBinaryString(Integer.parseInt(d)));
        return sb.toString();
    }
    public static void main(String[] args) {
        String date = "2080-02-29";
        System.out.println(convertDateToBinary(date));
    }
}
