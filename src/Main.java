import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<City> city = new ArrayList<>();
        city.add(new City(3, "Delhi", 987972));

        for (int i = 0; i < city.size(); i++) {
            if (city.get(i).getCode() % 2 != 0) {
                Set<City> citySet = new TreeSet<>();
                citySet.add(city.get(i));
                System.out.println(citySet);
               System.out.println(city.get(i).getCode()+" Odd number");
            }else if (city.get(i).getCode()%2==0){
                System.out.println(city+" Even number");
            }
            }
    }
}
