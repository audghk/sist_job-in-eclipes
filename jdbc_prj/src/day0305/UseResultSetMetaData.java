package day0305;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import kr.co.sist.dao.DbConnection;

/**
 * 조회하는 테이블의 Schema 정보를 얻을 때 사용하는 객체,
 * desc 테이블명 수준의 정보를 얻는다. 더 자세한 정보를 얻을 때는 DD를 사용해야한다.
 */
public class UseResultSetMetaData {
	
	public UseResultSetMetaData() throws SQLException {
		//EMP테이블의 MetaData를 얻기
		DbConnection dbCon=DbConnection.getInstance();
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		//1. 
		try {
			//2.
			String id="scott";
			String pass="tiger";
			con=dbCon.getConnection(id, pass);
			//3. 바인드변수는 값과 묶이는 변수로 값은 설정할 수 있지만, 컬럼명이나 테이블명에는 사용할 수 없다.
			String tname="dept";
//			String selectEmp="select * from ?"; //bind 변수로는 사용할 수 없다.
			String selectEmp="select * from "+tname;
			pstmt=con.prepareStatement(selectEmp);
			//4.
			//바인드변수에 값 설정
//			pstmt.setString(1, tname);
			rs=pstmt.executeQuery();
			//ResultSetMetaData를 얻는다.
			ResultSetMetaData rsmd=rs.getMetaData();
			System.out.println("컬럼의 수 : "+rsmd.getColumnCount());
			System.out.println("컬럼명 : "+rsmd.getColumnName(1));
			System.out.println("컬럼데이터형 : "+rsmd.getColumnTypeName(1));
			System.out.println("컬럼 크기 : "+rsmd.getPrecision(1));
			System.out.println("null 허용 : "+rsmd.isNullable(1));
			
			StringBuilder output = new StringBuilder();
			output.append(tname).append("테이블의 정보\n");
			output.append("컬럼명\tnull 허용\t데이터형\n");
			int size=0;
			for(int i=1; i<= rsmd.getColumnCount(); i++) {
				output.append(rsmd.getColumnName(i)).append("\t")
					  .append(rsmd.isNullable(i)==0?"Not Null":"").append("\t")
					  .append(rsmd.getColumnTypeName(i));				  
				if(size != 0) {
					output.append("(").append(size).append(")");
				}
				output.append("\n");						
			}//end for
			
			JTextArea jta = new JTextArea(output.toString(), 10, 50);
			JScrollPane jsp = new JScrollPane(jta);
			JOptionPane.showMessageDialog(null, jsp);
			//5.
			
		}finally {
			//6.
			dbCon.dbClose(rs, pstmt, con);
		}
	}//UseResultSetMetaData
	
	public static void main(String[] args) {
		try {
			new UseResultSetMetaData();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}