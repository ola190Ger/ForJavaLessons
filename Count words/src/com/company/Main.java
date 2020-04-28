package com.company;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Integer val=0;
        String path ="C:\\Users\\Dell\\Desktop\\Harry Potter and the Goblet of Fire - Joanne Kathleen Rowling.txt";
        String Mystr = Files.readString(Paths.get(path));
                //new String(Files.readAllBytes(Paths.get("Harry Potter and the Goblet of Fire - Joanne Kathleen Rowling.txt")), StandardCharsets.UTF_8);

                String myStr2=Mystr.replaceAll("[^A-Za-zА-Яа-я0-9 ]", "").toLowerCase();

        final  String[] arr = myStr2.split(" ");

/*        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }*/
        List<String> words = Arrays.asList(arr);
        System.out.println(words.size());
        Map<String,Integer> glossary = new HashMap<>();

        for(String word:words){
        if(glossary.containsKey(word)){
            val = glossary.get(word);
            val++;
            glossary.put(word,val);
        }else{
            glossary.put(word,1);
        }

        }
        final Map<String, Integer> sortedByCount = glossary.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
                .limit(20)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

//        TreeMap<String,Integer> sorted= new TreeMap<>();
//        sorted.putAll(glossary);
        System.out.println(sortedByCount);
    }
}
