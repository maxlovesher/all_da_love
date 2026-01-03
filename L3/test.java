public class test {
 int a, b, c, d;
 test(){
    this(0,0,0,0);
 }
 test(int a){
    this(a,0,0,0);
 }
 test(int a, int b){
    this(a,b,0,0);
 }
 test(int a, int b, int c){
    this(a,b,c,0);
 }
 test(int a, int b, int c, int d){
     this(a,b,c,d);
 } 

 test(){
    
 }
 test(int a){
    this(0,0,0,0);
    this.a=a;
 }
 test(int a, int b){
    this(a,0,0,0);
    this.b=b;
 }
 test(int a, int b, int c){
    this(a,b,0,0);
    this.c=c;   
 }
 test(int a, int b, int c, int d){
     this(a,b,c,0);
     this.d=d;
 } 







}
