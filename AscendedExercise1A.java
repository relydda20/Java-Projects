public class AscendedExercise1A {
    public static void main(String[] args) {
        String[] binusID = {"2440065163", "2440090266",  "2440061285", "2440090266", "2440077301"};
        String[] name = {"Rohan", "Jason",  "Chris", "Ardelia", "Monique"};
        String[] color = {"Black", "White",  "Black", "Black", "Blue"};

        for (int i = 0; i<5-1; i++) {
            for (int j = i+1 ; j<5; j++) {
                if (name[i].compareTo(name[j])>0) {
                    String tempName = name[i];
                    String tempColor = color[i];
                    name[i] = name [j];
                    color[i] = color [j];
                    name[j] = tempName;
                    color[j] = tempColor;
                }
            }
        }
        System.out.println("Sorted by Name: ");
        for (int i = 0; i<5; i++) {
            System.out.print(name[i] + "\t");
            System.out.println(color[i]);
        }

        for (int i = 0; i<5-1; i++) {
            for (int j = i+1 ; j<5; j++) {
                if (color[i].compareTo(color[j])>0) {
                    String tempName = name[i];
                    String tempColor = color[i];
                    name[i] = name [j];
                    color[i] = color [j];
                    name[j] = tempName;
                    color[j] = tempColor;
                }
            }
        }

        System.out.println("Sorted by Color: ");
        for (int i = 0; i<5; i++) {
            System.out.print(name[i] + "\t");
            System.out.println(color[i]);
        }
    }
}