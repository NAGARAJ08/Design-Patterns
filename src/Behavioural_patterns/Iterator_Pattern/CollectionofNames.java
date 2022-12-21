package Behavioural_patterns.Iterator_Pattern;

public class CollectionofNames implements Container{

	public String name[]= {"ABC","BCD","CDE","DEF","EFG"};
	
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new  CollectionofNamesIterate();
	}
	
	private class  CollectionofNamesIterate implements Iterator{
		
		int i;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(i<name.length) {
			return true;
			}
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if(this.hasNext()) {
				return name[i++];
			}
			return null;
		}
		
	}

	
}
