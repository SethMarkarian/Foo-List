import java.util.*;
public class FooList extends ArrayList<String>
{
    private final int Stringlength;
    
    public FooList(int length) {
        Stringlength = length;
    }
    
    public boolean add(String obj) {
        if(obj.length() != Stringlength) {
            return false;
        }
        super.add(obj);
        return true;
    }
    
    public void add(int index, String obj) {
        if(obj.length() == Stringlength) {
            super.add(index, obj);
        }
    }
    
    public String set(int index, String obj) {
        if(obj.length() == Stringlength) {
            String ans = super.get(index);
            super.set(index, obj);
            return ans;
        }
        return obj;
    }
    
    public String get(int i, int j) {
        return super.get(i).substring(j, j + 1);
    }
    
    public String getColumn(int j) {
        String ans = "";
        for(int i = 0; i < super.size(); i++) {
            ans += super.get(i).substring(j, j + 1);
        }
        return ans;
    }
}
