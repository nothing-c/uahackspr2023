import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.lang.Double;
import java.lang.Long;
//db stuff; in-mem
//because we're using an ArrayList, we can use indexOf() and save ourselves time on queries
public class db {
    //dummy, we may store this in main on the actual server, we may not
    public ArrayList<Coordinates> db;
    public void add(Coordinates n){this.db.add(n);}
    //return -1 for failure, pass filename
    //TODO: this assumes toString in gps that outputs in proper CSV order
    //also, idk if the bufferedwriter will work (need to test)
    public static int dump(db d,String f){Path p=Paths.get(f);OpenOption[] o={StandardOpenOption.WRITE, StandardOpenOption.APPEND, StandardOpenOption.CREATE};for(Coordinates g:d.getdb()){String s=g.toString();s+="\n";try{BufferedWriter w=Files.newBufferedWriter(p,o);w.write(s,0,s.length());w.flush();}catch(IOException e){e.printStackTrace();return -1;}}return 0;}
    public db(){this.db=new ArrayList<Coordinates>();}
    //new db and pull from file
    //IDK if catching will screw us up or if we can recover
    //it autochomps
    //TODO: this also just creates a thing; so we need to check if it's broken
    public db(String f){this.db=new ArrayList<Coordinates>();Path p=Paths.get(f);try{BufferedReader s = Files.newBufferedReader(p);String l;while((l = s.readLine())!=null){String[] a=l.split(",");db.add(new Coordinates(Double.parseDouble(a[1]),Double.parseDouble(a[2]),Long.parseLong(a[0])));}}catch(IOException e){e.printStackTrace();}}
    public ArrayList<Coordinates> getdb(){return this.db;}
}
