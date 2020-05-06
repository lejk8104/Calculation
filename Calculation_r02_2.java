
/**
 * WBT by Statement Coverage & Decision Coverage
 *
 * @author (우메모토세이야 2018315056/이재근 2015225129)
 * @version (2020.5.05)
 */
public class Calculation_r02_2
{
    /**
     * Return smallest value
     *
     * @param  x  1st number
     * @param  y  2nd number
     * @return    smallest value
     */
    public int min(int x, int y){
        if(x<y) // x>y를 x<y로 수정
            y = x;
        return y;
    }
    
    /**
     * 2차원 평면의 좌표값(x, y)가 size * size 영역 내부에 존재하는지 여부를 판정
     *
     * @param  x  1st number
     * @param  y  2nd number
     * @param  size size
     * @return    true or false 
     */
    public boolean isValidPosition(int x, int y, int size){
        boolean result;
        if(Math.abs(x)<Math.abs(size)&&Math.abs(y)<Math.abs(size)) // result의 값을 true로 수정
            result = true;
        else
            result = false;
        return result;
    }
}
