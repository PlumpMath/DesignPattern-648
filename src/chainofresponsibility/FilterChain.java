package chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

import chainofresponsibility.filters.Filter;
/**
 * ����������Ҳ��һ�������������Խ�һ�����������߶����������������
* @ClassName: FilterChain
* @Description: TODO
* @author NewSong
* @date 2016��11��26�� ����9:54:31
*
 */
public class FilterChain implements Filter {
	private List<Filter> filters = new ArrayList<>();;

	public FilterChain addFilter(Filter filter) {
		filters.add(filter);
		return this;
	}

	public String doFilter(String str) {
		for (Filter filter : filters) {
			str = filter.doFilter(str);
		}
		return str;
	}

}
