package Queue;

public class CircularQueue {
    public static class Q{
        int f=-1;
        int r=-1;
        int arr[]=new int[6];
        int size=0;
        int n=arr.length;

        public void add(int val){
            if(size==arr.length){
                System.out.println("Queue is full");
                return;
            }
            if(size==0){
                f=r=0;
                arr[0]=val;
            }else if(r<n-1){
                arr[++r]=val;
//                size++;
            }else if(r==n-1){
                r=0;
                arr[0]=val;
//                size++;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }else{
                int x=arr[f];
                if(f==arr.length-1) f=0;
                else f++;
                size--;
                return x;
            }

        }
        public int peek(){
            if(size==0) return -1;
            return arr[r];
        }
        public boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is full");
                return;
            }else{
                if(f<=r){
                    for(int i=f;i<=r;i++){
                        System.out.print(arr[i]+ " ");
                    }
                }else if(r>f){
                    for(int i=f;i<=n-1;i++){
                        System.out.print(arr[i]+" ");
                    }
                    for(int i=0;i<=r;i++){
                        System.out.print(arr[i]+" ");
                    }
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Q q=new Q();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        q.add(5);
        q.display();
        q.add(6);
        q.display();
        q.add(7);
        q.add(9);
        q.display();

    }
}
