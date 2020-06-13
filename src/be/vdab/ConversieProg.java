package be.vdab;

public class ConversieProg {
    public static void main(String[] args) {
        var convertor = new Convertor();
        for (var centimeters = 1; centimeters <= 10; centimeters++){
            System.out.println(centimeters + " cm = "+convertor.centimetersToInches(centimeters)+" inches");
        }
    }
}
