

/*
*                                     每日一题
*
*
* 有一个数组,其中对于任意两个数组,若前面一个大于后面一个数字,则两个数字组成一个逆序对
* 请设计一种高效的算法,计算逆序对个数
* 给定一个int 数组A 和他的大小n,请返回A 中的逆序对个数,保证n小于等于5000
*
* 输入{1,2,3,4,5,6,7,0}  8
*
* 返回7
*
* */

public class Test {
    public static Integer count(int[] array, int n) {
        if (n > array.length && n > 5000 ){
            return null;
        }

        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            int j = i + 1;
            while (j < array.length) {
                if (array[i] > array[j]) {
                    count1++;
                }
                j++;
            }
        }
        return count1;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,0};
        int n = 8;
        System.out.println(count(array,n));
    }
}
