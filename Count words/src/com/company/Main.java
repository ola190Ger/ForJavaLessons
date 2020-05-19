package com.company;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        //working timer
        int start= LocalDateTime.now().getSecond();


        Integer val=0;
        String path ="C:\\Users\\Dell\\Desktop\\Harry Potter and the Goblet of Fire - Joanne Kathleen Rowling.txt";
        String Mystr = Files.readString(Paths.get(path));
                //new String(Files.readAllBytes(Paths.get("Harry Potter and the Goblet of Fire - Joanne Kathleen Rowling.txt")), StandardCharsets.UTF_8);

                String myStr2=Mystr.replaceAll("[^A-Za-z ]", "").toLowerCase();

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
//          sorted to volume
//        TreeMap<String,Integer> sorted= new TreeMap<>();
//        sorted.putAll(glossary);
        System.out.println(sortedByCount);

        //create array all words
        final String[] arrayAllWords = myStr2.split(" ");
        System.out.println("Total words: " +arrayAllWords.length);

        Set<String> set = new TreeSet<>();
        set.addAll(Arrays.asList(arrayAllWords));

        System.out.println("Unique words: " +set.size());
        // make with stream
        Set<String> setStream = new TreeSet<>();
        setStream.addAll(Arrays.asList(arrayAllWords));
        System.out.println("Unique words with stream: " +setStream.size());
        //tmp array unique words

        final Object[] uniqueWords = set.toArray();
//        for (int i = 0; i < 10 ; i++) {
//            System.out.println(uniqueWords[i].toString());
//        }
        //array counts word
        int [] counts= new int[uniqueWords.length];
        for (int i = 0; i < uniqueWords.length; i++) {
            for (String s : arrayAllWords)
                if (uniqueWords[i].equals(s))
                    counts[i]++;
        }
//        for (int i = 0; i < 10 ; i++) {
//            System.out.println(uniqueWords[i].toString()+" "+ counts[i]);
//        }
        List<GlossaryItem> glossaryWords = new ArrayList<>();
        for (int i = 0; i < uniqueWords.length ; i++) {
        glossaryWords.add(new GlossaryItem(uniqueWords[i].toString(), counts[i]));
        }
        List<GlossaryItem> sorted = glossaryWords.stream()
                .sorted(Comparator.comparing(GlossaryItem::getCount).reversed())
                .collect(Collectors.toList());


            System.out.println(sorted);


            //String mrX = sorted.stream().filter(e->e.getCount()==876).collect(Collectors.toList()).get(0).getWord();
            //System.out.println(mrX);

        //working timer finish
        int finish = LocalDateTime.now().getSecond();
        System.out.println("Time spent: " + (finish-start)+"sec");

    }
}
