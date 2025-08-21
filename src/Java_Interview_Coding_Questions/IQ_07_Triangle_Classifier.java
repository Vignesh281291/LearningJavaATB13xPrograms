package Java_Interview_Coding_Questions;

public class IQ_07_Triangle_Classifier {

    //        Write a program that classifies a triangle based on its side lengths.
    //        Given three input values representing the lengths of the sides,
    //        determine if the triangle is equilateral (all sides are equal)
    //        isosceles (exactly two sides are equal), or scalene (no sides are equal).
    //        Use an if-else statement to classify the triangle.
    public static void main(String[] args) {
        int s1=10;
        int s2=10;
        int s3=10;
        if(s1==s2 && s2==s3)
        {
            System.out.println("Triangle is equilateral as all sides are equal");
        } else if (s1==s2 || s2==s3 || s1==s3) {
            System.out.println("Triangle is isosceles as exactly 2 sides are equal");
        }
        else{
            System.out.println("Triangle is scalene as no sides are equal");
        }
    }
}