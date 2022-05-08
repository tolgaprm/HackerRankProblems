import kotlin.math.abs

class HackerRankProblems(){

    fun diagonalDifference(arr: Array<Array<Int>>) :Int{
        // Write your code here
        var leftToRight = 0
        var rightToLeft = 0
        for (i in 0 until arr[0].size){
            for (j in 0 until arr[1].size){
               if(i == j){
                   leftToRight += arr[i][j]
               }

                if(i+j == arr.size-1){
                    rightToLeft += arr[i][j]
                }

            }
        }

        return abs(rightToLeft - leftToRight)

    }

}