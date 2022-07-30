public class Girl {
    private String name;
    private IOutfit outfit;

    public Girl(String name, IOutfit outfit) {
        this.name = name;
        this.outfit = outfit;
    }

    public void setOutfit(IOutfit outfit) {
        this.outfit = outfit;
    }

    public void showOutfit() {
        System.out.println("Co gai: " + this.name);
        outfit.wear();
    }
}
