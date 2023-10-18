public class _1295_FindNumbers {
 
  public static int findNumbers(int[] nums){
    int bienDem = 0;
    for ( int a : nums){
      int soluongchuso = tinhSoChuso(a);
      // int _1295_FindNumbers.tinhSoChuso(int a)
      if ( soluongchuso % 2 == 0 ){
        bienDem++;
      }
  }
  return bienDem;
  }
  private int tinhSoChuso( int a ){
    int bienDem = 0;
    int kq = a;
    while(kq != 0){
      kq = a / 10;
      a = kq;
      bienDem++;
    }
    return bienDem;
  }
}
