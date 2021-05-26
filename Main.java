package lab8;

import java.util.*;

public abstract class Main {

    public static void main(String[] args) {

        //Menu test = new Menu();
        //test.menu();

        Document papa = new Document("Papa");
        Document aba = new Document("aba");
        Document wala = new Document("wala");
        List<Document> dc = new ArrayList<>();
        dc.add(papa);
        dc.add(aba);
        dc.add(wala);


        dc.sort(new Document.CompareDocument());
        System.out.println(dc);


        TextDocument vga = new TextDocument("vga", 132);
        TextDocument abr = new TextDocument("abr", 123);
        List<Document> td = new ArrayList<>();
        td.add(vga);
        td.add(abr);

        td.sort(new Comparator<Document>(){

            @Override
            public int compare(Document o1, Document o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        System.out.println(td);
    }

}
