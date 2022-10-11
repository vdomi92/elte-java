package utils;

public class DoubleVector{

    private double[] coordinates;

    public DoubleVector(){
        this.coordinates = new double[]{0,0};
    }
    public DoubleVector(double[] coords){
        this.coordinates = coords;
    }

    public void setVectorCoordinates(double[] newCoordinates){
        this.coordinates = newCoordinates;
    }

    public DoubleVector multiplyVectors(DoubleVector v){
        
        if(this.coordinates.length != v.coordinates.length){
            System.out.println("Vectors must be of the same dimension");
        }else{
            double[] v3coords = new double[this.coordinates.length];
            for(int i = 0; i < this.coordinates.length; i++){
                v3coords[i] = this.coordinates[i] * v.coordinates[i];
            }
            this.setVectorCoordinates(v3coords);
        }

        return this;
    }

    public DoubleVector add(DoubleVector v){
        if(this.coordinates.length != v.coordinates.length){
            System.out.println("Vectors must be of the same dimension");
        }else{
            double[] v3coords = new double[this.coordinates.length];
            for(int i = 0; i < this.coordinates.length; i++){
                v3coords[i] = this.coordinates[i] + v.coordinates[i];
            }
            this.setVectorCoordinates(v3coords);
        }

        return this;
    }

    public DoubleVector deduct(DoubleVector v){
        if(this.coordinates.length != v.coordinates.length){
            System.out.println("Vectors must be of the same dimension");
        }else{
            double[] v3coords = new double[this.coordinates.length];
            for(int i = 0; i < this.coordinates.length; i++){
                v3coords[i] = this.coordinates[i] - v.coordinates[i];
            }
            this.setVectorCoordinates(v3coords);
        }

        return this;
    }

    public DoubleVector multiplyByScalar(double scalar){
        for(double element: this.coordinates){
            element *= scalar;
        }
        return this;
    }

    public String toString(){
        String str = new String();
        str = "V(";
        for(int i = 0; i < this.coordinates.length; i++){
            if(i == this.coordinates.length - 1){
                str += this.coordinates[i];
            }else{
                str += this.coordinates[i] + ", ";
            }
        }
        str += ")";
        return str;
    }

    public static void main(String[] args){

    }
}
