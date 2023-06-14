import java.util.*;
import java.util.stream.Collectors;

class Solution {
    
    static class Music{
        String genre;
        int play;
        int idx;

        public Music(String genre, int play, int idx) {
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }
    }
    
    public ArrayList<Integer> solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0)+plays[i]);
        }
        
        ArrayList<String> genreOrder = new ArrayList<>();
        
        List<Map.Entry<String, Integer>> entries = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList());
        
        ArrayList<Music> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : entries) {
            ArrayList<Music> list = new ArrayList<>();
            for(int i = 0; i < genres.length; i++) {
                if(entry.getKey().equals(genres[i])) {
                    list.add(new Music(entry.getKey(), plays[i], i));
                }
            }
            Collections.sort(list, (o1, o2) -> o2.play - o1.play);
            result.add(list.get(0)); 	
            if(list.size()!=1){ 	
                result.add(list.get(1));
            }
        }
        
        for(int i = 0; i < result.size(); i++) {
            answer.add(result.get(i).idx);
        }
        
        return answer;
    }
}