package templatemethod.sample2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import templatemethod.sample2.dependency.JDBCUtils;

public abstract class AbstractDAO {	
	//ģ�巽��
	protected final Object find(String sql,Object []params) throws Exception {
		Connection c = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Object obj = null;
		try {
			c = JDBCUtils.getConn();
			pstmt = c.prepareStatement(sql);
			for(int i = 0; i<params.length;i++){
				pstmt.setObject(i+1, params[i]);
			}
			rs = pstmt.executeQuery();
			if (rs.next()) {
				obj = mappingResultSet(rs); //��Ϊ���ӷ���
				//��������A������A��������������B������B����
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage(),e);
		} finally {
			JDBCUtils.free(rs, pstmt, c);
		}
		return obj;
	}	
	abstract protected Object mappingResultSet(ResultSet rs) throws SQLException ;
}
