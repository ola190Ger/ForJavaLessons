package com.company;

public class GlossaryItem {
    private String word;
    private int count;

    public GlossaryItem() {
    }

    public GlossaryItem(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "GlossaryItem{" +
                "word='" + word + '\'' +
                ", count=" + count +
                '}';
    }
}
