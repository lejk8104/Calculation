
/**
 * WBT by Statement Coverage & Decision Coverage
 *
 * @author (profsHwang)
 * @version (2020.4.29)
 */
public class Calculation_r02
{
    /**
     * Return smallest value
     *
     * @param  x  1st number
     * @param  y  2nd number
     * @return    smallest value
     */
    public int min(int x, int y){
        if(x>y)
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
        if(x<size&&y<size)
            result = false;
        else
            result = false;
        return result;
    }
}
