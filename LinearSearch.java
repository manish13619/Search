class Search{
public static void main(String args[]){
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
int a[]={10,20,305,4,5,6,87};
boolean found=false;
int sr=Integer.parseInt(br.readLine());
found=LinearSearch(a,sr);
if(found)System.out.println(No is present);
else System.out.println(No is not present);
}
public static boolean LinearSearch(int a[],int n){	
for(int i=0;i<a.length;i++){
	if(a[i]==n)return true;
return false;
}
}
