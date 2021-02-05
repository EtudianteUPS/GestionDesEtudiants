package fr.miage.toulouse.l3.gestiondesetudiants.modele;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import java.io.File;
import java.io.FileReader;


import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SophiaNachin
 */
public class UETest {            
    public static void main(String[] args) throws IOException{
        try {
            UE maths = new UE("SM1", "Maths", 1);
            UEOuverture theatre = new UEOuverture("OT1", "theatre", 3);
            ArrayList<UE> l = new ArrayList<UE>();
            l.add(maths);
            //UE outilstats = new UE("SOS1", "Outils Statistique", 6, 1, l);
            
            System.out.println(maths.toString());
            System.out.println(theatre.toString());
            //System.out.println(outilstats.toString());                   
                    
        }
        catch (ValeurCreditErronee v){
            System.out.println(v);
        }
        
        
        List<HashMap<String, String>> myArrList = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> map;

        /*** Rows 1 ***/
        map = new HashMap<String, String>();
        map.put("CustomerID", "C001");
        map.put("Name", "Ajay Kumar");
        map.put("Email", "ajay@gmail.com");
        map.put("CountryCode", "TH");
        map.put("Budget", "1000000");
        map.put("Used", "600000");
        myArrList.add(map);

        /*** Rows 2 ***/
        map = new HashMap<String, String>();
        map.put("CustomerID", "C002");
        map.put("Name", "Rahul Kumar");
        map.put("Email", "Rahul.kumar@gmail.com");
        map.put("CountryCode", "UK");
        map.put("Budget", "2000000");
        map.put("Used", "800000");
        myArrList.add(map);

        /*** Rows 3 ***/
        map = new HashMap<String, String>();
        map.put("CustomerID", "C003");
        map.put("Name", "Wasim Akram");
        map.put("Email", "waism.atnet@rediff.com");
        map.put("CountryCode", "US");
        map.put("Budget", "3000000");
        map.put("Used", "600000");
        myArrList.add(map);

        /*** Rows 4 ***/
        map = new HashMap<String, String>();
        map.put("CustomerID", "C004");
        map.put("Name", "Santosh Kumar");
        map.put("Email", "santosh.ku@yahoo.com");
        map.put("CountryCode", "US");
        map.put("Budget", "4000000");
        map.put("Used", "100000");
        myArrList.add(map);
        
        
       File file = new File("SOPHIALABLG.csv");
        // Create a File and append if it already exists.
        Writer writer = new FileWriter(file, true);
        Reader reader = new FileReader(file);
        //Copy List of Map Object into CSV format at specified File location.
        csvWriter(myArrList, writer);
        //Read CSV format from specified File location and print on console..
        csvReader(reader);
        
       
    }
    
    
    public static void csvWriter(List<HashMap<String, String>> listOfMap, Writer writer) throws IOException {
        CsvSchema schema = null;
        CsvSchema.Builder schemaBuilder = CsvSchema.builder();
        if (listOfMap != null && !listOfMap.isEmpty()) {
            for (String col : listOfMap.get(0).keySet()) {
                schemaBuilder.addColumn(col);
            }
            schema = schemaBuilder.build().withLineSeparator("\r").withHeader();
        }
        CsvMapper mapper = new CsvMapper();
        mapper.writer(schema).writeValues(writer).writeAll(listOfMap);
        writer.flush();
    }
    
    
    public static  void csvWriter(Collection collection, Writer writer) throws IOException {
        if (collection != null && collection.size() > 0) {
            CsvMapper mapper = new CsvMapper();
            Object[] objects = collection.toArray();
            Class type = objects[0].getClass();
            CsvSchema schema = mapper.schemaFor(type).withHeader();
            mapper.writer(schema).writeValues(writer).write(objects);
        } else {
            writer.write("No Data");
        }
        writer.flush();
    }
    
    
    public static void csvReader(Reader reader) throws IOException {
        Iterator<Map<String, String>> iterator = new CsvMapper()
                .readerFor(Map.class)
                .with(CsvSchema.emptySchema().withHeader())
                .readValues(reader);
        while (iterator.hasNext()) {
            Map<String, String> keyVals = iterator.next();
            System.out.println(keyVals);
        }
    }
}
