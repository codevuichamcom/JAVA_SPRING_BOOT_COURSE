public class App {

    // Bai toán: Phát triển 1 tính năng phức tạp Nhất Thế giới
    public static void main(String[] args) throws Exception {

        BubbleSort bubbleSort = new BubbleSort();
        QuanSort quanSort = new QuanSort();
        VeryComplexService service = new VeryComplexService(bubbleSort);
        int[] numbers = new int[] { 2, 1, 4, 5, 3 };
        service.complexFunction(numbers);
    }
}
