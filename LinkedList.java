public class LinkedList {

	Node head = null;


	public LinkedList ()
	{

	}

	public LinkedList (Node head)
	{
		this.head =head;
	}

	
	public void add (Object input)
	{
		Node inputNode_LL = new Node (input);
		if(head == null)
		{
			head = inputNode_LL;
		}
		else
		{
			Node temp = head;
			head= inputNode_LL;
			head.setLink(temp);
		}

	}
	public void addFront (Object data)
	{
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else {
		newNode.setLink(head);
		head = newNode;
		}
		
	}

	public void Addtohead(Object data) {
		Node newNode = new Node(data);
		newNode.data = data;
		newNode.link = head;
		head = newNode;
	}
	public String display ()
	{

		String output = "";
		Node temp = head;
		while(temp != null)
		{
			output += temp.getData()+" ";
			temp = temp.getLink();
		}


		return output;
	}

	public int size ()
	{
		int size = 0;

		Node temp = head;

		while ( temp != null)
		{
			size++;
			temp = temp.getLink();
		}

		return size;
	}

	public boolean search (Object input)
	{
		Node temp = head;

		while(temp != null)
		{
			if (temp.getData().equals(input) == true)
			{
				return true;
			}
			else
			{
				temp = temp.getLink();
			}
		}
		return false;
	}


	public boolean remove (Object input)
	{
		if(head == null)
		{
			System.out.println("SLL is empty!");
			return false;
		}
		else if (head.getData().equals(input) == true)
		{
			head = head.getLink();
			return true;
		}
		else 
		{
			Node prev = head;
			Node temp = prev.getLink();

			while(temp != null)
			{
				if(temp.getData().equals(input) == true)
				{
					prev.setLink(temp.getLink());
					return true;
				}

				prev = temp;
				temp = temp.getLink();

			}

			return false;
		}

	}
	public Node getNode(int element)
	{
		Node temp=head;
		for(int i=0;i<element;i++)
		{
			if(temp!=null)
			{
				temp=temp.getLink();
			}
		}
		return temp;
	}
	
	public Object get(Object index) {
		Node temp = head;
		for (int i = 0; i < (int)index; i++) {
			temp = temp.getLink();
		}
		return temp.getData();
	}
	public char head() {

		return (char) head.data;
	}

	public Node getNthElem(int index)
    {
        Node temp = head;
        for(int i=0; i<index; i++)
        {
            temp = temp.getLink();
        }
        return temp;
    }
}