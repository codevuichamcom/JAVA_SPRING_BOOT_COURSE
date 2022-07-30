public class App {
    public static void main(String[] args) throws Exception {
        Girl ngoctrinh = new Girl("Ngoc Trinh", new Tshirt());
        ngoctrinh.showOutfit();
        ngoctrinh.setOutfit(new Bikini());
        ngoctrinh.showOutfit();
    }
}
