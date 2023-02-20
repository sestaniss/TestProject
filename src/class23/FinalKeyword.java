package class23;

public class FinalKeyword {

     double gravity=908;

    final double PI=3.14;

    final double LightSpeed=299792458;

    void tryChangingGravity(){
        gravity=1.6; //we get an error because this variable is marked final
    }
}
