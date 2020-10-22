package Ball;

public class Ball {

    String ballType;

    float ballDiameter;

    public Ball(String bt, float bd){

        ballType = bt;

        ballDiameter = bd;

    }

    public void SetDiameter(float diameter){

        if (diameter <= 0) { return; }

        else {ballDiameter = diameter;}

    }

    public void SetType(String bt){

        if (!bt.isEmpty()) ballType = bt;

        else ballType = "Ball";

    }

    public void KickBall(){

        System.out.println("This ball was kick!");

    }

    public String GetType(){

        return ballType;

    }

    public float GetDiameter(){

        return ballDiameter;

    }

    public void PrintInfoAboutBall(){

        System.out.println("Ball type: " + ballType + ", Ball diameter: " + ballDiameter);

    }

    @Override

    public String toString(){

        return ballType + " " + ballDiameter;

    }

}
