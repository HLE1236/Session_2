public class SPT {
    public static void main(String[] args) {
        int test = 100_000;
        String text = "Hoang_Le";
        long startTime = System.nanoTime();
        String result = "";
        for (int i = 0; i < test; i++) {
            result += text; 
        }
        long endTime = System.nanoTime();
        long durationString = endTime - startTime;
        System.out.println("Thời gian cộng chuỗi với String: " + durationString + " ns");
        startTime = System.nanoTime();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < test; i++) {
            sb.append(text);
        }
        endTime = System.nanoTime();
        long durationStringBuffer = endTime - startTime;
        System.out.println("Thời gian cộng chuỗi với StringBuffer: " + durationStringBuffer + " ns");
    }
}
// code by Hoang_le