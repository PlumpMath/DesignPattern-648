package chainofresponsibility.filters;

public class SensitiveFilter implements Filter{
	@Override
	public String doFilter(String str) {
		return str.replace("����ҵ", "��ҵ").replace("��", "��");
	}

}
