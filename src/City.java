public class City implements Comparable {
    private int code;
    private String name;
    private int cityDwellers;

    public City(int code, String name, int cityDwellers) {
        this.code = code;
        this.name = name;
        this.cityDwellers = cityDwellers;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getCityDwellers(){
        return cityDwellers;
    }
    public void setCityDwellers(int cityDwellers){
        this.cityDwellers = cityDwellers;
    }

    @Override
    public String toString() {
        return "City{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", cityDwellers=" + cityDwellers +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
