package ex_29_Interface;

import javax.print.Doc;

public class Lab273_7thJuly_Task5 {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
        doc.show();
    }
}
interface Printable
{
void print();
}
interface Showable
{
    void show();
}
class Document implements Printable,Showable
{
    @Override
    public void print() {
        System.out.println("Printing Document");
    }

    @Override
    public void show() {
        System.out.println("Showing Document");
    }
}