import java.util.ArrayList;
import java.util.List;

public class Test12 {
    public static void main(String[] args){
        String[] sortArray = {"111","222","333","111"};
        System.out.println(NoNeedCopy(sortArray,111L));
    }

    public static boolean NoNeedCopy(String[] sortArray, Long audioId) {
        List<Long> sameAudioId = new ArrayList<Long>();
        String tempAudioId ="";
        for(int i = 0; i < sortArray.length; i++){
            if (tempAudioId.equals(sortArray[i])){
                sameAudioId.add(Long.valueOf(tempAudioId));
            }else {
                tempAudioId = sortArray[i];
            }
        }

        if (sameAudioId == null || sameAudioId.size() <= 0){
            return false;
        }

        if (sameAudioId.contains(audioId)){
            return true;
        }
        return false;
    }
}
