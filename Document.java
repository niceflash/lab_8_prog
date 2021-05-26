package lab8;

import java.util.*;

public class Document {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Document(String name){
        this.name = name;
    }

    public String toString() {
        return "File name: " + "'" + name + "'";
    }

    public static class CompareDocument implements Comparator<Document>{
        @Override
        public int compare(Document o1, Document o2) {
            return o1.name.compareTo(o2.name);
        }
    }
    public static void SortDocument(ArrayList<Document> document) {
        Collections.sort(document, new CompareDocument());

    }


}
