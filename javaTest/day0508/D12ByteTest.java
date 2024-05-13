class D12ByteTest 
{
	public static void main(String[] args) 
	{
		byte data;//1바이트 확보
		data = 127;
		data = (byte)(data + 1);
		System.out.println(data);
	}
}
