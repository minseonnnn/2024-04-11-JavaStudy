package com.sist.dao;
// => 기능 (오라클 연결 => 사용자 요청에 맞는 데이터를 찾아온다) 
import java.util.*; // ArrayList
import java.sql.*; // 오라클 연결하는 라이브러리 
/*
 *   데이터베이스 연동
 *   jdbc => dbcp => orm
 *                  ----- MyBatis(SQL문장이 있다 => 반복기능 제거) / JPA(SQL없이 수행)
 *    | 1차   | 2차         | 3차                               | 개인                
 */
public class ZipcodeDAO {
    // 오라클 연결 클래스 
	private Connection conn;
	// SQL 전송하는 클래스 (결과값 받기)
	private PreparedStatement ps; //SQL전송 = 결과값 읽기
	// 오라클 연결 => URL (오라클 주소) thin => 연결만 하는 드라이버 
	/*
	 *    localhost => 본인 컴퓨터 => IP 
	 *    1521:PORT , 1433(MS-SQL) , 3306(MySQL,MariaDB)
	 *    XE : table저장된 데이터베이스 => ORCL/ORA
	 *    ---------- 연습용 => 무료 
	 */
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	// 1. 드라이버 등록 => 한번만 등록 => 생성자 
	public ZipcodeDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {}
	}
	// 2. 오라클 연결
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
			// conn hr/happy
		}catch(Exception ex) {}
	}
	// 3. 오라클 연결 해제
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close(); //통신 중단
			if(conn!=null) conn.close(); // conn(전화기)
		}catch(Exception ex) {}
	}
	// ------------------------------------- 공통 사항 => 클래스화 => 라이브러리로 제작 .jar   
	// 4. 기능 설정 
	// => 우편번호 검색 / 우편번호 검색 갯수 
	public ArrayList<ZipcodeVO> postFind(String dong)
	{
		ArrayList<ZipcodeVO> list=new ArrayList<ZipcodeVO>();
		try
		{
			// 오라클 연결 => 값을 읽기
			// 1. 오라클 연결
			getConnection();
			// 2. SQL문장
			String sql="SELECT zipcode,sido,gugun,dong,NVL(bunji,' ') "
					  +"FROM zipcode "
					  +"WHERE dong LIKE '%'||?||'%'";
                      // WHERE dong LIKE CONCAT('%',?,'%') => MYSQL/MariaDB
			          // NVL => ISNULL
			ps=conn.prepareStatement(sql); // 미리 SQL문장을 전송하고 나중에 값을 채워준다
			//                                                  -------- ?
			ps.setString(1, dong); // ?에 값을 채워서 실행 요청 
			// 오라클에 실행 요청 => 결과값을 메모리에 저장 => ResultSet
			ResultSet rs=ps.executeQuery();
			// 메모리 => 커서의 위치 마지막에 존재 => 첫째줄로 이동 => next() 
			while(rs.next())
			{
				ZipcodeVO vo=new ZipcodeVO();
				vo.setZipcode(rs.getString(1));
				vo.setSido(rs.getString(2));
				vo.setGugun(rs.getString(3));
				vo.setDong(rs.getString(4));
				vo.setBunji(rs.getString(5));
				list.add(vo);
			}
			rs.close(); // 메모리 닫기 
		}catch(Exception ex)
		{
			// 에러 확인
			ex.printStackTrace();
		}
		finally
		{
			// 닫기
			disConnection();
		}
		return list;
	}
}
