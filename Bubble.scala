object BubbleGUM{
    def main(aargs: Array[String])={
        var bubble  =  Array[Integer](15,12,4,123,2,32,5,8,36,653)
        println("Array al principio ",bubble.mkString(","))
        for ( i <- 0 to  bubble.length - 1 by 1){
            for(j <- 0 to bubble.length - 2  by 1){
                var aux = bubble(j + 1 );
                if (bubble(j) > aux){
                    bubble( j + 1) = bubble(j);
                    bubble(j) = aux;
                }
             }
        }
        println("Array al final ",bubble.mkString(","))
    }

}
