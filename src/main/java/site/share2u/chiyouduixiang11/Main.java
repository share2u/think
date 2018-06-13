package site.share2u.chiyouduixiang11;

public class Main {
    public static void main(String[] args) {
        StringBuilder timeplan = new StringBuilder("000000000000000000000000000000000000000000000000");
        //000000000000000000000000000000000000000000000000
        int len = timeplan.length();
        //获取系统固定工作时间
        String worktime ="111111111111111100000000000000000000000011111111";
        int startindex = worktime.indexOf("0");//16
        int endindex = worktime.lastIndexOf("0");//
        int duration = 6;//工作时长 3小时
        int location = 16;//几点上班
        for (int i = 0; i < duration; i++) {
            int index = location + i;
            if (location < startindex || (location + duration) > endindex) {
                if (index > 0 && index < len) {
                    timeplan.setCharAt(index, '1');
                }
            } else {
                if ((index <= endindex) && (index >= startindex)) {
                    timeplan.setCharAt(index, '1');
                }
            }
        }

        System.out.println(timeplan.toString());
    }
}
