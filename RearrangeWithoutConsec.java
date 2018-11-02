package CrackingTheCodingInterview;

import java.util.PriorityQueue;




public class RearrangeWithoutConsec {
    public PriorityQueue<Key> pq = new PriorityQueue<>();
    public int[] freqs = new int[26];

    class Key implements Comparable<Key> {
        int freq;
        char c;

        public Key(char c, int freq){
            this.c = c;
            this.freq = freq;
        }

        @Override
        public int compareTo(Key obj) {
            if(this.freq > obj.freq){
                return 1;
            }else if (this.freq == obj.freq){
                return 0;
            }else{
                return -1;
            }
        }
    }

    public void getCount(char[] ch){
        for(int i=0;i<ch.length;i++){
            freqs[ch[i] - 'a']++;
        }
    }

    public String reArragne(String str1){
        String str = str1;
        char[] ch = str.toCharArray();
        getCount(ch);
        for(char c='a';c<'z';c++){
            if(freqs[c-'a'] > 0){
                pq.add(new Key(c,freqs[c-'a']));
            }
        }
        Key prev = new Key('#',-1);
        StringBuilder strb = new StringBuilder();
        while(!pq.isEmpty()){
            Key temp = pq.poll();
            strb.append(temp.c);
            if(prev.freq > 0){
                pq.add(prev);
            }
            temp.freq--;
            prev = temp;
        }
        return strb.toString();
    }



}
