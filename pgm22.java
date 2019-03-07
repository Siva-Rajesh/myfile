#include <stdio.h>
 int main() 
{
 int i,n;
 int arr[100];
 printf("enter the 1 to 100 value");
 scanf("%d",&n);
 for(i=0;i<n;i++)
 {
  printf("enter the number:",i+1);
  scanf("%d",&arr[i]);
 }
 for(i=0;i<=n;i++)
 {
  if(arr[0]<arr[i])
   a[0]=a[i];
 }
 printf("largest element%d",a[0]);
}
