
/**
 * WhiteBox Test 연습(20200424)
 *
 * @author (우메모토세이야 2018315056/이재근 2015225129)
 * @version (2020.04.29)
 */
public class Calculation2
{
    /**
     * 1차원 배열에 저장된 정수값들 중에서 최대값을 구해서 반환하는 메소드
     *
     * @param  array  정수값들이 저장된 1차원 배열
     * @return        최대값
     */
    public static int findMax(int[] array){  
        int max = 0;  
        for(int i = 0; i < array.length; i++){  
            if(max < array[i])  
                max = array[i];  
        }  
        return max;  
    }
}
