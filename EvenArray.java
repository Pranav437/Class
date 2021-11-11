public class EvenArray {
    int [] a = {2,3,4,3,1,5,6,7,3,8,96,22};
    int count = 0;
    public int evenCount (){
        for (int i = 0; i<a.length; i++){
            if (a[i] % 2 == 0){
              count+= 1;
            }
        }
    return count;
    }
}
