package hk;

public class SeqList {
	protected int n;
	protected Object[] element;
	private static final int MIN_CAPACITY=16;
	public SeqList(int length) {
		if(length<MIN_CAPACITY)
			length=MIN_CAPACITY;
		this.element=new Object[length];
		this.n=0;
	}
	public SeqList() {
		this(MIN_CAPACITY);
	}
	public SeqList(Object[] values) {
		this(values.length*2);
		for(int i=0;i<values.length;i++)
			if(values[i]!=null)
				this.element[this.n++]=values[i];
	}
	//插入方法
	public int insert(int i,Object x) {
		if(x==null)
			return -1;
		if(i<0)
			i=0;
		if(i>this.n)
			i=this.n;
		Object[] source=this.element;
		if(this.n==element.length) {
			this.element =new Object[source.length*2];
		}
			for(int j=0;j<i;j++)
				this.element[j+1]=source[j];
			this.element[i]=x;
			this.n++;
			return i;
		}
	public int insert(int x) {
		//测试语句
		//System.out.println("6666");
		return this.insert(this.n, x);
		
	}
	public int remove(int i) {
		if(i>=0&&i<this.n) {
			int x=(int)this.element[i];
			for(int j=1;j<this.n-1;j++)
				this.element[j]=this.element[j+1];
			this.element[this.n-1]=null;
			/*this.n--;
			return x;*/
		}
		return -1;
	}
	public void clear() {
		this.n=0;
		}
	public void look(int x,int y) {
		int st=0;
		int j=n;
		for(int i=0;i<n;i++)
		if((Integer)element[i]>=x&&(Integer)element[i]<=y) {
			element[i]=null;
			j--;
	}
		Object[] m=new Object[j];
		for(int i=0;i<element.length;i++) {
		if(element[i]!=null) {
			m[st]=element[i];
			System.out.println(m[st]);
			st++;
		}
	}
		element=m;
		System.out.println(element[0]);
	}
	public void move() {
		Object[] g=new Object[n];
		int p=0;
		int temp;
		for(int i=0;i<element.length;i++) {
			if(element[i]!=null&&(Integer)element[i]<0) {
				temp=(int)element[p];
				element[p]=element[i];
				element[i]=(Object)temp;
				p++;
			}/*else if(element[i]!=null&&(Integer)element[i]>0){
				g[n-1]=element[i];
				n--;
			}*/
		}
		System.out.println(g[0]);
		System.out.println(g[1]);
		System.out.println(g[2]);
		System.out.println(g[3]);
		System.out.println(g[4]);
		System.out.println(g[5]);
		System.out.println(g[6]);
	}
	
	


}
	

