import com.company.Cow;
import com.company.Farm;
import com.company.Hourse;
import com.company.Sheep;

public class Main {
    public static void main(String[] args) {

        Sheep sheep = new Sheep(19.5,6,"erkek","Polly");
         Sheep sheep1 = new Sheep(23.3,5,"urgaachy","kashka");
             Sheep sheep2 =new Sheep(24.3,3,"urgachu","mooly");
             Cow cow =new Cow(80,4,"Уй","Dolly");
        Cow cow1 =   new Cow(87,6,"Уй","Anabel");
        Cow cow2 =     new Cow(90,7,"Бука","Buch");
        Cow cow3= new Cow(78,5,"Уй","Doolisia");
        Cow cow4 =  new Cow(76.5,6,"Уй","Elizabet");
        Hourse hourses = new Hourse(90,5,"Бээ","Gulsarat","grow");
        Hourse hourses1=new Hourse(90,6,"Бээ","Кашкабээ","black");
             Sheep sheep3 = new Sheep(23.3,5,"urgaachy","Nendi");
                Cow cow5 =new Cow(76.5,6,"Уй","Kendi");
               Hourse hourse3 = new Hourse(90,5,"Aйгыр","Торуайгыр","grow");
        Farm farm = new Farm("Bill","taxas str117",new Cow[]{cow,cow1,cow2,cow3,cow4},new Hourse[]{hourses},new Sheep[]{sheep,sheep1,sheep2});
        System.out.println(farm);
        Farm farm1 = new Farm("Jony","Texas str123",new Cow[]{cow5},new Hourse[]{hourse3},new Sheep[]{sheep3});System.out.println(farm1);
}}