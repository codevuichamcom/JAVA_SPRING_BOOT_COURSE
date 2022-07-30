public class VeryComplexService {

    private ISortAlgorithm sortAlgorithm;

    public VeryComplexService(ISortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    // Hàm xử lý rất phức tạp
    // Một trong số đó là việc sắp xếp dữ liệu đầu vào(Tăng dần)
    public void complexFunction(int[] numbers) {
        sortAlgorithm.sort(numbers);

        // Xử lý các logic phức tạp
    }
}
