#include<stdio.h>
#include<conio.h>
struct node
{
    int d;
    struct node *link;
}*start1=NULL,*start2=NULL;

int main(){
  struct node *n,*n1;
  char ch;
  int count1,count2,i=0;
  do{
  if(start1==NULL){
    n=malloc(sizeof(struct node));
    scanf("%d",&n->d);
    n->link=NULL;
    start1=n;
    count1++;
  }
  else{
    n1=malloc(sizeof(struct node));
    n->link=n1;
    n1->link=NULL;
    n=n1;
    count1++;

  }
  printf("Want to insert a node: Y or N :");
    ch=getch();
  }while(ch=='Y');
  do{
  if(start2==NULL){
    n=malloc(sizeof(struct node));
    scanf("%d",&n->d);
    n->link=NULL;
    start2=n;
    count2++;
  }
  else{
    n1=malloc(sizeof(struct node));
    scanf("%d",&n1->d);
    n->link=n1;
    n1->link=NULL;
    n=n1;
    count2++;
  }
  printf("Want to insert a node: Y or N :");
    ch=getch();
  }while(ch=='Y');
  if(count1>count2){
    while(i!=count1-count2){
        if(i=0){
            n=malloc(sizeof(struct node));
            n->d=0;
            n->link=start2->link;
            start2=n;
        }
        else{
            n1=malloc(sizeof(struct node));
            n1->d=0;
            n->link=n1;
            n=n1;
        }
        i++;
    }
  }

  else{
        i=0;
     while(i!=count2-count1){
        if(i=0){
            n=malloc(sizeof(struct node));
            n->d=0;
            n->link=start1->link;
            start1=n;
        }
        else{
            n1=malloc(sizeof(struct node));
            n1->d=0;
            n->link=n1;
            n=n1;
        }
        i++;
    }
  }
  n=start1;
  n1=start2;
  while(n->link!=NULL){
    n->d+=n1->d;
    printf("%d->",n->d);
    n=n->link;
    n1=n1->link;
  }
  printf("NULL");
  return 0;
}
