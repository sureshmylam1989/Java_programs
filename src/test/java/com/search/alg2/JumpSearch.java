package com.search.alg2;

public class JumpSearch {
	
	public int SearchBySqRoot(int[] a,int se){
		int length = a.length;
		int jump = (int) Math.sqrt(length);
		int si =0;
		int li = jump-1;
		int jumpCounter=1;
		for(int i=0;i<jump;i++) {
			jumpCounter= jumpCounter+jump;
			if(a[si]==se) {
				return si;
			}else if(a[li]==se){
				return li;				
			}else if(a[li]<se) {
				si=jumpCounter;
				li = Math.min(jumpCounter + (jump - 1),length-1);
			}else if(a[li]>se){
				si = jumpCounter-jump;
				li = Math.min(jumpCounter,length-1);
				for(int b=0;b<jump;b++) {
					if(a[si+b]==se) {
						return si+b;
					}
				}
			}			
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
		JumpSearch obj = new JumpSearch();
		System.out.println(obj.SearchBySqRoot(arr,233));
		
	}

}
