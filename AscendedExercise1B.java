import java.util.Arrays;

public class AscendedExercise1B {
    public static void main(String[] args){
        String[] binusID = {"2440065163", "2440090266",  "2440061285", "2440090266", "2440077301"};
        String[] name = {"Rohan", "Jason",  "Chris", "Ardelia", "Monique"};
        String[] color = {"Black", "White",  "Black", "Black", "Blue"};

    for(int i=0;i<name.length;i++){
        for(int x=i+1;x<name.length;x++){
            if(name[x].charAt(0)<name[i].charAt(0)){
                String tempName=name[i];
                name[i]=name[x];
                name[x]=tempName;
            }
        }
    }
    for(int i=0;i<name.length;i++){
        System.out.println(name[i]);
    };
    for(int i=0;i<color.length;i++){
        for(int x=i+1;x<color.length;x++){
            if(color[x].charAt(0)<color[i].charAt(0)){
                String tempColor=color[i];
                color[i]=color[x];
                color[x]=tempColor;
            }
        }
    }
    System.out.println();
    for(int i=0;i<color.length;i++){
        System.out.println(color[i]);
    };

    Arrays.sort(name);
    Arrays.sort(color);
    Arrays.sort(binusID);

    System.out.println();
    for(int i=0;i<color.length;i++){
        System.out.println(color[i]);
    };
    System.out.println();
    for(int i=0;i<name.length;i++){
        System.out.println(name[i]);
    };
    System.out.println();
    for(int i=0;i<binusID.length;i++){
        System.out.println(binusID[i]);
    };
}
}    
