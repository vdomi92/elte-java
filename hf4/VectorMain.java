import utils.DoubleVector;

class VectorMain{

    public static void main(String[] args){
        DoubleVector vector1 = new DoubleVector(new double[]{1.0, 1.0});
        DoubleVector vector2 = new DoubleVector();
        DoubleVector vector3 = new DoubleVector(new double[]{1.2, 3.3, 6.4, 5.2, 10.13});

        try{
            System.out.println(vector1.multiplyByScalar(Math.PI).toString());
            System.out.println(vector2.multiplyByScalar(Math.PI).toString());
            System.out.println(vector3.multiplyByScalar(Math.PI).toString());

            System.out.println(vector1.deduct(vector1).toString());
            System.out.println(vector2.deduct(vector2).toString());
            System.out.println(vector3.deduct(vector3).toString());

            System.out.println(vector1.add(vector1).toString());
            System.out.println(vector2.add(vector2).toString());
            System.out.println(vector3.add(vector3).toString());

            System.out.println(vector1.multiplyVectors(vector1).toString());
            System.out.println(vector2.multiplyVectors(vector3).toString());
            System.out.println(vector3.multiplyVectors(vector3).toString());     
        }catch(Exception e){
            System.out.println("Invalid vector dimensions");
        }
   
    }
}