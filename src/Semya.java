public abstract  class Semya implements Plat  {
    private  String name;
    private  String adress;
    private  int price;

    public Semya(String name, String adress, int price) {
        this.name = name;
        this.adress = adress;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Semya{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int baatir() {
        return price*3;
    }

    @Override
    public int hotel() {
        return price*3;
    }

    @Override
    public int house() {
        return price*5;
    }
}
